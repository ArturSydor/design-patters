package com.design.patterns.creational.prototype;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FootballPlayer extends Person {

    private int salary;

    private int number;

    public FootballPlayer(int salary, int number) {
        this.salary = salary;
        this.number = number;
    }

    public FootballPlayer(FootballPlayer player) {
        super(player);
        this.salary = player.salary;
        this.number = player.number;
    }

    @Override
    public FootballPlayer copy() {
        return new FootballPlayer(this);
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name=" + this.getName() +
                ", age" + this.getAge() +
                ", salary=" + salary +
                ", number=" + number +
                '}';
    }
}
