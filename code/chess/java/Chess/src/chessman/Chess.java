package chessman;
public abstract class Chess {
    //display_size常量:规定棋子显示大小
    static int[] display_size = new int[]{40,40};
    //loca参数：记录棋子位置
    int[] loca = new int[]{0,0};
    //color参数：0为初始化默认值，1为白方，2为黑方
    int color = 0;  

    public Chess(int new_color){
        System.out.println("right");
        color = new_color;
    };
    public abstract void move(int[] new_loca);
}
