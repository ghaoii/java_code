/**
 * 实现一个方法 sum, 以数组为参数, 求数组所有元素之和
 */
public class HomeWork2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("sum = " + sum(arr));
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

}
