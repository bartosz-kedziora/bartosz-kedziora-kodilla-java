package com.kodilla.good.patterns.flights;

public class Test {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Krakow" , "Gdansk");
        Flight flight2 = new Flight("Gdansk" , "Warszawa");
        Flight flight3 = new Flight("Gdansk" , "Poznan");

        Flights flights = new Flights();
        flights.addFlight(flight1);
        flights.addFlight(flight2);
        flights.addFlight(flight3);

        SearchFlights searchFlights = new SearchFlights(flights);
        System.out.println(searchFlights.findFlightStopover("Warszawa", "Krakow", "Gdansk"));
    }
}
