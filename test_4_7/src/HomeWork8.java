/**
 * 求水仙花数
 */

public class HomeWork8 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            //判断i是不是水仙花数，是的话返回true并输出，否则返回false
            boolean ret = isNum(i);
            if(ret){
                System.out.println(i);
            }
        }
    }

    public static boolean isNum(int x){
        int a = x % 10;//个位
        int b = x / 10 % 10;//十位
        int c = x / 100;//百位
        int sum = a * a * a + b * b * b + c * c * c;
        return x == sum;
    }
}
