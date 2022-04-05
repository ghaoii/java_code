//public class Test {
//    public static void main(String[] args) {
////        char a = 'a';
////        int b = a;
////        char c = 'A';
////        int d = c;
////        System.out.println(b);
////        System.out.println(d);
//
////        int a = 97;
////        char b = (char)a;
////        System.out.println(b);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int num = 10;
//        String str1 = "" + num;//任意字符串和其他类型"+"，都会把其他类型转为字符串
//        String str2 = String.valueOf(num);//利用对象valueof将int -> String
//
//        System.out.println(str1);//执行结果 10
//        System.out.println(str2);//执行结果 10

//        String str1 = "123";//纯数字组成的字符串
//        String str2 = "123abc";//不是有纯数字组成的字符串
//
//        //把str1这个字符串变量转为int型
//        int a = Integer.parseInt(str1);//执行结果 123
//
//        //把str2这个字符串变量转为int型
//        int a = Integer.parseInt(str2);//编译失败
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        int a;
//        System.out.println(a);
//    }
//}

//public class Test {
//    int a;
//    double b;
//    char c;
//    boolean d;
//    String str;
//    public static void main(String[] args) {
//        System.out.println(new Test().a);
//        System.out.println(new Test().b);
//        System.out.println(new Test().c);
//        System.out.println(new Test().d);
//        System.out.println(new Test().str);
//    }
//}

public class Test {
    public static void main(String[] args) {
//        System.out.println(5 % 2);//执行结果 1
//        System.out.println(11.5 % 2);//执行结果 1.5

//        int a = 120;
//        while(a > 0){
//            System.out.println(a % 10);
//            a /= 10;
//        }

//        int a = 1;
//        System.out.println(a++);//执行结果 1
//        int b = 1;
//        System.out.println(++b);//执行结果 2

//        int a = 10;
//        int b = 20;
//        int c = 30;
//        System.out.println(a < b || b < c);//执行结果 true
//        System.out.println(a < b || b > c);//执行结果 true
//        System.out.println(a > b || b > c);//执行结果 false

//        int a = 10;
//        int b = 20;
//        System.out.println(!(a > b));//执行结果 ture
//        System.out.println(!(a < b));//执行结果 false

//        System.out.println(10 > 20 && 10 / 0 == 0);//执行结果为 false
//        System.out.println(10 < 20 || 10 / 0 == 0);//执行结果为 true

        int a = 10;
        int b = -20;
        System.out.println(~a);//执行结果 -11
        System.out.println(~b);//执行结果 19
    }
}