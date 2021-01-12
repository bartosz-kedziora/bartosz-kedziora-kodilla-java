package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class IntermediateFlight
{
    private final String departure;
    private final String arrival;
    private final String stopover;

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getStopover() {
        return stopover;
    }

    public IntermediateFlight(String departure, String arrival, String stopover) {
        this.departure = departure;
        this.arrival = arrival;
        this.stopover = stopover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntermediateFlight that = (IntermediateFlight) o;
        return Objects.equals(departure, that.departure) &&
                Objects.equals(arrival, that.arrival) &&
                Objects.equals(stopover, that.stopover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival, stopover);
    }

    @Override
    public String toString() {
        return "IntermediateFlight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", stopover='" + stopover + '\'' +
                '}';
    }


}
