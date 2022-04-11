/**
 * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
 */
public class HomeWork10 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,7,9,8};
        int[] arr2 = {1,2,3,5,7,9,8};
        threeOdd(arr1);
        threeOdd(arr2);
    }

    public static void threeOdd(int[] arr){
        boolean tmp = false;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            while(arr[i] % 2 == 1){
                count++;
                i++;
            }
            if(count >= 3){
                tmp = true;
                System.out.println("true");
                break;
            }
        }
        if(!tmp){
            System.out.println("false");
        }
    }

}
