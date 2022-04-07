import java.util.Scanner;

/**
 * 昨天上课内容
 */


//public class LastNight {
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        //第一次调用
//        System.out.println("第一次调用方法之前");
//        int sum = add(x, y);
//        System.out.println("第一次方法调用中： x = " + x + ", y = " + y);
//        System.out.println("第一次调用方法之后");
//        System.out.println(sum);
//
//        System.out.println("第二次调用方法之前");
//        sum = add(20, 40);
//        System.out.println("第二次调用方法中： x = 20, y = 40");
//        System.out.println("第二次调用方法之后");
//        System.out.println(sum);
//    }
//
//    public static int add(int x, int y){
//        return x + y;
//    }
//
//}

//public class LastNight {
//    public static void main(String[] args) {
//        //输入一个数，求1到这个数之间每个数的阶乘的和
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            int tmp = factor(i);
//            sum += tmp;
//        }
//
//    }
//    //接收一个整数，求出阶乘值并返回
//    public static int factor(int num){
//        System.out.println("计算" + num +"的阶乘中……");
//        int ret = 1;
//        for (int i = 1; i <= num; i++) {
//            ret *= i;
//        }
//        return ret;
//    }
//}

//public class LastNight {
//    public static void main(String[] args) {
//        int[] arr = {10, 20};
//        System.out.println("arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
//        swapArr(arr);
//        System.out.println("arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
//    }
//
//    public static void swapArr(int[] arr){
//        System.out.println("交换中...");
//        int tmp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = tmp;
//    }
//
//}

//public class LastNight {
//    public static void main(String[] args) {
//        pirntNum(100);
//    }
//
//    public static void pirntNum(int num){
//        for (int i = 1; i <= num; i++) {
//            if(i % 3 == 0){
//                System.out.println(i);
//                //直接终止本次方法的调用，返回调用处继续执行
//                return;
//            }
//        }
//    }
//}

public class LastNight {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println(sum);
        double x = 1.5;
        double y = 2.7;
        double ret = add(x, y);
        System.out.println(ret);
    }

    public static int add(int a, int b){
        return a + b;
    }
    //所有相同功能的方法我们要定义为相同的名称
    //以最大成都减少用户的学习成本
    public static double add(double a, double b){
        return a + b;
    }

}