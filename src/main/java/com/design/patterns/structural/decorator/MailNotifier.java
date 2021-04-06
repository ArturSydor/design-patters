package com.design.patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MailNotifier implements Notifier {
    @Override
    public void send() {
        log.info("Mails were sent!");
    }
}
