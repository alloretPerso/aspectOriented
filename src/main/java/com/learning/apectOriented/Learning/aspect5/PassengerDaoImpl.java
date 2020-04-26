package com.learning.apectOriented.Learning.aspect5;

import com.learning.apectOriented.Learning.aspect1.Passenger;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("passengerDao")
public class PassengerDaoImpl implements PassengerDao {
    public static final Map<Integer, Passenger> passengerMap = new HashMap<>();

    @Override
    public Passenger getPassenger(int id) {
        if (passengerMap.get(id) != null) {
            return passengerMap.get(id);
        }
        if (id<1) throw new RuntimeException("incorrect id");
        Passenger passenger = new Passenger(id);
        passengerMap.put(id, passenger);
        return passenger;
    }
}
