package com.learning.apectOriented.CrossCuttingConcerns;

public class Ticket {
    private String number;
    private Passenger passenger;

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", passenger=" + passenger +
                '}';
    }

    public final String emittingCountry() {
        return passenger.getCountry();
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
