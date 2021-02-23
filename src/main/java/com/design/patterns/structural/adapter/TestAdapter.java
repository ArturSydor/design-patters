package com.design.patterns.structural.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        Charge charge = new EuropeUsaChargeAdapter();
        Tourist tourist = new Tourist(charge);
        tourist.chargePhone();
    }
}
