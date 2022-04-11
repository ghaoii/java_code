/**
 * 给定一个整型数组, 判定数组是否有序（递增）
 */

public class HomeWork4 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,7,3,9};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

}
