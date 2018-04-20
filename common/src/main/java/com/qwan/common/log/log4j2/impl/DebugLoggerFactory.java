package com.qwan.common.log.log4j2.impl;

import com.qwan.common.log.AbstractLoggerFactory;
import com.qwan.common.log.IDebugLogger;
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
