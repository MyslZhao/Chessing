package com.chess;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class Board {
    static int[] loca_size = new int[] { 8, 8 };
    JSONObject chess_statue = new JSONObject();

    public Board() {
        System.out.println("normal");
    };

    public void start() {
        // 初始化并加载棋子
        // 国王
        King wk = new King(1);
        King bk = new King(2);
        // 女王
        Queen wq = new Queen(1);
        Queen bq = new Queen(2);
        // 马
        Knight wn_1 = new Knight(1, 1);
        Knight wn_2 = new Knight(1, 2);
        Knight bn_1 = new Knight(2, 1);
        Knight bn_2 = new Knight(2, 2);
        // 教主
        Bishop wb_1 = new Bishop(1, 1);
        Bishop wb_2 = new Bishop(1, 2);
        Bishop bb_1 = new Bishop(2, 1);
        Bishop bb_2 = new Bishop(2, 2);
        // 战车
        Rook wr_1 = new Rook(1, 1);
        Rook wr_2 = new Rook(1, 2);
        Rook br_1 = new Rook(2, 1);
        Rook br_2 = new Rook(2, 2);
        // 兵
        Pawn w_1 = new Pawn(1, 1);
        Pawn w_2 = new Pawn(1, 2);
        Pawn w_3 = new Pawn(1, 3);
        Pawn w_4 = new Pawn(1, 4);
        Pawn w_5 = new Pawn(1, 5);
        Pawn w_6 = new Pawn(1, 6);
        Pawn w_7 = new Pawn(1, 7);
        Pawn w_8 = new Pawn(1, 8);
        Pawn b_1 = new Pawn(1, 1);
        Pawn b_2 = new Pawn(1, 2);
        Pawn b_3 = new Pawn(1, 3);
        Pawn b_4 = new Pawn(1, 4);
        Pawn b_5 = new Pawn(1, 5);
        Pawn b_6 = new Pawn(1, 6);
        Pawn b_7 = new Pawn(1, 7);
        Pawn b_8 = new Pawn(1, 8);
    };

    public static List<int[]> loca_list() {
        List<int[]> result = new ArrayList<>();
        return result;
    };

    public static int[] clicked_loca() {
        int[] result = new int[2];
        return result;
    };

    public void display_update() {

    };

    public static List<int[]> attack_loca_get() {
        List<int[]> result = new ArrayList<>();
        return result;
    };
}
