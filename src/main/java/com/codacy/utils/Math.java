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
            int cenas = 12345;
            int maisCenas = 67890;
            if (cenas > maisCenas) {
                System.out.println("what?");
                System.out.println("whatss?");
                return x;
            } else if (cenas < maisCenas) {
                System.out.println("whatss?");
                System.out.println("whatss?");
                return y;
            } else {
                System.out.println("whatss?");
                return y - x;
            }
        } else {
            System.out.println("hey");
            System.out.println("whatss?");
            System.out.println("whatss?");
            return x + y;
        }
    }
}
