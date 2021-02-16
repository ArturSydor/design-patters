package com.design.patterns.creational.factory_method;

public class BMWStorage extends CarStorage {
    @Override
    public Car getCar() {
        return new BMW();
    }
}
