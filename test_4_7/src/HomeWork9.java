/**
 * 求1/1 - 1/2 + 1/3 - 1/4 .... - 1/100
 */

public class HomeWork9 {
    public static void main(String[] args) {
        double sum = 0;
        sum = Sum();
        System.out.println(sum);
    }

    public static double Sum(){
        double ret = 0;
        int flag = 1;
        for (int i = 1; i <= 100; i++) {
            ret += flag * 1.0/i;
            flag = -flag;
        }
        return ret;
    }
}
