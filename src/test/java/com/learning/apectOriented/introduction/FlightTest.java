package com.learning.apectOriented.introduction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class FlightTest {
    @Test
    public void flyerTest() {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("aop4.xml");
        Flight flight = (Flight) context.getBean("flight");
        FlyerAdvisor flyerAdvisor = new FlyerAdvisor();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(flight);
        proxyFactory.addAdvisor(flyerAdvisor);
        proxyFactory.setOptimize(true);

        Flight proxyFlight= (Flight) proxyFactory.getProxy();
        Assertions.assertTrue(proxyFlight instanceof  Flight);
        System.out.println(proxyFlight.getCompany());
        System.out.println(proxyFlight.getId());

        ((Flyer)proxyFlight).fly();
        ((Flyer)proxyFlight).takeOff();
        ((Flyer)proxyFlight).land();
        System.out.println(proxyFlight.getClass().getName());
        context.close();
    }
}