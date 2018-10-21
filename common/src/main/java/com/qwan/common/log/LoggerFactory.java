package com.qwan.common.log;

import com.qwan.common.log.log4j2.impl.*;

public final class LoggerFactory
{
    private static final ILoggerFactory<IDebugLogger> debugLoggerFactory = new DebugLoggerFactory();

    private static final ILoggerFactory<IRuntimeLgger> runtimeLoggerFactory = new RuntimeLoggerFactory();

    private static final ILoggerFactory<IOperateLogger> operateLoggerFactory = new OperateLoggerFactory();

    private static final ILoggerFactory<ISecurityLogger> securityLoggerFactory = new SecurityLoggerFactory();

    private static final ILoggerFactory<ILogger> loggerFactory = new DefaultLoggerFactory();

    public static IDebugLogger getDebugLog(Class clazz)
    {
        return debugLoggerFactory.getLogger(clazz.getCanonicalName());
    }

    public static IDebugLogger getDebugLog(String clazz)
    {
        return debugLoggerFactory.getLogger(clazz);
    }

    public static IRuntimeLgger getRuntime(Class clazz)
    {
        return runtimeLoggerFactory.getLogger(clazz.getCanonicalName());
    }

    public static IRuntimeLgger getRuntime(String clazz)
    {
        return runtimeLoggerFactory.getLogger(clazz);
    }

    public static IOperateLogger getOperate(Class clazz)
    {
        return operateLoggerFactory.getLogger(clazz.getCanonicalName());
    }

    public static IOperateLogger getOperate(String clazz)
    {
        return operateLoggerFactory.getLogger(clazz);
    }

    public static ISecurityLogger getSecurity(Class clazz)
    {
        return securityLoggerFactory.getLogger(clazz.getCanonicalName());
    }

    public static ISecurityLogger getSecurity(String clazz)
    {
        return securityLoggerFactory.getLogger(clazz);
    }

    public static ILogger getLogger(Class clazz)
    {
        return loggerFactory.getLogger(clazz.getCanonicalName());
    }

    public static ILogger getLogger(String clazz)
    {
        return loggerFactory.getLogger(clazz);
    }
}
