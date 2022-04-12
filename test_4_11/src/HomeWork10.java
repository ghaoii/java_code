/**
 * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
 */
public class HomeWork10 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,7,9,8};
        int[] arr2 = {1,2,3,5,7,9,8};
        System.out.println(threeOdd(arr1));
        System.out.println(threeOdd(arr2));
    }

    public static boolean threeOdd(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 1){
                count++;
                if(count >= 3){
                    return true;
                }
            }else{
                count = 0;
            }
        }
        return false;
    }

}
