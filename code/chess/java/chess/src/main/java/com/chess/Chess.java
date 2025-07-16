package com.chess;

import org.json.JSONArray;

abstract class Chess {
    String name;
    // display_size常量:规定棋子显示大小
    static int[] display_size = new int[] { 40, 40 };
    // loca参数：记录棋子位置
    int[] loca = new int[] { 0, 0 };
    // color参数：0为初始化默认值，1为白方，2为黑方
    int color = 0;

    public Chess(int new_color, String new_name) {
        name = new_name;
        color = new_color;
    };

    public JSONArray stor_JSONArray() {
        JSONArray cache = new JSONArray();
        cache.put(name);
        cache.put(color);
        cache.put(loca[0]);
        cache.put(loca[1]);
        return cache;
    }

    public abstract void move(int[] new_loca);
}
