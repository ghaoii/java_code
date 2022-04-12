import java.util.Arrays;

/**
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现
 */
public class HomeWork7 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,7,8,9};
        int[] ret = sum(arr, 9);
        System.out.println(Arrays.toString(ret));
    }

    public static int[] sum(int[] arr, int target){
        int[] ret = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

}
