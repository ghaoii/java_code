import java.util.Scanner;

/**
 *
 * 输出一个整数的每一位
 */

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        //按顺序输出整数的每一位
        Input(num);
    }

    public static void Input(int num){
        //统计这个数的位数
        int count = 0;
        int tmp = num;
        while(tmp > 0){
            tmp /= 10;
            count++;
        }
        //逆置num，把结果赋值给tmp
        tmp = 0;
        while(num > 0){
            tmp = tmp * 10 + num % 10;
            num /= 10;
        }
        //打印逆置后的num
        while(count > 0){
            System.out.print(tmp % 10 + " ");
            tmp /= 10;
            count--;
        }
    }

}
