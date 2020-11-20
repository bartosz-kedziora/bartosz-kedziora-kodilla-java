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


//    BigDecimal getPeopleQuantity()
//    {         return (BigDecimal) continentList.stream()
//            .flatMap(user -> user.getFriends().stream())
//            .map(Country::getPeopleQuantity);
////        BigDecimal totalSand = continents.stream()
////                .map(SandStorage::getSandBeansQuantity)
////                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current))
//    }
//    public Set<String> getLocationsOfFriendsOfFriends() {
//        return friends.stream()                               // [1]
//                .flatMap(user -> user.getFriends().stream())       // [2]
//                .filter(user -> user != this)                      // [3]
//                .map(ForumUser::getLocation)                       // [4]
//                .collect(Collectors.toSet());                      // [5]
//    }
}
