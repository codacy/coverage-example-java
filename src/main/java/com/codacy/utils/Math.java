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
        System.out.println(x);
        System.out.println(y);
        if (y == magicNumber) {
            System.out.println(x);
            return y - x;
        } else {
            System.out.println("hey");
            System.out.println(y);
            return x + y;
        }
    }
}
