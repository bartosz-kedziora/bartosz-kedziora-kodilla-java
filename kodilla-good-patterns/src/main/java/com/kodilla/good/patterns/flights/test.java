package com.kodilla.good.patterns.flights;

public class test
{
    public static void main(String[] args) {
        Flight flight1 = new Flight(new String[]{"Krakow" , "Gdansk"});
        Flight flight2 = new Flight(new String[]{"Krakow" , "Warszawa", "Gdansk"});
        Flight flight3 = new Flight(new String[]{"Krakow" , "Warszawa", "Poznan", "Gdansk"});

        Flights flights = new Flights();
        flights.addFlight(flight1);
        flights.addFlight(flight2);
        flights.addFlight(flight3);

        SearchFlights searchFlights = new SearchFlights(flights);

        System.out.println(searchFlights.getStopovers("Warszawa"));
        System.out.println(searchFlights.getViaStopovers("Warszawa", "Gdansk" , "Krakow"));
    }

}
