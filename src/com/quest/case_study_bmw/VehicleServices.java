package com.quest.case_study_bmw;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class VehicleServices {
    public static void main(String[] args) {
        ServiceCenter<ElectricVehicle> ev = new ServiceCenter<>();
        ServiceCenter<CombustionEngineVehicle> cev = new ServiceCenter<>();

        //Sample data to try out streams
        ElectricVehicle ev1 = new ElectricVehicle("EV1", "Tesla", "Y-Series", 2018, 20000, "Elon", 100, 400);
        ElectricVehicle ev2 = new ElectricVehicle("EV2", "Nissan", "M-Series", 2022, 56000, "Jack", 50, 150);
        CombustionEngineVehicle cev1 = new CombustionEngineVehicle("CEV1", "Toyota", "Camry", 2010, 120000, "Randy", "Petrol", 2.5);
        CombustionEngineVehicle cev2 = new CombustionEngineVehicle("CEV2", "Ford", "Mustang", 2016, 40000, "David", "Petrol", 1.8);

        ev.addServicedVehicle(ev1);
        ev.addServicedVehicle(ev2);
        cev.addServicedVehicle(cev1);
        cev.addServicedVehicle(cev2);

        Predicate<Vehicle> mileagePred = i -> i.getMileage() > 50000;

        Predicate<Vehicle> yearPred = i -> i.getYear() < 2015;

        Consumer<Vehicle> vehicleDetails = i -> System.out.println("VIN: "+i.getVin()+", Mileage: "+i.getMileage());

        Supplier<CombustionEngineVehicle> cevSupplier = () -> new CombustionEngineVehicle("CEV2", "Ford", "Mustang", 2016, 40000, "David", "Petrol", 1.8);
        CombustionEngineVehicle combustionEngineVehicle = cevSupplier.get();
        System.out.println(combustionEngineVehicle);

        Function<Vehicle,Double> resaleValuFunction = i ->{
            double originalPrice = 50000;
            double depreciationRate = 5000;
            int yearsUsed = 2024 - i.getYear();
            return originalPrice - (depreciationRate * yearsUsed);
        };

        Vehicle oldestVehicle = Stream.concat(
                ev.getServicedvehicles().stream(),
                cev.getServicedvehicles().stream()
        ).min(Comparator.comparingInt(Vehicle::getYear)).get();
        System.out.println("The oldest vehicle is: "+oldestVehicle.getVin()+" of brand "+oldestVehicle.getBrand());

    }
}
