package com.design.patterns.creational.factory_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BMW implements Car {
    @Override
    public void displayName() {
        log.info("BMW");
    }

    @Override
    public void maxSpeed() {
        log.info("BMW max speed - 350!");
    }
}
