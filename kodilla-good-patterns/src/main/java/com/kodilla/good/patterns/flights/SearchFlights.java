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
                .filter(f -> arrival.equals(f.getArrivalAirport()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightDeparture(String departure)
    {
        return flights.getFlightsList().stream()
                .filter(f -> departure.equals(f.getDepartureAirport()))
                .collect(Collectors.toList());
    }

    public List<IntermediateFlight> findFlightStopover(String arrival, String departure, String stopoverAirport)
    {
        return flights.getIntermediateFlights().stream()
                .filter(f -> departure.equals(f.getDepartureAirport()))
                .filter(f -> arrival.equals(f.getArrivalAirport()))
                .filter(f -> stopoverAirport.equals(f.getStopoverAirport()))
                .collect(Collectors.toList());
    }
}

