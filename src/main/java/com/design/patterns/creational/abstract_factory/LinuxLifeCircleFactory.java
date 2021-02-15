package com.design.patterns.creational.abstract_factory;

public class LinuxLifeCircleFactory extends OSLifeCircleFactory {

    @Override
    public StartScreen creteStartScreen() {
        return getStartScreen(LinuxStartScreen::new);
    }

    @Override
    public ShutDownButton createShutDownButton() {
        return getShutDownButton(LinuxShutDownButton::new);
    }
}
