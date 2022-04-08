import java.util.Scanner;

/**
 * 递归求 N 的阶乘
 */

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factor(num));
    }

    public static int factor(int num){
        if(num == 1){
            return 1;
        }
        return num * factor(num-1);
    }

}
