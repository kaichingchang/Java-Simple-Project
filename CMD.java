package cmd;

import java.util.Scanner;
import guess.Guess;

public class CMD {
    public static void gameloop() {
        //第一步驟：設定遊戲答案
        Guess g = new Guess();

        //第二步驟：印出提示訊息
        System.out.printf("請猜出 0 到 9 之間的正整數...\n");
        System.out.printf("總共有三次機會猜出正確數字...\n");
        System.out.printf("準備好了嗎...\n");

        //第三步驟：遊戲主要迴圈
        int count = 0;
        int flag = 0;
        while (count < 3) {
            count += 1;
            int guess;
            System.out.printf("請輸入：\n");
            Scanner scanner = new Scanner(System.in);
            guess = Integer.parseInt(scanner.next());

            int result = g.answer(guess);
            switch (result) {
                case 0:
                    //第四步驟之一：答對，遊戲結束
                    System.out.printf("答對！\n");
                    System.out.printf("你猜了%d次...\n", count);
                    flag = 1;
                    break;
                case 1:
                    System.out.printf("大一點！\n");
                    break;
                case 2:
                    System.out.printf("小一點！\n");
                    break;
                default:
                    System.out.printf("不正確的輸入...\n");
            }

            if (flag == 1) {
                break;
            }
        }

        //第四步驟之二：未答對，遊戲結束
        if (flag == 0) {
            System.out.printf("猜了三次也沒猜對，答案是%d。\n", g.number);
        }
    }
}

/*《程式語言教學誌》的範例程式
   http://kaiching.org/
   檔名：CMD.java
   功能：猜數字遊戲的終端機版本
   作者：張凱慶 */
