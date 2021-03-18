package com.design.patterns.structural.composite;

public class TestMessageCreate {
    public static void main(String[] args) {
        var geekMessage = new Sentence(
                new Word('H', 'i'),
                new Word('F', 'r', 'o', 'm'),
                new Word('S', 'a', 'n'),
                new Word('F', 'r', 'a', 'n', 'c', 'i', 's', 'k', 'o')
        );
        geekMessage.print();
    }
}
