package com.design.patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostOffice {
    public boolean deliver(Order order) {
        log.info("Order has been delivered : {}", order);
        return order.isPacked();
    }
}
