package com.chess;

public class Queen extends Chess {
    public Queen(int new_color) {
        super(new_color);
        switch (new_color) {
            case 1 -> {
                loca[0] = 4;
                loca[1] = 1;
            }
            case 2 -> {
                loca[0] = 5;
                loca[1] = 8;
            }
        }
    };

    @Override
    public void move(int[] new_loca) {
        System.err.println("q");
    };
};