package com.learning.apectOriented.introductionAnnotaion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = com.learning.apectOriented.introductionAnnotaion.Config.class)
class FlyerTest {

    @Autowired
    private Flight flight;

    @Test
    public void flyerTest(){
        assertTrue(flight instanceof Flight);
        System.out.println(flight.getCompany());
        System.out.println(flight.getId());

        assertTrue(flight instanceof Flyer);
        ((Flyer)flight).fly();
        ((Flyer)flight).takeOff();
        ((Flyer)flight).land();

        System.out.println(flight.getClass().getName());
    }
}