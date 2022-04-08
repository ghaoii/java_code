import java.util.Scanner;

/**
 * 汉诺塔问题
 */

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入圆盘的数量");
        int num = in.nextInt();
        hanoi(num, 'A', 'B', 'C');
    }

    /**
     * 思想方法：
     * 1.首先如果只有一个的话，我们直接把圆盘从A -> C即可
     * 2.如果是两个及两个以上，我们假设是n个
     * 3.无论n是多少，你都只当成两个，即 n 和 n-1
     * 4.此时，你只需要把 n-1 从 A -> B
     * 5.然后把 n 从 A -> C
     * 6.接下来就是把 n-1 从 B 挪到 C，这样就完成了
     * 7.在过程中，不需要去思考那个 n-1 到底是怎么移动的，只需要把 n-1 个当成一个整体
     *
     *
     * @param num
     * @param a
     * @param b
     * @param c
     * @return
     */

    public static void hanoi(int num, char a, char b, char c){
        if (num == 1) {
            System.out.println("第" + num + "个圆盘从" + a + " -> " + c);
        }else{
            hanoi(num - 1, a, c, b);//借助c把 n-1个从a移动到b
            System.out.println("第" + num + "个圆盘从" + a + " -> " + c);//把第n个从a移动到c
            hanoi(num - 1, b, a, c);//借助a把n-1个从a移动到c
        }
    }

}
