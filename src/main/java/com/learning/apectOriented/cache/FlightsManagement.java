package com.learning.apectOriented.cache;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FlightsManagement {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aop3.xml");
/*        Flight flight = (Flight) context.getBean("flight");
        flight.print();
        System.out.println(flight.getId());
        flight.setId("AA5678");

        System.out.println(flight.getCompany());
        for (Passenger passenger : flight.getPassengers()) {
            System.out.println(passenger.getName());
            passenger.print();
        }
        Ticket ticket = (Ticket) context.getBean("ticket");
        ticket.setNumber("0987654321");*/

        PassengerDao passengerDaoImpl = (PassengerDao) context.getBean("passengerDaoImpl");
        passengerDaoImpl.getPassenger(1);
        passengerDaoImpl.getPassenger(1);

        Passenger passenger = new Passenger();
        passenger.setName("Mike");
        passenger.setCountry("ZZ");
        passengerDaoImpl.insert(passenger);
        context.close();
    }
}
