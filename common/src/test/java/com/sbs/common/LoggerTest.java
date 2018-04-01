package com.sbs.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by Administrator on 2018/4/1.
 */
public class LoggerTest
{
    private static final Logger logger = LogManager.getLogger(LoggerTest.class);

    @Test
    public void test_logger1()
    {
        logger.debug("Hello World!!!");
    }
}
