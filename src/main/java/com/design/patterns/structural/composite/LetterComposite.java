package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class LetterComposite {
    private final List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite... letterComposites) {
        this.children.addAll(Arrays.asList(letterComposites));
    }

    protected void printBefore() {
    }

    protected void printAfter() {
    }

    public void print() {
        printBefore();
        children.forEach(LetterComposite::print);
        printAfter();
    }

}
