package com.design.patterns.structural.composite;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Letter extends LetterComposite {

    private final Character character;

    @Override
    protected void printBefore() {
        System.out.println(character);
    }
}
