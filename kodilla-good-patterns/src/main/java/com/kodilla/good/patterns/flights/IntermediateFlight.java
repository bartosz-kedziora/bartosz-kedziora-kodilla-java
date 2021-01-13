package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class IntermediateFlight
{
    private final String departureAirport;
    private final String arrivalAirport;
    private final String stopoverAirport;

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getStopoverAirport() {
        return stopoverAirport;
    }

    public IntermediateFlight(String departureAirport, String arrivalAirport, String stopoverAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.stopoverAirport = stopoverAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntermediateFlight that = (IntermediateFlight) o;
        return Objects.equals(departureAirport, that.departureAirport) &&
                Objects.equals(arrivalAirport, that.arrivalAirport) &&
                Objects.equals(stopoverAirport, that.stopoverAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport, stopoverAirport);
    }

    @Override
    public String toString() {
        return "IntermediateFlight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", stopoverAirport='" + stopoverAirport + '\'' +
                '}';
    }
}
