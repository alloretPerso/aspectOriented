package com.learning.apectOriented.cache;


import java.util.List;

public class Flight {
    private String id;
    private String company;
    private List<Passenger> passengers;

    public void setId(String id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public  void print() {
        for (Passenger passenger : passengers) {
            System.out.println(passenger);
        }
    }
}
