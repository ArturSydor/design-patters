package com.design.patterns.creational.factory_method;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
public class CarStorageDrive {

    private static final Map<String, CarStorage> storages = new HashMap<>();

    static {
        storages.put("bmw", new BMWStorage());
        storages.put("aston", new AstonMartinStorage());
    }

    public static void main(String[] args) {
        try {
            CarStorage storage = configure(args);
            storage.present();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    private static CarStorage configure(String[] args) {
        if(args.length > 0) {
            CarStorage storage = storages.get(args[0]);
            if(Objects.isNull(storage)) {
                throw new IllegalArgumentException(args[0] + " storage does not exists!");
            }
            return storage;
        } else {
            throw new IllegalArgumentException("No storage type was passed");
        }
    }

}
