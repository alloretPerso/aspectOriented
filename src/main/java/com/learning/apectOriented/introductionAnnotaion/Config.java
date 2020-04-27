package com.learning.apectOriented.introductionAnnotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public FlightAspect aspect(){
        return new FlightAspect();
    }
    @Bean
    public Flight flight(){
        Flight flight = new Flight();
        flight.setId("AA1234");
        flight.setCompany("ABC flight");
        return flight;
    }
}
