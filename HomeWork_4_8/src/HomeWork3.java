import java.util.Scanner;

/**
 * 递归求斐波那契数列的第 N 项
 */

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ret = fib(n);
        System.out.println(ret);
    }

    public static int fib(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
