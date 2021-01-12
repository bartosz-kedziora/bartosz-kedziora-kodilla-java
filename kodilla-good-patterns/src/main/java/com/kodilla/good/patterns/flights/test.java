package com.kodilla.good.patterns.flights;

public class test
{
    public static void main(String[] args) {
        Flight flight1 = new Flight("Krakow" , "Gdansk");
        Flight flight2 = new Flight("Krakow" , "Warszawa");
        IntermediateFlight intermediateFlight1 = new IntermediateFlight("Krakow" , "Warszawa", "Poznan");

        Flights flights = new Flights();
        flights.addFlight(flight1);
        flights.addFlight(flight2);
        flights.addIntermediateFlight(intermediateFlight1);

        SearchFlights searchFlights = new SearchFlights(flights);
        System.out.println(searchFlights.findFlightArrival("Gdansk"));
        System.out.println(searchFlights.findFlightDeparture("Krakow"));
        System.out.println(searchFlights.findFlightStopover("Warszawa", "Krakow"));
    }

}
