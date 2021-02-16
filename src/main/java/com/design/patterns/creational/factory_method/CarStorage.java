package com.design.patterns.creational.factory_method;

public abstract class CarStorage {

    public void present() {
        Car car = getCar();
        car.displayName();
        car.maxSpeed();
    }

    public abstract Car getCar();

}
