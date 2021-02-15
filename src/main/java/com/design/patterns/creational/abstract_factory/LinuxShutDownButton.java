package com.design.patterns.creational.abstract_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinuxShutDownButton implements ShutDownButton {
    @Override
    public void click() {
        log.info("Linux shut down button was clicked. Bye...");
    }
}
