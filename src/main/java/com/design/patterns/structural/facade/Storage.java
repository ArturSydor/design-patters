package com.design.patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Storage {
    public boolean packOrder(Order order) {
        order.setPacked(Boolean.TRUE);
        log.info("Order was packed : {}", order);
        return order.isPacked();
    }
}
