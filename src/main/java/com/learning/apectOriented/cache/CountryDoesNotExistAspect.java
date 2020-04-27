package com.learning.apectOriented.cache;

import com.learning.apectOriented.CrossCuttingConcerns.aspects.LoggingAspect2;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class CountryDoesNotExistAspect {
    private Logger logger = Logger.getLogger(CountryDoesNotExistAspect.class.getName());

    @AfterThrowing(
            pointcut = "execution(* com.learning.apectOriented.cache.PassengerDaoImpl.insert(..))",
            throwing = "ex")
    public void log(CountryDoesNotExistException ex){
        logger.severe("Attempt to insert a passenger with an unexisting country "+ ex.getCountryCode());
    }
}
