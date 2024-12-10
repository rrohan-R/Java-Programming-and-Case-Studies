package com.quest.case_study_bmw;

import java.util.HashSet;
import java.util.Set;

public class ServiceCenter<T> {
    private T data;
    Set<T> services=new HashSet<>();
//    public ServiceCenter(T data) {
//        this.data = data;
//        services = new HashSet<T>();
//    }
//    public T getData() {
//        return data;
//    }
//    public void setData(T data) {
//        this.data = data;
//    }
//    public Set<T> getServices() {
//        return services;
//    }
//    public void setServices(Set<T> services) {
//        this.services = services;
//    }
    public void addServicedVehicle(T vehicle) {
        services.add(vehicle);
    }
    public Set<T> getServicedvehicles() {
        return services;
    }

}
