package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast
{
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures)
    {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast()
    {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet())
        {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature()
    {
        double result = 0;
        int counter = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet())
        {
            result+=temperature.getValue();
            counter++;
        }
        return result/counter;
    }
    public double medianTemperature()
    {
        double result;
        List <Double> medianTemperatureResult = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet())
        {
            medianTemperatureResult.add(temperature.getValue());
        }
        Collections.sort(medianTemperatureResult);

        if(medianTemperatureResult.size()%2==0)
        {
            result = medianTemperatureResult.get(medianTemperatureResult.size()/2)
                   + medianTemperatureResult.get(medianTemperatureResult.size()/2-1);
        }
        else
        {
            int getResult=medianTemperatureResult.size()/2;
            result=medianTemperatureResult.get(getResult);
        }
        return result;
    }
}
