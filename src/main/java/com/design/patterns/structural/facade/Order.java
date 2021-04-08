package com.design.patterns.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Order {
    private Set<Item> items;
    private long totalSum;
    private String cardNumber;
    private boolean packed;
}
