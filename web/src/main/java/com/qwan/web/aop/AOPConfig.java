/*
 * 文件名：AOPConfig.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： AOPConfig.java
 * 修改人：Administrator
 * 修改时间：2018/4/6
 */
package com.qwan.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version foundation V001R001 2018/4/6
 */
@Configuration
@Aspect
public class AOPConfig
{
    @Around("@within(org.springframework.web.bind.annotation.RestController )")
    public Object simpleAOP(final ProceedingJoinPoint pjp) throws Throwable
    {
        try
        {
            Object[] args = pjp.getArgs();
            System.out.println("args:" + Arrays.asList(args));

            Object o = pjp.proceed();
            System.out.println(o);
            return o;
        }
        catch (Throwable e)
        {
            throw e;
        }
    }
}
