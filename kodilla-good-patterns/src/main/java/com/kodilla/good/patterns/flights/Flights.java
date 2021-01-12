package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Flights
{
    private final List<Flight> flightsList = new ArrayList<>();
    private final List<IntermediateFlight> intermediateFlights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flightsList.add(flight);
    }

    public void addIntermediateFlight(IntermediateFlight intermediateFlight) {
        intermediateFlights.add(intermediateFlight);
    }

    public List<Flight> getFlightsList() {
        return flightsList;
    }

    public List<IntermediateFlight> getIntermediateFlights() {
        return intermediateFlights;
    }

}
