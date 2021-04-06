package com.design.patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InstagramDecorator extends NotifierDecorator{
    public InstagramDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        log.info("Instagram messages were sent!");
    }
}
