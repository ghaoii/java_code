import java.util.Scanner;

/**
 * 验证登陆
 */

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请设置您的密码");
        String set = in.nextLine();
        //验证密码
        confirm(set);
    }

    public static void confirm(String set){
        Scanner in = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.println("请验证您的密码");
            String password = in.nextLine();
            count++;
            if(password.equals(set)){
                System.out.println("密码正确，登陆成功！");
                break;
            }else{
                System.out.println("密码输入错误!");
                if(count == 3){
                    System.out.println("尝试次数过多，退出程序");
                    break;
                }
            }
        }
    }
}
