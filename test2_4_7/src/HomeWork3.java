/**
 * 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
 * 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
 */

public class HomeWork3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        int ret = max3(a,b,c);
        System.out.println("最大值为：" + ret);
    }

    public static int max2(int x, int y){
        int max = x > y ? x : y;
        return max;
    }

    public static int max3(int x, int y, int z){
        int a = max2(x, y);
        int b = max2(a, z);
        return b;
    }

}
