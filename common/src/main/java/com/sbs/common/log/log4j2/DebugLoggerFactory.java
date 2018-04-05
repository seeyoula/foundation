package com.sbs.common.log.log4j2;

import com.sbs.common.log.AbstractLoggerFactory;
import com.sbs.common.log.IDebugLogger;
import org.apache.logging.log4j.spi.LoggerContext;

/**
 * Created by Administrator on 2018/4/2.
 */
public class DebugLoggerFactory extends AbstractLoggerFactory<IDebugLogger>
{
    /**
     * Creates a new named logger for a given {@link LoggerContext}.
     *
     * @param name    the name of the logger to create
     * @param context the LoggerContext this logger will be associated with
     * @return the new named logger
     */
    @Override
    protected IDebugLogger newLogger(String name, LoggerContext context)
    {
        return new DebugLoggerImpl(name, context);
    }
}
