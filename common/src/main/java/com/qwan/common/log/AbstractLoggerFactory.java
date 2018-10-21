package com.qwan.common.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.spi.AbstractLoggerAdapter;
import org.apache.logging.log4j.spi.LoggerContext;

/**
 * Created by Administrator on 2018/4/1.
 */
public abstract class AbstractLoggerFactory<T> extends AbstractLoggerAdapter<T> implements ILoggerFactory<T>
{
    protected LoggerContext getContext()
    {
        return LogManager.getContext();
    }
}
