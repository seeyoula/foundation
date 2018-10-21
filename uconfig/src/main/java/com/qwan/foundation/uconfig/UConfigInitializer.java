/*
 * 文件名：UConfigInitializer.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved. 
 * 描述： UConfigInitializer.java
 * 修改人：Administrator
 * 修改时间：2018/5/9
 */
package com.qwan.foundation.uconfig;

import com.qwan.common.log.IDebugLogger;
import com.qwan.common.log.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

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
 * @version foundation V001R001 2018/5/9
 */
public class UConfigInitializer implements ApplicationContextInitializer
{
    private static final IDebugLogger logger = LoggerFactory.getDebugLog(UConfigInitializer.class);

    @Override
    public void initialize(ConfigurableApplicationContext context)
    {
        logger.info("UConfiguration initializing...");
//        context.getBeansOfType()
    }
}
