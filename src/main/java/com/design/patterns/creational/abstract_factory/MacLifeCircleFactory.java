package com.design.patterns.creational.abstract_factory;

public class MacLifeCircleFactory extends OSLifeCircleFactory {
    @Override
    public StartScreen creteStartScreen() {
        return getStartScreen(MacStartScreen::new);
    }

    @Override
    public ShutDownButton createShutDownButton() {
        return getShutDownButton(MacShutDownButton::new);
    }
}
