package com.chess;

public class King extends Chess {
    public King(int new_color) {
        super(new_color);
        switch (new_color) {
            case 1 -> {
                loca[0] = 5;
                loca[1] = 1;
            }
            case 2 -> {
                loca[0] = 4;
                loca[1] = 8;
            }
        }
    }

    @Override
    public void move(int[] new_loca) {
        if (mate_check(new_loca)) {
            if ((Math.abs(new_loca[0] - loca[0]) == 1) || (Math.abs(new_loca[1] - loca[1]) == 1)) {
                loca[0] = new_loca[0];
                loca[1] = new_loca[1];
            }
        }
    };

    public Boolean mate_check(int[] new_loca) {
        Boolean result;
        for (int[] attack_loca : (Board.attack_loca_get())) {
            if ((attack_loca[0] == new_loca[0]) && (attack_loca[1] == new_loca[1])) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    };
};
