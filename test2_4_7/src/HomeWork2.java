import java.util.Scanner;

/**
 * 求N的阶乘
 */

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ret = factor(n);
        System.out.println(ret);
    }

    public static int factor(int n){
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

}
