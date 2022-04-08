import java.util.Scanner;

/**
 * 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
 */

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        printNum(num);
    }

    public static void printNum(int num){
        if(num >= 10){
            printNum(num / 10);
        }
        System.out.print(num % 10 + " ");
    }

}
