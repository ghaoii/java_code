import java.util.Scanner;

/**
 * 根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
 */

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = in.nextInt();
        //判断年龄
        howOld(age);
    }
    public static void howOld(int age){
        if(age <= 18){
            System.out.println("少年");
        }else if(age <= 28){
            System.out.println("青年");
        }else if(age <= 55){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }
    }

