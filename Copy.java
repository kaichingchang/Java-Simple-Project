import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        int right_answer = (int) (Math.random() * 10);

        System.out.printf("請猜出 0 到 9 之間的正整數...\n");
        System.out.printf("總共有三次機會猜出正確數字...\n");
        System.out.printf("準備好了嗎...\n");

        int count = 0;
        int flag = 0;
        while (count < 3) {
            count += 1;
            int guess;
            System.out.printf("請輸入：\n");
            Scanner scanner = new Scanner(System.in);
            guess = Integer.parseInt(scanner.next());
            int result = -1;
            if (right_answer == guess) {
                result = 0;
            }
            else {
                if (right_answer > guess) {
                    result = 1;
                }
                else {
                    result = 2;
                }
            }

            switch (result) {
                case 0:
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

        if (flag == 0) {
            System.out.printf("猜了三次也沒猜對，答案是%d。\n", right_answer);
        }
    }
}

/*《程式語言教學誌》的範例程式
   http://kaiching.org/
   檔名：Copy.java
   功能：猜數字遊戲的 main() 版本
   作者：張凱慶 */
