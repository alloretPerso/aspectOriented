package com.learning.apectOriented.cache;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Order(3)
@Aspect
public class CachingAspect {

    @Around("execution(* com.learning.apectOriented.cache.PassengerDaoImpl.getPassenger(..))")
    public void cachePassenger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] methodArgs = proceedingJoinPoint.getArgs();
        Passenger result = (Passenger) proceedingJoinPoint.proceed();

        int id = (Integer) methodArgs[0];
        if (!PassengerDaoImpl.getPassengerMap().containsKey(id)) {
            PassengerDaoImpl.getPassengerMap().put(id, result);
        }
    }
}
