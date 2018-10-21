package com.qwan.common.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by Administrator on 2018/4/1.
 */
public class LoggerTest {
    private static final Logger logger = LogManager.getLogger(LoggerTest.class);

    public static final IRuntimeLgger runtime = LoggerFactory.getRuntime(LoggerTest.class);

    public static final IDebugLogger DEBUGGER = LoggerFactory.getDebugLog(LoggerTest.class);

    @Test
    public void test_debugger() {
        DEBUGGER.debug("Hello with no params log.");
        DEBUGGER.debug("Hello with exception.", new RuntimeException("Test message"));
        DEBUGGER.debug("Hello with param: {}", "world");
        DEBUGGER.debug("Hello with multi params and exception:[{} {} {}]", "param1", "param2", "param3", new RuntimeException("multi params test"));
        DEBUGGER.debug(() -> "Hello with supplier");
        DEBUGGER.debug(() -> "Hello with supplier and exception", new RuntimeException("Test Supplier"));
        DEBUGGER.info("Hello with no params log.");
        DEBUGGER.info("Hello with exception.", new RuntimeException("Test message"));
        DEBUGGER.info("Hello with param: {}", "world");
        DEBUGGER.info("Hello with multi params and exception:[{} {} {}]", "param1", "param2", "param3", new RuntimeException("multi params test"));
        DEBUGGER.info(() -> "Hello with supplier");
        DEBUGGER.info(() -> "Hello with supplier and exception", new RuntimeException("Test Supplier"));
        DEBUGGER.warn("Hello with no params log.");
        DEBUGGER.warn("Hello with exception.", new RuntimeException("Test message"));
        DEBUGGER.warn("Hello with param: {}", "world");
        DEBUGGER.warn("Hello with multi params and exception:[{} {} {}]", "param1", "param2", "param3", new RuntimeException("multi params test"));
        DEBUGGER.warn(() -> "Hello with supplier");
        DEBUGGER.warn(() -> "Hello with supplier and exception", new RuntimeException("Test Supplier"));
        DEBUGGER.error("Hello with no params log.");
        DEBUGGER.error("Hello with exception.", new RuntimeException("Test message"));
        DEBUGGER.error("Hello with param: {}", "world");
        DEBUGGER.error("Hello with multi params and exception:[{} {} {}]", "param1", "param2", "param3", new RuntimeException("multi params test"));
        DEBUGGER.error(() -> "Hello with supplier");
        DEBUGGER.error(() -> "Hello with supplier and exception", new RuntimeException("Test Supplier"));
        DEBUGGER.fatal("Hello with no params log.");
        DEBUGGER.fatal("Hello with exception.", new RuntimeException("Test message"));
        DEBUGGER.fatal("Hello with param: {}", "world");
        DEBUGGER.fatal("Hello with multi params and exception:[{} {} {}]", "param1", "param2", "param3", new RuntimeException("multi params test"));
        DEBUGGER.fatal(() -> "Hello with supplier");
        DEBUGGER.fatal(() -> "Hello with supplier and exception", new RuntimeException("Test Supplier"));

//        for (int i = 0; i < 100; i++)
//        {
//            DEBUGGER.debug("xxxxxx");
//            try
//            {
//                Thread.sleep(1000L);
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//        }
    }

    @Test
    public void test_logger_001()
    {
        ILogger logger = LoggerFactory.getLogger(LoggerTest.class);
        logger.debug().debug("Test");
    }

}
