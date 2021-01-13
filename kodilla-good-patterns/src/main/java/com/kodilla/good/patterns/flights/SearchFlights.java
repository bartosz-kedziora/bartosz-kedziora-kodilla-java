package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFlights
{
    private final Flights flights;

    public SearchFlights(Flights flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightArrival(String arrival) {
        return flights.getFlightsList().stream()
                .filter(f -> arrival.equals(f.getArrivalAirport()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightDeparture(String departure) {
        return flights.getFlightsList().stream()
                .filter(f -> departure.equals(f.getDepartureAirport()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightStopover(String arrival, String departure, String stopoverAirport) {
                List<Flight> flightStopovers = new ArrayList<>();

                List<Flight> flightStopoversTo = flights.getFlightsList().stream()
                .filter(f -> departure.equals(f.getDepartureAirport()))
                .filter(f -> stopoverAirport.equals(f.getArrivalAirport()))
                .collect(Collectors.toList());

                List<Flight> flightStopoversFrom = flights.getFlightsList().stream()
                .filter(f -> stopoverAirport.equals(f.getDepartureAirport()))
                .filter(f -> arrival.equals(f.getArrivalAirport()))
                .collect(Collectors.toList());

                flightStopovers.addAll(flightStopoversTo);
                flightStopovers.addAll(flightStopoversFrom);

                return flightStopovers;
    }
}

