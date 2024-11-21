package com.quest.CaseStudy;

public interface DataManagement {



    void addingWeatherData(Weather weather);

    void displayWeatherData(Weather weather);

    void highestTemperature(Weather weather);

    void highestHumidity(Weather weather);

    void reports(Weather weather);

    void avgTemp(Weather weather);

    void alerts(Weather weather);
}