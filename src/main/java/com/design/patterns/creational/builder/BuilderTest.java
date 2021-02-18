package com.design.patterns.creational.builder;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class BuilderTest {
    public static void main(String[] args) {
        Game dota = Game.builder("Dota 2", BigDecimal.TEN)
                .withDescription("sth")
                .withLicense(true)
                .withRating(10)
                .build();
        log.info(dota.toString());

        Game needOfSpeed = Game.builder("Need of spped 2", BigDecimal.ONE)
                .withLicense(true)
                .withRating(11)
                .build();
        log.info(needOfSpeed.toString());
    }
}
