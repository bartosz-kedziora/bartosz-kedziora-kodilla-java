package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlights
{
    private final Flights flights;

    public SearchFlights(Flights flights) {
        this.flights = flights;
    }

    public List<Flight> getArrival(String arrival) {
        return flights.getFlightsList().stream()
                .filter(f -> arrival.equals(f.getFlightRoute().get(f.getFlightRoute().size() - 1)))
                .collect(Collectors.toList());
    }
    public List<Flight> getDepature(String depature) {
        return flights.getFlightsList().stream()
                .filter(f -> depature.equals(f.getFlightRoute().get(0)))
                .collect(Collectors.toList());
    }

    public List<Flight> getStopovers(String stopovers) {
        return flights.getFlightsList().stream()
                .filter(f -> !stopovers.equals(f.getFlightRoute().get(0)))
                .filter(f -> !stopovers.equals(f.getFlightRoute().get(f.getFlightRoute().size() - 1)))
                .filter(f -> f.getFlightRoute().contains(stopovers))
                .collect(Collectors.toList());
    }

    public List<Flight> getViaStopovers(String stopover, String arrival, String depature) {
        return flights.getFlightsList().stream()
                .filter(f -> depature.equals(f.getFlightRoute().get(0)))
                .filter(f -> arrival.equals(f.getFlightRoute().get(f.getFlightRoute().size() - 1)))
                .filter(f -> f.getFlightRoute().contains(stopover))
                .filter(f -> f.getFlightRoute().size()==3)
                .collect(Collectors.toList());
    }
}
