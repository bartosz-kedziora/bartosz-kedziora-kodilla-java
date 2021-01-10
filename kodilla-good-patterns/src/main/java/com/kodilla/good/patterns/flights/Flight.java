package com.kodilla.good.patterns.flights;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Flight  {
    private final List<String> flightRoute;

    public List<String> getFlightRoute() {
        return flightRoute;
    }

    public Flight(String[] flightRoute) {
        this.flightRoute = Arrays.asList(flightRoute);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightRoute, flight.flightRoute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightRoute);
    }

    @Override
    public String toString() {
        return "Flight Route = " + flightRoute;
    }
}
