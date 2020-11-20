package com.kodilla.stream.world;
import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite
{
    @Test
    void testGetPeopleQuantity()
    {
        //Given
        Country polska = new Country("Polska", new BigDecimal("38000000"));
        Country czechy = new Country("Czechy", new BigDecimal("9000000"));
        Country niemcy = new Country("Niemcy", new BigDecimal("80000000"));
        Country usa = new Country("USA", new BigDecimal("250000000"));

        Set<Country> countryEurope = new HashSet<>();
        countryEurope.add(polska);
        countryEurope.add(czechy);
        countryEurope.add(niemcy);

        Set<Country> countryNorthAmerica = new HashSet<>();
        countryNorthAmerica.add(usa);

        Continent europe = new Continent("Europe", countryEurope);
        Continent northAmerica = new Continent("North America", countryNorthAmerica);
        Set<Continent> continents = new HashSet<>();
        continents.add(europe);
        continents.add(northAmerica);

        World worldContinent = new World(continents);
        List<Set<Continent>> worldList = new ArrayList<>();
        worldList.add(continents);

        //When
        BigDecimal totalPeople = worldContinent.getPeopleQuantity();

        //Then
        BigDecimal expectedTotalPeople = new BigDecimal("377000000");
        assertEquals(expectedTotalPeople, totalPeople);
    }
}
