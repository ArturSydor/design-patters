package com.design.patterns.structural.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Notifier basicSet = new NotifierDecorator(new MailNotifier());

        Notifier doubleSet = new InstagramDecorator(new MailNotifier());

        Notifier tripleSet = new SMSDecorator(new InstagramDecorator(new MailNotifier()));

        basicSet.send();
        doubleSet.send();
        tripleSet.send();
    }
}
