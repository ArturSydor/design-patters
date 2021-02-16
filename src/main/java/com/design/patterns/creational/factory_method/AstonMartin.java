package com.design.patterns.creational.factory_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AstonMartin implements Car {
    @Override
    public void displayName() {
        log.info("Aston Martin");
    }

    @Override
    public void maxSpeed() {
        log.info("Aston Martin max speed - 320!");
    }
}
