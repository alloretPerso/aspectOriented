package com.learning.apectOriented.cache;


public interface PassengerDao {
    Passenger getPassenger(int id);
    void insert(Passenger passenger);
}
