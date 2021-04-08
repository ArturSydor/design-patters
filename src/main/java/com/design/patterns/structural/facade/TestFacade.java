package com.design.patterns.structural.facade;

public class TestFacade {
    public static void main(String[] args) {
        ShopperAssistant assistant = new ShopperAssistant("11111");
        assistant.buyItems(new Item("Apple", 2, 4),
                new Item("Cola", 10, 2),
                new Item("Pizza", 3, 3));
    }
}
