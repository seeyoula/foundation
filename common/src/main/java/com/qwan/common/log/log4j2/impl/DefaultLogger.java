package com.qwan.common.log.log4j2.impl;

import com.qwan.common.log.*;
import org.apache.logging.log4j.spi.LoggerContext;

/**
 * Created by Administrator on 2018/4/3.
 */
public class DefaultLogger implements ILogger
{
    private String clazz;

    protected DefaultLogger(String name, LoggerContext context)
    {
        this.clazz = name;
    }

    @Override
    public IDebugLogger debug()
    {
        return LoggerFactory.getDebugLog(clazz);
    }

    @Override
    public IOperateLogger operate()
    {
        return LoggerFactory.getOperate(clazz);
    }

    @Override
    public IRuntimeLgger runtime()
    {
        return LoggerFactory.getRuntime(clazz);
    }

    @Override
    public ISecurityLogger security()
    {
        return LoggerFactory.getSecurity(clazz);
    }
}
