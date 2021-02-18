package com.design.patterns.creational.builder;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@ToString
public class Game {
    private final String name;
    private final BigDecimal price;
    private final int rating;
    private final String description;
    private final boolean license;

    private Game(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.rating = builder.rating;
        this.description = builder.description;
        this.license = builder.license;
    }

    public static Builder builder(String name, BigDecimal price) {
        return new Builder(name, price);
    }

    public static class Builder {
        private final String name;
        private final BigDecimal price;
        private int rating;
        private String description;
        private boolean license;


        private Builder(String name, BigDecimal price) {
            if (Objects.isNull(name) || Objects.isNull(price)) {
                throw new IllegalArgumentException("Name and price cannot be null!");
            }
            this.name = name;
            this.price = price;
        }

        public Builder withRating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withLicense(boolean license) {
            this.license = license;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }
}
