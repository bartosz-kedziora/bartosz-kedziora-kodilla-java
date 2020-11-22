package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite
{
    @Test
    void testGetPeopleQuantity()
    {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));

        Country usa = new Country("USA", new BigDecimal("250000000"));
        Country mexico = new Country("Mexcio", new BigDecimal("126000000"));

        Country brazil = new Country("Brazil", new BigDecimal("210000000"));
        Country argentina = new Country("Argentina", new BigDecimal("45000000"));

        Country nigeria = new Country("Nigeria", new BigDecimal("196000000"));
        Country rpa = new Country("RPA", new BigDecimal("58000000"));

        Country china = new Country("China", new BigDecimal("1400000000"));
        Country india = new Country("India", new BigDecimal("1350000000"));

        Country australia = new Country("Australia", new BigDecimal("25000000"));
        Country newealand = new Country("new Zealand", new BigDecimal("5000000"));

        Set<Country> countryEurope = new HashSet<>();
        countryEurope.add(poland);
        countryEurope.add(germany);

        Set<Country> countryNorthAmerica = new HashSet<>();
        countryNorthAmerica.add(usa);
        countryNorthAmerica.add(mexico);

        Set<Country> countrySouthAmerica = new HashSet<>();
        countrySouthAmerica.add(brazil);
        countrySouthAmerica.add(argentina);

        Set<Country> countryAfrica = new HashSet<>();
        countryAfrica.add(nigeria);
        countryAfrica.add(rpa);

        Set<Country> countryAsia = new HashSet<>();
        countryAsia.add(china);
        countryAsia.add(india);

        Set<Country> countryAustralia = new HashSet<>();
        countryAustralia.add(australia);
        countryAustralia.add(newealand);

        Continent europe = new Continent("Europe", countryEurope);
        Continent northAmerica = new Continent("North America", countryNorthAmerica);
        Continent southAmerica= new Continent("South America", countrySouthAmerica);
        Continent africa = new Continent("Africa", countryAfrica);
        Continent asia = new Continent("Asia", countryAsia);
        Continent australiaOceania = new Continent("Australia and Oceania", countryAustralia);

        Set<Continent> continents = new HashSet<>();
        continents.add(europe);
        continents.add(northAmerica);
        continents.add(southAmerica);
        continents.add(africa);
        continents.add(asia);
        continents.add(australiaOceania);

        World worldContinent = new World(continents);

        //When
        BigDecimal totalPeople = worldContinent.getPeopleQuantity();

        //Then
        BigDecimal expectedTotalPeople = new BigDecimal("3783000000");
        assertEquals(expectedTotalPeople, totalPeople);
    }
}
