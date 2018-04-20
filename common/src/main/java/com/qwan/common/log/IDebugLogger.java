package com.qwan.common.log;

import org.apache.logging.log4j.util.Supplier;

/**
 * Created by Administrator on 2018/4/1.
 */
public interface IDebugLogger
{
    void debug(String message);

    void debug(String message, Throwable e);

    void debug(String message, Object... params);

    void debug(String message, Supplier<?>... suppliers);

    void debug(Supplier<?> supplier);

    void debug(Supplier<?> supplier, Throwable e);

    void info(String message);

    void info(String message, Throwable e);

    void info(String message, Object... params);

    void info(String message, Supplier<?>... suppliers);

    void info(Supplier<?> supplier);

    void info(Supplier<?> supplier, Throwable e);

    void warn(String message);

    void warn(String message, Throwable e);

    void warn(String message, Object... params);

    void warn(String message, Supplier<?>... suppliers);

    void warn(Supplier<?> supplier);

    void warn(Supplier<?> supplier, Throwable e);

    void error(String message);

    void error(String message, Throwable e);

    void error(String message, Object... params);

    void error(String message, Supplier<?>... suppliers);

    void error(Supplier<?> supplier);

    void error(Supplier<?> supplier, Throwable e);

    void fatal(String message);

    void fatal(String message, Throwable e);

    void fatal(String message, Object... params);

    void fatal(String message, Supplier<?>... suppliers);

    void fatal(Supplier<?> supplier);

    void fatal(Supplier<?> supplier, Throwable e);
}
