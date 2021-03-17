package com.design.patterns.structural.bridge;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class LuxuryCar implements Car {

    private final Color color;

    @Override
    public void start() {
        log.info("Luxury {} car was started!", color.getColor());
    }

    @Override
    public void drive() {
        log.info("Luxury {} car is driving!", color.getColor());
    }

    @Override
    public void refuel() {
        log.info("Luxury {} car is on refuel!", color.getColor());
    }

    @Override
    public void stop() {
        log.info("Luxury {} car was stopped!", color.getColor());
    }
}
