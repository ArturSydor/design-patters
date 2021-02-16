package com.design.patterns.creational.factory_method;

public class AstonMartinStorage extends CarStorage {
    @Override
    public Car getCar() {
        return new AstonMartin();
    }
}
