package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;

public final class World
{
    private final Set<Continent> continentList;

    public World(Set<Continent> continentList)
    {
        this.continentList = continentList;
    }

    BigDecimal getPeopleQuantity()
    {
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
