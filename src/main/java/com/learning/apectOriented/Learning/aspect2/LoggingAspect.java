package com.learning.apectOriented.Learning.aspect2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Before("execution(* com.learning.apectOriented.Learning.aspect1.PassengerDao.*(..))")
    public final void before() {
        logger.info("Entering method via annotation");
    }

    @After("execution(* com.learning.apectOriented.Learning.aspect1..*.*Passenger(..))")
    public final void after() {
        logger.info("Exiting method via annotation");
    }
}
