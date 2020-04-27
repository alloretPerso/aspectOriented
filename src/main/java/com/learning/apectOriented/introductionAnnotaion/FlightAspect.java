package com.learning.apectOriented.introductionAnnotaion;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class FlightAspect {
    @DeclareParents(
            value = "com.learning.apectOriented.introductionAnnotaion.Flight",
            defaultImpl = FlyerImpl.class)
    private Flyer flyer;
}