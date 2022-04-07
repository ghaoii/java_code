/**
 * 从1-100中出现数字9的次数
 */

public class HomeWork2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            count += HowMany9(i);
        }
        System.out.println("9出现的次数是 "  + count);
    }

    public static int HowMany9(int num){
        int count = 0;
        if(num % 10 == 9){
            count++;
        }
        if(num / 10 == 9){
            count++;
        }
        return count;
    }
}
