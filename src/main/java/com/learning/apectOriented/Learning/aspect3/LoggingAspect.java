package com.learning.apectOriented.Learning.aspect3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* *.*Passenger(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] methodsArgs = proceedingJoinPoint.getArgs();
        logger.info("Call method " + methodName + " with arg " + methodsArgs[0]);
        Object result = proceedingJoinPoint.proceed();
        logger.info("Method " + methodName + " returns " + result);
        return result;
    }
}
