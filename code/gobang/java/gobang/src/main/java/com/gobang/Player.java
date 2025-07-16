package com.gobang;

public class Player {
    static final int EMPTY = 0;
    int color = EMPTY;
    int score = 0;

    public Player(int new_color) {
        color = new_color;
    }

}
