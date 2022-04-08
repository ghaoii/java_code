import java.util.Scanner;

/**
 * 递归实现青蛙跳台问题
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ret = jump(num);
        System.out.println(ret);
    }

    public static int jump(int num) {
        if(num == 1){
            return 1;
        }else if(num ==2) {
            return 2;
        }
        return jump(num-1) + jump(num -2);
    }
}
