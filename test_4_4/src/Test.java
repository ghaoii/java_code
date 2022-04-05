//public class Test {
//    public static void main(String[] args) {
//        int ¥a = 10;
//        System.out.println(¥a);
//    }
//}

//编写程序数一下 1到 100 的所有整数中出现多少个数字9
//public class Test {
//    public static void main(String[] args) {
//        int count = 0;//统计9出现的次数
//        //100没有9，因此不需要判断
//        for(int i = 1; i < 100; i++){
//            if(i % 10 == 9){
//                count++;
//            }
//            if(i / 10 == 9){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

//输出 1000 - 2000 之间所有的闰年
//public class Test {
//    public static void main(String[] args) {
//        for (int year = 1000; year <= 2000; year++) {
//            //判断闰年
//            if((year % 4 == 0) && (year % 100 != 0)){
//                System.out.println("普通闰年 ：" + year);
//            }else if(year % 400 == 0){
//                System.out.println("世纪闰年 ：" + year);
//            }
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        for(int year = 1000; year <= 2000; year++){
//            if(year % 100 == 0){
//                //判断世纪闰年
//                if(year % 400 == 0){
//                    System.out.println("世纪闰年 : " + year);
//                }
//            }else{
//                if(year % 4 == 0){
//                    System.out.println("普通闰年 : " + year);
//                }
//            }
//        }
//    }
//}

//打印 1 - 100 之间所有的素数
//public class Test {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            //判断是不是1和2
//            if((i == 1) || (i == 2)){
//                System.out.println(i);
//                continue;
//            }
//            //判断素数
//            int j = 0;
//            for (j = 2; j < i; j++) {
//                if(i % j == 0){
//                    break;
//                }
//            }
//            //如果是素数就打印
//            if(i == j){
//                System.out.println(i);
//            }
//        }
//    }
//}


import java.util.Scanner;

//给定一个数字，判定一个数字是否是素数
//public class Test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int i = 0;
//        for (i = 2; i < a; i++) {
//            if(a % i == 0){
//                break;
//            }
//        }
//        if(a == 1 || a == 2){
//            System.out.println("是素数");
//        }else if(i == a){
//            System.out.println("是素数");
//        }else{
//            System.out.println("不是素数");
//        }
//    }
//}


//根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
//public class Test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int age = input.nextInt();
//        if(age <= 18){
//            System.out.println("少年");
//        }else if(age <= 28){
//            System.out.println("青年");
//        }else if(age <= 55){
//            System.out.println("中年");
//        }else{
//            System.out.println("老年");
//        }
//    }
//}

//完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
//public class Test {
//    public static void main(String[] args) {
//        int key = 20;
//        Scanner input = new Scanner(System.in);
//        while(input.hasNextInt()){
//            int num = input.nextInt();
//            if(num < key){
//                System.out.println("你猜小了！");
//            }else if(num > key){
//                System.out.println("你猜大了！");
//            }else{
//                System.out.println("你猜对了！");
//                break;
//            }
//        }
//    }
//}

//水仙花数
//public class Test {
//    public static void main(String[] args) {
//        for(int i = 100; i < 1000; i++){
//            int ret = 0;
//            int j = i;
//            while(j > 0){
//                int last = j % 10;//用last来存储尾数
//                ret += (last * last * last);
//                j /= 10;
//            }
//            //判断是否为水仙花数
//            if(ret == i){
//                System.out.println(i);
//            }
//        }
//    }
//}

//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
//public class Test {
//    public static void main(String[] args) {
//        double ret = 0;
//        int tmp = 1;
//        for (int i = 1; i <= 100; i++){
//            ret += tmp * 1.0/i;
//            tmp *= -1;
//        }
//        System.out.println(ret);
//    }
//}

//求两个正整数的最大公约数
//public class Test {
//    public static void main(String[] args) {
//        int a = 16;
//        int b = 24;
//        while(a % b != 0){
//            int tmp = a % b;
//            a = b;
//            b = tmp;
//        }
//        System.out.println(b);
//    }
//}

//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，
//最多输入三次。三次均错，则提示退出程序
//public class Test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int k = 3;
//        String true_password = "123456";
//        while(k != 0){
//            System.out.println("请输入密码");
//            String password = input.nextLine();
//            if(password.equals(true_password)){
//                System.out.println("密码输入正确！登陆成功!");
//                break;
//            }else{
//                k--;
//                System.out.println("密码错误，还剩下" + k + "次机会");
//            }
//        }
//        if(k == 0){
//            System.out.println("退出程序！");
//        }
//    }
//}

//输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
//public class Test {
//    public static void main(String[] args) {
//        int a =10200;
//        //判断a是几位数
//        int num = a;
//        int count = 0;
//        while(num > 0){
//            num /= 10;
//            count++;
//        }
//        int j = 1;
//        for(int i = 1; i < count; i++){
//            j *= 10;
//        }
//        //逆序输出
//        while(j != 0){
//            if(j != 1) {
//                System.out.print(a / j + ", ");
//            }else{
//                System.out.println(a / j);
//            }
//            a %= j;
//            j /= 10;
//        }
//    }
//}

public class Test {
    public static void main(String[] args) {
        int a = 1020;
        //统计a的位数
        int num = a;
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        //将a逆置
        int b = 0;
        while(a > 0){
            b = b * 10 + a % 10;
            a /= 10;
        }
        //打印
        while( b != 0 || count != 0){
            if(count > 1){
                System.out.print(b % 10 + ", ");
            }else{
                System.out.print(b % 10);
            }
            b /= 10;
            count--;
        }

//        while(b > 0){
//            System.out.print(b % 10 + " ");
//            b /= 10;
//        }
    }
}

//输出n*n的乘法口诀表，n由用户输入。
//public class Test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.printf("%-2d*%2d = %-3d ", j, i, j*i);
//            }
//            System.out.println();
//        }
//    }
//}