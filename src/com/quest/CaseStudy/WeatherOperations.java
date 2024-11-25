package com.quest.CaseStudy;

public abstract class WeatherOperations {

    // all the absrtact methods are defined here and implemented in CityCollection
    public abstract void addCity(String cityName, double temp, int humidity, String weatherCondition);

    public abstract void displaySingleCity(String cityName);

    public abstract void displayAllCities();

    public abstract void updateCityDetails(String cityName);

    public abstract void hightempLowtemp();

    public abstract void humidtyMorethan(int humidity);

    public abstract void groupCityOnCondition(String weatherCondition);

    public abstract void calculateAvgTemperature();

    public abstract void tempWarning(double temp);

    public abstract void humidityDrop(int humidity);
}
