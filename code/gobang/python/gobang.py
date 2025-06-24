import pygame as pg
from time import sleep
from random import choice

class board:
    """
    棋盘类
    """
    turn_disp_point=(20,628)
    statue_board=[[],[],[],[],[],[],[],[],[],[],[],[],[],[],[]]
    start_point=(47,48)
    pix_size = (0,0)
    size = (15, 15)
    x_dist = 39.88
    y_dist = 38.1
    x_loca=[]
    y_loca=[]
    bias = 5 # 用于修正玩家点击位置时的偏差，不宜过大
    player = []  # 玩家列表，存储两个玩家对象
    def __init__(self, size: tuple[int, int], player1: 'player', player2: 'player'):
        """
         棋盘对象初始化
        """
        for i in self.statue_board:
            for j in range(15):
                i.append(0)
        print(self.statue_board)
        self.pix_size = size  # 设置棋盘像素大小
        for i in range(15):
            # 位置序号
            self.x_loca.append(i)
            self.y_loca.append(i)
        self.player.append(player1)  # 添加玩家1
        self.player.append(player2)  # 添加玩家2
        return None
    def check(self):
        l=self.statue_board #为了简化名称，进行引用
        # 横向五子检查
        for i in l:
            if len([k for k,x in enumerate(i) if x == 1]) < 5 and len([l for l,y in enumerate(i) if y == 2]) < 5:
                print(len([k for k,x in enumerate(i) if x == 1]),len([l for l,y in enumerate(i) if y == 2]))
                print(i)
                continue
            for j in range(10):
                cache=i[j]*i[j+1]*i[j+2]*i[j+3]*i[j+4]
                print(cache)
                if cache == 1 or cache == 32:
                    return True
        # 纵向五子检查
        for i in range(15):
            cache=[]
            for j in l:
                cache.append(j[i])
            if len([k for k,x in enumerate(cache) if x == 1]) < 5 and len([l for l,y in enumerate(cache) if y == 2]) < 5:
                continue
            for j in range(10):
                if cache[j] == 0:
                    continue
                else:
                    a=cache[j]*cache[j+1]*cache[j+2]*cache[j+3]*cache[j+4]
                    if a == 1 or a == 32:
                        return True
        # 斜向五子检查
        for i in range(15):
            for j in range(15):
                cache=0
                if l[i][j] == 0:
                    continue
                elif i < 11 and j <11:
                    cache=l[i][j]*l[i+1][j+1]*l[i+2][j+2]*l[i+3][j+3]*l[i+4][j+4]
                elif i > 3 and j < 11:
                    cache=l[i][j]*l[i-1][j+1]*l[i-2][j+2]*l[i-3][j+3]*l[i-4][j+4]
                else:
                    continue
                if cache == 1 or cache == 32:
                    return True
        return False


    
    def test_place_piece(self,player:'player',surface):
        """
        棋盘点阵可视化,
        用于调试(不影响其他功能)
        """
        done = False
        statue = []
        # 具体可视化实现
        for i in range(15):
            for j in range(15):
                rect(surface,
                             (255,255,255),
                             Rect(i*self.x_dist+self.start_point[0]-self.bias,
                                     j*self.y_dist+self.start_point[1]-self.bias,
                                     2*self.bias,
                                     2*self.bias))
        update()
        # 下同self.place_piece
        while not done:
            pix_loca=list(player.place_piece())
            if str(pix_loca[0]) == 'False':
                done=True
                statue=[False,False]
                continue
            for x in self.x_loca:
                for y in self.y_loca:
                    m=(x*self.x_dist-self.bias+self.start_point[0]-pix_loca[0])*(x*self.x_dist+self.bias+self.start_point[0]-pix_loca[0])
                    n=(y*self.y_dist-self.bias+self.start_point[1]-pix_loca[1])*(y*self.y_dist+self.bias+self.start_point[1]-pix_loca[1])
                    if m <= 0 and n <= 0 and self.statue_board[x][y] == 0:
                        print(player.color)                            
                        surface.blit(COLOR_PIC[player.color], 
                                    (x*self.x_dist+self.start_point[0] - player.bias[player.color-1][0], 
                                    y*self.y_dist+self.start_point[1] - player.bias[player.color-1][1]))
                        update()
                        print(self.statue_board)
                        done =True
                        statue=[x,y]
                        continue
        return statue
    def place_piece(self,player:'player',surface):
        """
        对鼠标所点击的坐标进行判定
        """
        done = False
        statue = []
        while not done:
            pix_loca=list(player.place_piece())
            if str(pix_loca[0]) == 'False':
                done=True
                statue=[False,False]
                continue
            for x in self.x_loca:
                for y in self.y_loca:
                    # 坐标判断原理:'a < m < b '<=> '(a-m)*(b-m) < 0'
                    m=(x*self.x_dist-self.bias+self.start_point[0]-pix_loca[0])*(x*self.x_dist+self.bias+self.start_point[0]-pix_loca[0])
                    n=(y*self.y_dist-self.bias+self.start_point[1]-pix_loca[1])*(y*self.y_dist+self.bias+self.start_point[1]-pix_loca[1])
                    if m <= 0 and n <= 0 and self.statue_board[x][y] == 0: 
                        print(player.color)                            
                        surface.blit(COLOR_PIC[player.color], 
                                    (x*self.x_dist+self.start_point[0] - player.bias[player.color-1][0], 
                                    y*self.y_dist+self.start_point[1] - player.bias[player.color-1][1]))
                        update()
                        print(self.statue_board)
                        done =True
                        statue=[x,y]
                        continue
        return statue
        
    def start(self,surface):
        """
        游戏主代码
        """
        global done
        winner=0
        turn=[False,False]
        turn[choice([0,1])]=True
        game=True
        while game:
            sleep(0.1)
            for m in range(2):
                if turn[m]:
                    turn_clear=Rect(self.turn_disp_point[0],self.turn_disp_point[1],80,20) # 使用turn_clear对象覆盖原turn_statue文本
                    rect(surface,(255,255,255),turn_clear)
                    flip()
                    turn_statue=SysFont("华文细黑",15).render(COLOR[self.player[m].color]+"回合",True,(0,0,0))
                    surface.blit(turn_statue,self.turn_disp_point)
                    update()
                    cache=self.place_piece(self.player[m],surface)
                    self.statue_board[cache[0]][cache[1]]=self.player[m].color
                    if str(cache[0]) == 'False':
                        print('中断游戏')
                        done=True
                        game=False
                        return 0
                    if self.check():
                        return(self.player[m].color)
                    turn.reverse()

    def result(self,winner):
        turn_clear=Rect(self.turn_disp_point[0],self.turn_disp_point[1],80,20)
        rect(surface,(255,255,255),turn_clear)
        flip()
        winner_text=SysFont("华文细黑",15).render(COLOR[winner]+"获胜，右上角退出游戏",True,(0,0,0))
        surface.blit(winner_text,self.turn_disp_point)
        update()
        