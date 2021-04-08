package com.design.patterns.structural.facade;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ShopperAssistant {
    private String cardNumber;

    private final OnlineStore onlineStore;

    private final Storage storage;

    private final PostOffice postOffice;

    public ShopperAssistant(String cardNumber) {
        this();
        this.cardNumber = cardNumber;
    }

    private ShopperAssistant() {
        onlineStore = new OnlineStore();
        storage = new Storage();
        postOffice = new PostOffice();
    }

    public void buyItems(Item... items) {
        Order order = onlineStore.createOrder(cardNumber, items);
        storage.packOrder(order);
        postOffice.deliver(order);
    }
}
