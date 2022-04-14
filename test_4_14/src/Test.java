

//public class Test {
//    public static void main(String[] args) {
//        Person per1 = new Person();
//        Person per2 = new Person();
//        per1.name = "hello";
//        per1.age = 18;
//        per2.name = "hi";
//        per2.age = 20;
//        per1.show();
//        per2.show();
//        per2.country = "China";
//        per1.show();
//        per2.show();
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        System.out.println(Person.country);
//
//        Person per = null;
//        System.out.println(per.country);
//    }
//}

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("旧密码是：" + bank.getPassword());
        bank.setPassword();
        System.out.println("新密码是：" + bank.getPassword());
    }
}

class Bank{
    private int cardNum;
    private double money;
    private String password = "123456";

    public int getCardNum() {
        return cardNum;
    }

    public double getMoney() {
        return money;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        int count = 0;
        while(true){
            System.out.println("请输入您原来的密码：");
            Scanner in = new Scanner(System.in);
            String oldPass = in.nextLine();
            if(oldPass.equals(password)){
                System.out.println("密码正确，请修改密码");
                System.out.println("输入新密码：");
                String newPass = in.nextLine();
                password = newPass;
                System.out.println("密码修改成功");
                break;
            }else{
                System.out.println("密码输入错误");
                count++;
                if(count == 3){
                    System.out.println("尝试此处过多，银行卡锁定");
                    break;
                }
            }
        }
    }
}


class Person {
    String name;
    int age;
    static String country = "China";

    void show() {
        System.out.print("调用非静态方法：");
        System.out.println("name = " + name + ", age = " + age + ", country = " + country);
    }

    static void fun() {
        System.out.println("调用静态方法");
        //show(); error
        System.out.println(Person.country);
    }
}




//public class Test {
//    public static void main(String[] args) {
//        String s;
//        System.out.println(s);
//    }
//}

//public class Test{
//    static boolean Paddy;
//    public static void main(String args[]){
//        System.out.println(Paddy);
//    }
//}

//public class Test {
//    String name;
//    int age;
//    private static String country;
//
//    public static void main(String[] args) {
//        Test per1 = new Test();
//        per1.country = "中国";
//        System.out.println(country);
//        country = "漂亮国";
//        System.out.println(country);
//    }
//}

