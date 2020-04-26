package com.learning.apectOriented.Learning.aspect4;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengersManager {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("aop.xml");
        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao4");
        System.out.println(passengerDao.getPassenger(1));
        context.close();
    }
}
