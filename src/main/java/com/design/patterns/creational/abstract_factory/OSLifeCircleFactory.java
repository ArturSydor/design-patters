package com.design.patterns.creational.abstract_factory;

import java.util.Objects;
import java.util.function.Supplier;

public abstract class OSLifeCircleFactory {

    private StartScreen startScreen;

    private ShutDownButton shutDownButton;

    public abstract StartScreen creteStartScreen();
    public abstract ShutDownButton createShutDownButton();

    protected StartScreen getStartScreen(Supplier<StartScreen> getScreen) {
        if (Objects.isNull(startScreen)) {
            startScreen = getScreen.get();
        }
        return startScreen;
    }

    protected ShutDownButton getShutDownButton(Supplier<ShutDownButton> getButton) {
        if (Objects.isNull(shutDownButton)) {
            shutDownButton = getButton.get();
        }
        return shutDownButton;
    }
}
