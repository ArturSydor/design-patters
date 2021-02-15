package com.design.patterns.creational.abstract_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinuxStartScreen implements StartScreen {
    @Override
    public void display() {
        log.info("Linux start screen ...");
    }
}
