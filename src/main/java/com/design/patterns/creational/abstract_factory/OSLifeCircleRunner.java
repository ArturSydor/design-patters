package com.design.patterns.creational.abstract_factory;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
public class OSLifeCircleRunner {

    private static final Map<String, OSLifeCircleFactory> factories = new HashMap<>();

    static {
        log.debug("Factories init started");
        factories.put("mac", new MacLifeCircleFactory());
        factories.put("linux", new LinuxLifeCircleFactory());
        log.debug("Factories init finished");
    }

    public static void main(String[] args) {
        String type = "";
        if (args.length > 0) {
            log.debug("type = {}", args[0]);
            type = args[0];
        }

        OSLifeCircleFactory factory = factories.get(type);

        if (Objects.isNull(factory)) {
            log.error("No factory found for OS " + type);
        } else {
            StartScreen screen = factory.creteStartScreen();
            ShutDownButton button = factory.createShutDownButton();

            screen.display();
            button.click();
        }
    }

}
