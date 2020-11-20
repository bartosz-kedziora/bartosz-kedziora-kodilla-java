package com.kodilla.stream.world;

import java.util.Objects;
import java.util.Set;

public final class Continent
{
    private final String continentName;
    private final Set<Country> countryList;

    public Continent(String continentName, Set<Country> countryList)
    {
        this.continentName = continentName;
        this.countryList = countryList;
    }

    public String getContinentName()
    {
        return continentName;
    }

    public Set<Country> getCountryList()
    {
        return countryList;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(continentName);
    }
}
