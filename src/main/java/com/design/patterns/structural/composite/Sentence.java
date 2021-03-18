package com.design.patterns.structural.composite;

public class Sentence extends LetterComposite {
    public Sentence(Word... words) {
        this.add(words);
    }

    @Override
    protected void printAfter() {
        System.out.println(".");
    }
}
