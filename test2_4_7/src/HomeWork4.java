/**
 * 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
 */


public class HomeWork4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double x = 10.5;
        double y = 20.5;
        System.out.println(max(a,b));
        System.out.println(max(x, y));
        System.out.println(max(a, x, y));
    }

    public static int max(int a , int b){
        int max = a > b ? a : b;
        return max;
    }

    public static double max(double a, double b){
        double max = a > b ? a : b;
        return max;
    }

    public static double max(int a, double b, double c){
        double tmp = a + 0.0;
        double x = tmp > b ? tmp : b;
        double max = x > b ? x : c;
        return max;
    }

}
