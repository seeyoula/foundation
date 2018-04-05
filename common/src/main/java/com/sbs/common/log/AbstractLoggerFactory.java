package com.sbs.common.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.spi.AbstractLoggerAdapter;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.util.StackLocatorUtil;

/**
 * Created by Administrator on 2018/4/1.
 */
public abstract class AbstractLoggerFactory<T> extends AbstractLoggerAdapter<T> implements ILoggerFactory {

    private static final String FQCN = AbstractLoggerFactory.class.getName();

    protected LoggerContext getContext() {
        Class anchor = StackLocatorUtil.getCallerClass(FQCN, "com.sbs.common.log");
        return anchor == null ? LogManager.getContext() : getContext(StackLocatorUtil.getCallerClass(anchor));
    }
}
