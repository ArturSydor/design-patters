package com.design.patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SMSDecorator extends NotifierDecorator{
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        log.info("SMS messages were sent!");
    }
}
