package com.sbs.common.log.log4j2;

import com.sbs.common.log.AbstractLoggerFactory;
import com.sbs.common.log.ILogger;
import org.apache.logging.log4j.spi.LoggerContext;

/**
 * Created by Administrator on 2018/4/3.
 */
public class DefaultLoggerFactory extends AbstractLoggerFactory<ILogger>
{
    /**
     * Creates a new named logger for a given {@link LoggerContext}.
     *
     * @param name    the name of the logger to create
     * @param context the LoggerContext this logger will be associated with
     * @return the new named logger
     */
    @Override
    protected ILogger newLogger(String name, LoggerContext context)
    {
        return new DefaultLogger(name, context);
    }
}
