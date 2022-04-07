import java.util.Scanner;

/**
 * 输入一个数字，判断是否为素数
 */

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        //判断素数
        boolean tmp = isPriNum(num);
        if(tmp){
            System.out.println("是素数");
        }else{
            System.out.println("不是素数");
        }
    }


    public static boolean isPriNum(int x){

        for (int i = 2; i < x; i++) {
            if(x % i == 0){
                return false;
            }
        }
        return x > 1;
    }
}
