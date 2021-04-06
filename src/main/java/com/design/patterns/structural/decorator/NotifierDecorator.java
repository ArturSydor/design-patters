package com.design.patterns.structural.decorator;

public class NotifierDecorator implements Notifier{

    private final Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}
