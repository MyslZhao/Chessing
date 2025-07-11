package com.chess;

public class Knight extends Chess {
    public Knight(int new_color, int side) {
        super(new_color);
        switch (new_color) {
            case 1 -> loca[1] = 1;
            case 2 -> loca[1] = 8;
        }
        // side参数：1为左侧，2为右侧
        switch (side) {
            case 1 -> loca[1] = 2;
            case 2 -> loca[1] = 7;
        }
    }

    @Override
    public void move(int[] new_loca) {
        System.err.println("q");
    }
}
