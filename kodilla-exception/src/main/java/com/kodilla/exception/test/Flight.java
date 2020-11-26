package com.kodilla.exception.test;

public class Flight
{
    private final String departureAirport;
    private final String arrivalAirport;

    public String getDepartureAirport()
    {
        return departureAirport;
    }

    public String getArrivalAirport()
    {
        return arrivalAirport;
    }

    public Flight(String departureAirport, String arrivalAirport)
    {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }
}
