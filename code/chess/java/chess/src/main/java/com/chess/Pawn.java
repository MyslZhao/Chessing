package com.chess;

public class Pawn extends Chess {
    public Pawn(int new_color, String new_name, int x_loca) {
        super(new_color, new_name);
        switch (new_color) {
            case 1 -> loca[1] = 1;
            case 2 -> loca[1] = 8;
        }
        if (x_loca < 9 && x_loca > 0) {
            loca[0] = x_loca;
        }
    }

    @Override
    public void move(int[] new_loca) {
        System.err.println("q");
    }
};
