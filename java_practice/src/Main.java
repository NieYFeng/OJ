import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] arr= new int[7], table= new int[7];
    static int blue;
    static int r_cnt = 0, b_cnt = 0;

    public static void main(String[] args) {
        creat_random();
        for (int i = 0; i <= 6; i++)
            System.out.println(table[i]);
        input();
        judge();
        for (int i = 0; i <= 6; i++)
            System.out.println(arr[i]);
        String res = r_cnt + "" + b_cnt + "";
        switch (res) {
            case "61":
                System.out.println("一等奖");
                break;
            case "60":
                System.out.println("二等奖");
                break;
            case "51":
            case "50":
                System.out.println("三等奖");
                break;
            default:
                System.out.println("没奖");
        }
    }

    static void judge() {
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++) {
                if (table[i] == arr[j]) {
                    r_cnt++;
                }
            }
        if (blue == arr[6])
            b_cnt++;
    }

    static void creat_random() {
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            table[i] = r.nextInt(33) + 1;
        }
        blue = r.nextInt(16) + 1;
    }

    static void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入红球对应数字");
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("请输入蓝球对应数字");
        arr[6] = in.nextInt();
    }
}



