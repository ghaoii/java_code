/**
 * 输出1000-2000之间的所有闰年
 */

public class HomeWork3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 2000; i++) {
            //判断i是不是闰年
            //如果是世纪闰年，返回1
            //如果是普通闰年，返回2
            //如果不是闰年，返回0
            int tmp = isLeap(i);
                    //输出闰年
                    if(tmp == 1){
                        System.out.println("世纪闰年: " + i);
                        count++;
                    }else if(tmp == 2){
                        System.out.println("普通闰年: " + i);
                        count++;
                    }
        }
        System.out.println("闰年总共有：" + count + "个");
    }

    public static int isLeap(int year){
        if(year % 100 == 0){
            if(year % 400 == 0){
                return 1;
            }else{
                return 0;
            }
        }else{
            if(year % 4 == 0){
                return 2;
            }else{
                return 0;
            }
        }
    }
}
