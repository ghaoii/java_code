//public class Test {
//    public static void main(String[] args) {
//        boolean a = true;
//        System.out.println("hello " + a);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int a = 1;
//        double b = 2;
//        System.out.println(a / b);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int a = 1;
//        double b = 2;
//        double c = a / b;
//        System.out.println((int)c);
//    }
//}

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

//public class Test {
//    public static void main(String[] args) {
//        byte a = 10;
//        byte b = 20;
//        byte c = (byte)(a + b);
//        System.out.println(c);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        final byte a = 10;
//        final byte b = 20;
//        byte c = a + b;
//        System.out.println(c);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int a = 153;
//        int ret = a/10%10;
//        System.out.println(ret);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        System.out.println(a == b);
//        System.out.println(a != b);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int max = a>b?a:b;
//        System.out.println(max);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        short a = 128;
//        byte b = (btye)a;
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        double x = 2.0;
//        int y = 4;
//        x /= ++y;
//        System.out.println(x);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        byte a =130;
//        float b = 3.5f;
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int count = 0;
//        int num = 99;
//        if(num % 10 == 9){
//            count++;
//        }
//        if(num / 10 == 9){
//            count++;
//        }
//        System.out.println("9?????????" + count + "???");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        int i = 1;
//        int sum = 1;
//        while(i<=10){
//            sum *= i;
//            i++;
//        }
//        System.out.println(sum);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int i = 1;
//        int h = 1;
//        int sum = 1;
//        while(i<=5){
//            h *= i;
//            sum += h;
//            i++;
//        }
//        System.out.println(sum);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int i = 100;
//        while(i<=200){
//            if(i%3 == 0){
//                System.out.println(i);
//                break;
//            }
//            i++;
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int i = 0;
//        label: while(i<=200){
//            int a = 1;
//            while(a <= 10){
//                if(a % 3 == 0){
//                    System.out.println(a);
//                    label;
//                }
//            }
//        }
//        System.out.println("tuichu");
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        System.out.print();//?????????
//        System.out.println();//?????????
//        System.out.printf();//???????????????
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //??????????????????????????????
//        System.out.println("?????????????????????");
//        String name = scanner.nextLine();
//        System.out.println("?????????????????????");
//        //???????????????????????????
//        int age = scanner.nextInt();
//        System.out.println("?????????????????????");
//        //???????????????????????????
//        double salary = scanner.nextDouble();
//        System.out.println("???????????????????????????");
//        System.out.println("?????????" + name + "????????????" + age + "????????????" + salary);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int ret = 0;
//        while(scanner.hasNextInt()){
//            int i = scanner.nextInt();
//            ret += i;
//        }
//        System.out.println(ret);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int i = 6;
//        if(i % 2 == 0)???{
//            System.out.println("??????????????????");
//        }else{
//            System.out.println("??????????????????");
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int year = 1900;
//        if((year % 4 == 0) && (year % 100 != 0)){
//            System.out.println("???????????????");
//        }else if(year % 400 == 0){
//            System.out.println("???????????????");
//        }else{
//            System.out.println("????????????");
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int num = 99;
//        int count = 0;
//        if(num % 10 == 9){
//            count++;
//        }
//        if(num / 10 == 9){
//            count++;
//        }
//        System.out.println("9?????????????????????" + count);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int day = input.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("??????");
//                break;
//            case 2:
//                System.out.println("??????");
//                break;
//            case 3:
//                System.out.println("??????");
//                break;
//            case 4:
//                System.out.println("??????");
//                break;
//            case 5:
//                System.out.println("??????");
//                break;
//            case 6:
//                System.out.println("??????");
//                break;
//            case 7:
//                System.out.println("??????");
//                break;
//            default:
//                System.out.println("????????????");
//                break;
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int i = 100;
//        while(i<=200){
//            if(i % 3 == 0){
//                System.out.println(i);
//                break;
//            }
//            i++;
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int i = 100;
//        while(i <= 200){
//            if(i % 3 != 0){
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int a = Integer.MAX_VALUE;
//        long b = a + 1;
//        System.out.println(b);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int a = 1;
//        double b = 2;
//        System.out.println(a / b);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        boolean a = (boolean)1;
//        boolena b = true;
//        int c = (int)b;
//    }
//}

public class Test {
    public static void main(String[] args) {
        int a = 10;
        byte b = (byte)a;
        int c = b;
    }
}