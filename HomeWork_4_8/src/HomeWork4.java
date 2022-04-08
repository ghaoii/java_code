import java.util.Scanner;

/**
 * 返回的数字之和
 */

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ret = sum(n);
        System.out.println(ret);
    }

    public static int sum(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + sum(n / 10);
    }

}
