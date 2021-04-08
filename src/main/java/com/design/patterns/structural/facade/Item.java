package com.design.patterns.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private int pricePreOne;
    private int quantity;
}
