package com.quest.CaseStudy;


import java.util.ArrayList;

public class WeatherDataManagement implements DataManagement {
    private Weather[] weatherArray = new Weather[10];
    private int index = 0;

    public WeatherDataManagement() {
    }

    public void addingWeatherData(Weather weather) {
        weatherArray[index++] = weather;

    }

    @Override
    public void displayWeatherData(Weather weather) {
        for (Weather weather1 : weatherArray) {
            System.out.println(weather);
        }
    }

    @Override
    public void highestTemperature(Weather weather) {
        if (weatherArray.length == 0) return;

        Weather highest = weatherArray[0];
        Weather lowest = weatherArray[0];

        for (Weather city : weatherArray) {
            if (city.getTemp() > highest.getTemp()) {
                highest = city;
            }
            if (city.getTemp() < lowest.getTemp()) {
                lowest = city;
            }
            System.out.println("City with the Highest Temperature: " + highest.getCityName() + " (" + highest.getTemp() + "°C)");
            System.out.println("City with the Lowest Temperature: " + lowest.getCityName() + " (" + lowest.getTemp() + "°C)");
        }
    }

    @Override
    public void highestHumidity(Weather weather) {
        boolean found = false;
        for (Weather city : weatherArray) {
            if (city.getHumidity() > 80) {
                System.out.println(city);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cities found.");
        }
    }

    @Override
    public void reports(Weather weather) {
        ArrayList<String> processedConditions = new ArrayList<>();

        for (Weather city : weatherArray) {
            String condition = city.getWeatherCondition();

            // Skip if this condition has already been processed
            if (processedConditions.contains(condition)) {
                continue;
            }

            // Add the condition to the processed list
            processedConditions.add(condition);

            // Collect all cities with the same condition
            ArrayList<String> groupedCities = new ArrayList<>();
            for (Weather otherCity : weatherArray) {
                if (otherCity.getWeatherCondition().equals(condition)) {
                    groupedCities.add(otherCity.getCityName());
                }
            }

            // Display grouped cities
            System.out.println("- " + condition + ": " + String.join(", ", groupedCities));
        }
    }

    @Override
    public void avgTemp(Weather weather) {
        if (weatherArray.length == 0) return;

        double totalTemp = 0;
        for (Weather city : weatherArray) {
            totalTemp += city.getTemp();
        }
        System.out.printf("Average Temperature: %.2f°C%n", totalTemp / weatherArray.length);
    }

    @Override
    public void alerts(Weather weather) {
        for (Weather city : weatherArray) {
            if (city.getTemp() > 40) {
                System.out.println("Heat-Wave alert for " + city.getCityName());
            } else if (city.getHumidity() < 20) {
                System.out.println("Low Humidity alert for " + city.getCityName());

            }
        }
    }
}
