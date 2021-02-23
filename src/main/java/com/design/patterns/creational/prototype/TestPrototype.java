package com.design.patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestPrototype {

    public static void main(String[] args) {
        FootballPlayer origin = new FootballPlayer(1000, 10);
        origin.setName("Messi");
        origin.setAge(32);

        log.info("origin = {}", origin);

        FootballPlayer clone = origin.copy();

        log.info("clone = {}", clone);

    }

}
