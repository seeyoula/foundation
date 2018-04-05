package com.sbs.common.log.log4j2;

import com.sbs.common.log.IDebugLogger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.util.Supplier;

/**
 * Created by Administrator on 2018/4/1.
 */
public class DebugLoggerImpl implements IDebugLogger
{

    private static final String FQCN = DebugLoggerImpl.class.getName();

    private transient ExtendedLogger logger;

    DebugLoggerImpl(String name, LoggerContext context)
    {
        this.logger = context.getLogger(name);
    }

    public void debug(String message)
    {
        this.logger.logIfEnabled(FQCN, Level.DEBUG, null, message, (Throwable)null);
    }

    @Override
    public void debug(String message, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.DEBUG, null, message, e);
    }

    @Override
    public void debug(String message, Object... params)
    {
        this.logger.logIfEnabled(FQCN, Level.DEBUG, null, message, params);
    }

    @Override
    public void debug(String message, Supplier<?>[] suppliers)
    {
        this.logger.logIfEnabled(FQCN, Level.DEBUG, null, message, suppliers);
    }

    @Override
    public void debug(Supplier<?> supplier)
    {
        this.logger.logIfEnabled(FQCN, Level.DEBUG, null, supplier, null);
    }

    @Override
    public void debug(Supplier<?> supplier, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.DEBUG, null, supplier, e);
    }

    public void info(String message)
    {
        this.logger.logIfEnabled(FQCN, Level.INFO, null, message, (Throwable)null);
    }

    @Override
    public void info(String message, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.INFO, null, message, e);
    }

    @Override
    public void info(String message, Object... params)
    {
        this.logger.logIfEnabled(FQCN, Level.INFO, null, message, params);
    }

    @Override
    public void info(String message, Supplier<?>[] suppliers)
    {
        this.logger.logIfEnabled(FQCN, Level.INFO, null, message, suppliers);
    }

    @Override
    public void info(Supplier<?> supplier)
    {
        this.logger.logIfEnabled(FQCN, Level.INFO, null, supplier, null);
    }

    @Override
    public void info(Supplier<?> supplier, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.INFO, null, supplier, e);
    }

    @Override
    public void warn(String message)
    {
        this.logger.logIfEnabled(FQCN, Level.WARN, null, message, (Throwable)null);
    }

    @Override
    public void warn(String message, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.WARN, null, message, e);
    }

    @Override
    public void warn(String message, Object... params)
    {
        this.logger.logIfEnabled(FQCN, Level.WARN, null, message, params);
    }

    @Override
    public void warn(String message, Supplier<?>[] suppliers)
    {
        this.logger.logIfEnabled(FQCN, Level.WARN, null, message, suppliers);
    }

    @Override
    public void warn(Supplier<?> supplier)
    {
        this.logger.logIfEnabled(FQCN, Level.WARN, null, supplier, null);
    }

    @Override
    public void warn(Supplier<?> supplier, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.WARN, null, supplier, e);
    }

    @Override
    public void error(String message)
    {
        this.logger.logIfEnabled(FQCN, Level.ERROR, null, message, (Throwable)null);
    }

    @Override
    public void error(String message, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.ERROR, null, message, e);
    }

    @Override
    public void error(String message, Object... params)
    {
        this.logger.logIfEnabled(FQCN, Level.ERROR, null, message, params);
    }

    @Override
    public void error(String message, Supplier<?>[] suppliers)
    {
        this.logger.logIfEnabled(FQCN, Level.ERROR, null, message, suppliers);
    }

    @Override
    public void error(Supplier<?> supplier)
    {
        this.logger.logIfEnabled(FQCN, Level.ERROR, null, supplier, null);
    }

    @Override
    public void error(Supplier<?> supplier, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.ERROR, null, supplier, e);
    }

    @Override
    public void fatal(String message)
    {
        this.logger.logIfEnabled(FQCN, Level.FATAL, null, message, (Throwable)null);
    }

    @Override
    public void fatal(String message, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.FATAL, null, message, e);
    }

    @Override
    public void fatal(String message, Object... params)
    {
        this.logger.logIfEnabled(FQCN, Level.FATAL, null, message, params);
    }

    @Override
    public void fatal(String message, Supplier<?>[] suppliers)
    {
        this.logger.logIfEnabled(FQCN, Level.FATAL, null, message, suppliers);
    }

    @Override
    public void fatal(Supplier<?> supplier)
    {
        this.logger.logIfEnabled(FQCN, Level.FATAL, null, supplier, null);
    }

    @Override
    public void fatal(Supplier<?> supplier, Throwable e)
    {
        this.logger.logIfEnabled(FQCN, Level.FATAL, null, supplier, e);
    }
}
