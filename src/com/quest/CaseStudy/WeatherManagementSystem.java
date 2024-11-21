package com.quest.CaseStudy;

import java.util.Scanner;

public class WeatherManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Weather Management System!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of cities whose details you wish to add:");
        int cities = sc.nextInt();
        WeatherDataManagement weatherDataManagement = new WeatherDataManagement();
        String name = "";
        double temp = 0.0;
        String condition = "";
        int humidity = 0;

        for (int i = 0; i < cities; i++) {
            System.out.println("Please enter the name of the city");
            name = sc.next();
            System.out.println("Please enter the temperature of the city");
            temp = sc.nextDouble();
            System.out.println("Please enter the humidity of the city");
            humidity = sc.nextInt();
            System.out.println("Please enter the weather condition of the city");
            condition = sc.next();

        }
        Weather weather = new Weather(name, temp, humidity, condition);
        weatherDataManagement.addingWeatherData(weather);
        System.out.println("Displaying the city details: ");
        weatherDataManagement.displayWeatherData(weather);
        System.out.println("City with the highest or lowest temperature: ");
        weatherDataManagement.highestTemperature(weather);
        System.out.println("City with humidity>80: ");
        weatherDataManagement.highestHumidity(weather);
        System.out.println("Generating Reports: ");
        weatherDataManagement.reports(weather);
        System.out.println("Avaerage Temperatures: ");
        weatherDataManagement.avgTemp(weather);
        System.out.println("Alerts: ");
        weatherDataManagement.alerts(weather);


    }
}
