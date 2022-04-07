import java.util.Scanner;

/**
 * 最大公约数
 */

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        //max方法返回a和b的最大值
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        //实际上a < b也可以
        //求最大公约数
        int ret = Gcd(max, min);
        System.out.println("最大公约数是：" + ret);
    }

    public static int Gcd(int a, int b){
        int tmp = 0;
        while(b > 0){
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return tmp;
    }
}
