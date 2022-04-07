import java.util.Scanner;

/**
 * 输出乘法口诀表
 */

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你要展示的行数");
        int n = in.nextInt();
        molForm(n);
    }

    public static void molForm(int x){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }

}
