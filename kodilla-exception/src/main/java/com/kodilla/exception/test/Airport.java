package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Airport
{
    void findFilght (Flight flight) throws RouteNotFoundException
    {
        Map<String, Boolean> airportAccessibility = new HashMap<>();
        airportAccessibility.put("Cracow", Boolean.TRUE);
        airportAccessibility.put("Oslo", Boolean.TRUE);
        airportAccessibility.put("Warsaw", Boolean.TRUE);
        airportAccessibility.put("Paris", Boolean.TRUE);
        airportAccessibility.put("Madrid", Boolean.TRUE);

        if(airportAccessibility.containsKey(flight.getDepartureAirport())
                &&airportAccessibility.containsKey(flight.getArrivalAirport()))
        {
            System.out.println("Route from: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
            System.out.println("Route is available");
            System.out.println("---------------------------------");
        }
        else
        {
            System.out.println("Route from: " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
            throw new RouteNotFoundException();
        }
    }
}
