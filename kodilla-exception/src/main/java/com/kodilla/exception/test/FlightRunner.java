package com.kodilla.exception.test;

public class FlightRunner
{
    public static void main(String[] args)
    {
        Airport airport = new Airport();

        Flight flight1 = new Flight("Cracow","Warsaw");
        Flight flight2 = new Flight("Oslo","Paris");
        Flight flight3 = new Flight("Berlin","Barcelona");

        try
        {
            airport.findFilght(flight1);
            airport.findFilght(flight2);
            airport.findFilght(flight3);
        }

        catch (RouteNotFoundException e)
        {
            System.out.println("Exception: route is not available");
        }
    }
}
