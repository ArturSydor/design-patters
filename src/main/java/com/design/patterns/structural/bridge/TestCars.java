package com.design.patterns.structural.bridge;

public class TestCars {
    public static void main(String[] args) {
        Car car = new SportCar(new Red());
        car.start();
        car.drive();
        car.refuel();
        car.stop();

        car = new SportCar(new Green());
        car.start();
        car.drive();
        car.refuel();
        car.stop();

        car = new LuxuryCar(new Green());
        car.start();
        car.drive();
        car.refuel();
        car.stop();

        car = new LuxuryCar(new Red());
        car.start();
        car.drive();
        car.refuel();
        car.stop();

    }
}
