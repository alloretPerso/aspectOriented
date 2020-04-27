package com.learning.apectOriented.CrossCuttingConcerns;

public class Passenger {
    private String name;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
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

    public void setCountry(String country) {
        this.country = country;
    }
}
