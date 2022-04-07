import java.util.Scanner;

/**
 * 求1！+2！+3！+4！+........+n!的和
 */

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int h = factor(i);
            sum += h;
        }
        System.out.println(sum);
    }

    public static int factor(int n){
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

}
