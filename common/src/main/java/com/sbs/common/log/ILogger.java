package com.sbs.common.log;

/**
 * Created by Administrator on 2018/4/1.
 */
public interface ILogger {

    IDebugLogger debug();

    IOperateLogger operate();

    IRuntimeLgger runtime();

    ISecurityLogger security();
}
