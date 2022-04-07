import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 */

public class HomeWork7 {
    public static void main(String[] args) {
        Random random = new Random();
        //生成随机数的返回，默认是上限，正整数
        //生成0-100的随机数
        //在Java中基本上带取件的规则都是左闭右开规则
        int k = random.nextInt(100);
        System.out.println(k);
        guess(k);
    }

    public static void guess(int x){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("请猜数字");
            int num = in.nextInt();
            if(num > x){
                System.out.println("你猜大了");
            }else if (num < x){
                System.out.println("你猜小了");
            }else{
                System.out.println("你猜对了");
                break;
            }
        }
    }
}
