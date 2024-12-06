package com.quest.CaseStudyDay22;

import java.time.LocalDate;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String vehicleId, String brand, String model, double price, LocalDate manufactureDate, int seatingCapacity) {
        super(vehicleId, brand, model, price, manufactureDate);
        this.seatingCapacity = seatingCapacity;
    }
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "Car{"+" vehicleID=" +getVehicleId() +" brand=" +getBrand() + " model=" + getModel() + " price=" + getPrice() +" manufactureDate=" +getManufactureDate() + " seatingCapacity=" + seatingCapacity + '}';
    }
}
