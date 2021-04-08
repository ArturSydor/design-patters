package com.design.patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Set;

@Slf4j
public class OnlineStore {
    public Order createOrder(String cardNUmber, Item... items) {
        Order order = new Order(Set.of(items), Arrays.stream(items)
                .map(item -> item.getPricePreOne() * item.getQuantity())
                .reduce(0, Integer::sum), cardNUmber, Boolean.FALSE);

        log.info("Created order : {}",order.toString());

        return order;
    }
}
