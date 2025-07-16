package com.gobang;

public class Board {
    /*
     * 棋盘类
     */
    // 游戏参数
    static final int BLACK = 1;
    static final int WHITE = 2;
    Player[] players = new Player[2];
    int[][] statue_board = new int[15][15];
    // 显示参数
    int turn_disp_point;
    Number x_dist = 39.88;
    Number y_dist = 38.1;

     
    public Board(){
        players[0] = new Player(BLACK);
        players[1] = new Player(WHITE);
    };

    static Boolean check(){

    }

}
