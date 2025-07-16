package com.chess;

class Rook extends Chess {
    public Rook(int new_color, String new_name, int side) {
        super(new_color, new_name);
        switch (new_color) {
            case 1 -> loca[1] = 1;
            case 2 -> loca[1] = 8;
        }
        // side参数：1为左侧，2为右侧
        switch (side) {
            case 1 -> loca[0] = 1;
            case 2 -> loca[0] = 8;
        }
    };

    @Override
    public void move(int[] new_loca) {
        System.err.println("q");
    };
}
