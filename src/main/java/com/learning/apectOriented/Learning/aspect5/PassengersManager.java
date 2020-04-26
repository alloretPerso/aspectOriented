package com.learning.apectOriented.Learning.aspect5;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengersManager {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("aop1.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
        System.out.println(passengerDao.getPassenger(0));
        context.close();
    }
}
