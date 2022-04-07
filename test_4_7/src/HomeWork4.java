/**
 * 打印 1 - 100 之间所有的素数
 */

public class HomeWork4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            //判断素数
            boolean ret = IsPriNum(i);
            if(ret){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("总共有" + count + "个素数");
    }

    public static boolean IsPriNum(int x){
        for (int i = 2; i < x; i++) {
            if(x % i == 0){
                return false;
            }
        }
        return x > 1;
    }
}
