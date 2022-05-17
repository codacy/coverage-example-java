package com.codacy.utils;

public class Math {

    // Add a comment just for fun



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
            return x + y;
        }
    }
}
