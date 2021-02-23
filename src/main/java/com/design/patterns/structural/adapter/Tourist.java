package com.design.patterns.structural.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tourist {

    private final Charge charge;

    public void chargePhone() {
        charge.charge();
    }

}
