package com.quest.CaseStudy;

//name, current temperature (in Celsius), humidity percentage, and weather condition
public class Weather {
    private String cityName;
    private double temp;
    private int humidity;
    private String weatherCondition;

    public Weather(String cityName, double temp, int humidity, String weatherCondition) {
        this.cityName = cityName;
        this.temp = temp;
        this.humidity = humidity;
        this.weatherCondition = weatherCondition;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public String getWeatherCondition() {
        return weatherCondition;
    }
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    @Override
    public String toString() {
        return "City: " + cityName + ", Temperature: " + temp + "°C, Humidity: " + humidity + "%, Condition: " + weatherCondition;
    }
}
