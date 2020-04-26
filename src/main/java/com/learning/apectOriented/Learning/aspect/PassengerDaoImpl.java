package com.learning.apectOriented.Learning.aspect;

import java.util.HashMap;
import java.util.Map;

public class PassengerDaoImpl implements PassengerDao {
    public static final Map<Integer, Passenger> passengerMap = new HashMap<>();

    @Override
    public Passenger getPassenger(int id) {
        if (passengerMap.get(id) != null) {
            return passengerMap.get(id);
        }
        Passenger passenger = new Passenger(id);
        passengerMap.put(id, passenger);
        return passenger;
    }
}
