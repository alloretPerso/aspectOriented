package com.learning.apectOriented.Learning.aspect1;

import java.util.logging.Logger;

public class LoggingAspect {
    public static final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public static final void before() {
        logger.info("Entering method");
    }

    public static final void after() {
        logger.info("Exiting method");
    }
}
