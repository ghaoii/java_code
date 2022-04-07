import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //求n的阶乘
//        int num = in.nextInt();
//        int ret = factor(num);
//        System.out.println(ret);

        //定义一个方法，求出1 + 2 + 3 + ... + n的和
//        int num = in.nextInt();
//        System.out.println(sum(num));

        //写一个方法，这个方法输入一个非负整数，返回组成这个数的各个数字只和
//        int num = in.nextInt();
//        System.out.println(add(num));

        //按顺序输出一个正整数的每一位数字
        int num = 120;
        int num1 = 1234;
        print(num);
        print(num1);
    }

    //逆序输出整数
    public static void print(int num) {
        if(num > 0){
            System.out.print(num % 10 + " ");
            print(num / 10);
        }
    }

    //按顺序输出整数
    public static void printNum(int num) {
        if(num > 9){
            printNum(num / 10);
        }
        System.out.print(num % 10 + " ");
    }

    //求各个数字只和
    public static int add(int num){
        if(num < 10){
            return num;
        }
        return num % 10 + add(num / 10);
    }

    //求和
    public static int sum(int num){
        if(num == 1){
            return 1;
        }
        return num + sum(num-1);
    }

    //求阶乘
    public static int factor(int num){
        if(num == 1){
            return 1;
        }
        return num * factor(num-1);
    }

}

//public class public class Test {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//    }
//}