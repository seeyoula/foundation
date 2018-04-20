/*
 * 文件名：LogRollingFileMonitor.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： LogRollingFileMonitor.java
 * 修改人：Administrator
 * 修改时间：2018/4/14
 */
package com.qwan.common.log.log4j2.policy;

import org.apache.logging.log4j.core.Core;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.rolling.AbstractTriggeringPolicy;
import org.apache.logging.log4j.core.appender.rolling.RollingFileManager;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginBuilderAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginBuilderFactory;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

/**
 * Monitor the change of the log file
 * <p>
 * This is to make sure if delete the log file accident, then will auto create the file.
 * <p>
 * Log4j2 plugin
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version foundation V001R001 2018/4/14
 */
@Plugin(name = "FileMonitorPolicy", category = Core.CATEGORY_NAME, printObject = true)
public class LogRollingFileMonitor extends AbstractTriggeringPolicy
{
    public static class Builder implements org.apache.logging.log4j.core.util.Builder<LogRollingFileMonitor>
    {

        @PluginBuilderAttribute
        private int interval = 5;

        @PluginBuilderAttribute
        private long nextRolloverMillis;

        @Override
        public LogRollingFileMonitor build()
        {
            return new LogRollingFileMonitor(interval);
        }

        public int getInterval()
        {
            return interval;
        }

        public LogRollingFileMonitor.Builder withInterval(final int interval)
        {
            this.interval = interval;
            return this;
        }
    }

    private final int interval;

    private long nextRolloverMillis;

    private RollingFileManager manager;

    private LogRollingFileMonitor(final int interval)
    {
        this.interval = interval;
        this.nextRolloverMillis = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(interval);
    }

    public int getInterval()
    {
        return interval;
    }

    /**
     * Initializes the policy.
     *
     * @param aManager The RollingFileManager.
     */
    @Override
    public void initialize(final RollingFileManager aManager)
    {
        this.manager = aManager;
    }

    /**
     * Determines whether a rollover should occur.
     *
     * @param event A reference to the currently event.
     * @return true if a rollover should occur.
     */
    @Override
    public boolean isTriggeringEvent(final LogEvent event)
    {
        if (manager.getFileSize() == 0)
        {
            return false;
        }
        final long nowMillis = event.getTimeMillis();
        if (nowMillis >= nextRolloverMillis)
        {
            if (!Files.exists(Paths.get(manager.getFileName())))
            {
                return true;
            }
            nextRolloverMillis += TimeUnit.MINUTES.toMillis(interval);
        }
        return false;
    }

    @PluginBuilderFactory
    public static LogRollingFileMonitor.Builder newBuilder()
    {
        return new LogRollingFileMonitor.Builder();
    }

    @Override
    public String toString()
    {
        return "LogRollingFileMonitor(interval=" + interval + ")";
    }
}
