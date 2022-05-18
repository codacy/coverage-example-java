package com.codacy.utils;

public class Math {

    private int magicNumber;

    public Math(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    /**
     * Adds 2 numbers, unless there is a magic number on the second argument
     */
    public int magicAdd(int x, int y) {
        if (y == magicNumber) {
            return y - x;
        } else {
            System.out.println("hey");
            System.out.println("don't test and don't send report");
            return x + y;
        }
    }
}
