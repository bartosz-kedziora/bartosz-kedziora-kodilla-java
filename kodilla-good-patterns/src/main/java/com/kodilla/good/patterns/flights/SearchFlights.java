package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlights
{
    private final Flights flights;

    public SearchFlights(Flights flights) {
        this.flights = flights;
    }
    public List<Flight> findFlightArrival(String arrival)
    {
        return flights.getFlightsList().stream()
                .filter(f -> arrival.equals(f.getArrival()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightDeparture(String departure)
    {
        return flights.getFlightsList().stream()
                .filter(f -> departure.equals(f.getDeparture()))
                .collect(Collectors.toList());
    }

    public List<IntermediateFlight> findFlightStopover(String arrival, String departure)
    {
        return flights.getIntermediateFlights().stream()
                .filter(f -> departure.equals(f.getDeparture()))
                .filter(f -> arrival.equals(f.getArrival()))
                .collect(Collectors.toList());
    }
}

