package com.design.patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EuropeUsaChargeAdapter implements Charge {

    private final EuropeCharge europeCharge;

    public EuropeUsaChargeAdapter() {
        europeCharge = new EuropeCharge();
    }

    @Override
    public void charge() {
        log.info("Tourist in USA must use adapter to charge phone");
        europeCharge.chargeEurope();
    }
}
