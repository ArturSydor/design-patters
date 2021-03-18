package com.design.patterns.structural.composite;

import java.util.Arrays;

public class Word extends LetterComposite {
    public Word(Letter... letters) {
        this.add(letters);
    }
    public Word(Character... letters) {
        Arrays.stream(letters).forEach(character -> this.add(new Letter(character)));
    }

    @Override
    protected void printBefore() {
        System.out.println(" ");
    }
}
