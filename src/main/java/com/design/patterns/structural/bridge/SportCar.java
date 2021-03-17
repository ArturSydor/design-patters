package com.design.patterns.structural.bridge;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SportCar implements Car {

    private final Color color;

    @Override
    public void start() {
        log.info("Sport {} car was started!", color.getColor());
    }

    @Override
    public void drive() {
        log.info("Sport {} car is driving!", color.getColor());
    }

    @Override
    public void refuel() {
        log.info("Sport {} car is on refuel!", color.getColor());
    }

    @Override
    public void stop() {
        log.info("Sport {} car was stopped!", color.getColor());
    }
}
