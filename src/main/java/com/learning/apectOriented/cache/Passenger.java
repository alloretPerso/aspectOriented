package com.learning.apectOriented.cache;

public class Passenger {
    private String name;
    private String country;

    public Passenger() {
    }
    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
