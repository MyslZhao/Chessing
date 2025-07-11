package com.chess;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

public class Board {
    public static final int PLAYER_WHITE = 1;
    public static final int PLAYER_BLACK = 2;
    static int[] loca_size = new int[] { 8, 8 };
    JSONArray chess_statue = new JSONArray();

    public Board() {
        System.out.println("normal");
    };

    public void start() {
        // 初始化并加载棋子
        // 国王
        King wk = new King(PLAYER_WHITE, "wk");
        King bk = new King(PLAYER_BLACK, "bk");
        // 女王
        Queen wq = new Queen(PLAYER_WHITE, "wq");
        Queen bq = new Queen(PLAYER_BLACK, "bq");
        // 马
        Knight wn_1 = new Knight(PLAYER_WHITE, "wn_1", 1);
        Knight wn_2 = new Knight(PLAYER_WHITE, "wn_2", 2);
        Knight bn_1 = new Knight(PLAYER_BLACK, "bn_1", 1);
        Knight bn_2 = new Knight(PLAYER_BLACK, "bn_2", 2);
        // 教主
        Bishop wb_1 = new Bishop(PLAYER_WHITE, "wb_1", 1);
        Bishop wb_2 = new Bishop(PLAYER_WHITE, "wb_2", 2);
        Bishop bb_1 = new Bishop(PLAYER_BLACK, "bb_1", 1);
        Bishop bb_2 = new Bishop(PLAYER_BLACK, "bb_2", 2);
        // 战车
        Rook wr_1 = new Rook(PLAYER_WHITE, "wr_1", 1);
        Rook wr_2 = new Rook(PLAYER_WHITE, "wr_2", 2);
        Rook br_1 = new Rook(PLAYER_BLACK, "br_1", 1);
        Rook br_2 = new Rook(PLAYER_BLACK, "br_2", 2);
        // 兵
        Pawn w_1 = new Pawn(PLAYER_WHITE, "w_1", 1);
        Pawn w_2 = new Pawn(PLAYER_WHITE, "w_2", 2);
        Pawn w_3 = new Pawn(PLAYER_WHITE, "w_3", 3);
        Pawn w_4 = new Pawn(PLAYER_WHITE, "w_4", 4);
        Pawn w_5 = new Pawn(PLAYER_WHITE, "w_5", 5);
        Pawn w_6 = new Pawn(PLAYER_WHITE, "w_6", 6);
        Pawn w_7 = new Pawn(PLAYER_WHITE, "w_7", 7);
        Pawn w_8 = new Pawn(PLAYER_WHITE, "w_8", 8);
        Pawn b_1 = new Pawn(PLAYER_BLACK, "b_1", 1);
        Pawn b_2 = new Pawn(PLAYER_BLACK, "b_2", 2);
        Pawn b_3 = new Pawn(PLAYER_BLACK, "b_3", 3);
        Pawn b_4 = new Pawn(PLAYER_BLACK, "b_4", 4);
        Pawn b_5 = new Pawn(PLAYER_BLACK, "b_5", 5);
        Pawn b_6 = new Pawn(PLAYER_BLACK, "b_6", 6);
        Pawn b_7 = new Pawn(PLAYER_BLACK, "b_7", 7);
        Pawn b_8 = new Pawn(PLAYER_BLACK, "b_8", 8);
        // 储存初始信息
        chess_statue.put(wk.stor_JSONArray());
        chess_statue.put(bk.stor_JSONArray());
        chess_statue.put(wq.stor_JSONArray());
        chess_statue.put(bq.stor_JSONArray());
        chess_statue.put(wn_1.stor_JSONArray());
        chess_statue.put(wn_2.stor_JSONArray());
        chess_statue.put(bn_1.stor_JSONArray());
        chess_statue.put(bn_2.stor_JSONArray());
        chess_statue.put(wb_1.stor_JSONArray());
        chess_statue.put(wb_2.stor_JSONArray());
        chess_statue.put(bb_1.stor_JSONArray());
        chess_statue.put(bb_2.stor_JSONArray());
        chess_statue.put(wr_1.stor_JSONArray());
        chess_statue.put(wr_2.stor_JSONArray());
        chess_statue.put(br_1.stor_JSONArray());
        chess_statue.put(br_2.stor_JSONArray());
        chess_statue.put(w_1.stor_JSONArray());
        chess_statue.put(w_2.stor_JSONArray());
        chess_statue.put(w_3.stor_JSONArray());
        chess_statue.put(w_4.stor_JSONArray());
        chess_statue.put(w_5.stor_JSONArray());
        chess_statue.put(w_6.stor_JSONArray());
        chess_statue.put(w_7.stor_JSONArray());
        chess_statue.put(w_8.stor_JSONArray());
        chess_statue.put(b_1.stor_JSONArray());
        chess_statue.put(b_2.stor_JSONArray());
        chess_statue.put(b_3.stor_JSONArray());
        chess_statue.put(b_4.stor_JSONArray());
        chess_statue.put(b_5.stor_JSONArray());
        chess_statue.put(b_6.stor_JSONArray());
        chess_statue.put(b_7.stor_JSONArray());
        chess_statue.put(b_8.stor_JSONArray());
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
