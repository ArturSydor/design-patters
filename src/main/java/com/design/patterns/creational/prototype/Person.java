package com.design.patterns.creational.prototype;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public abstract class Person implements Prototype {

    private String name;

    private int age;

    public Person(Person person) {
        if (Objects.nonNull(person)) {
            this.age = person.age;
            this.name = person.name;
        }
    }

    @Override
    public abstract Person copy();

}
