package com.sbs.common.log.log4j2;

import com.sbs.common.log.AbstractLoggerFactory;
import com.sbs.common.log.IRuntimeLgger;
import org.apache.logging.log4j.spi.LoggerContext;

/**
 * Created by Administrator on 2018/4/3.
 */
public class RuntimeLoggerFactory extends AbstractLoggerFactory<IRuntimeLgger>
{

    /**
     * Creates a new named logger for a given {@link LoggerContext}.
     *
     * @param name    the name of the logger to create
     * @param context the LoggerContext this logger will be associated with
     * @return the new named logger
     */
    @Override
    protected IRuntimeLgger newLogger(String name, LoggerContext context)
    {
        return new RuntimeLoggerImpl(name, context);
    }
}
