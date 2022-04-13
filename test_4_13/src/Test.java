import java.util.Arrays;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {2,3,3,2,2,3,3};
        int[] arr1 = {1,2,2,3,2,3,3,3};
        System.out.println(majorityElement(arr));
        System.out.println(Arrays.toString(twoEle(arr)));
    }

    /**
     * 求前两个最大数 大于n/3
     * @param arr
     * @return
     */
    public static int[] twoEle(int[] arr){
        int[] ret = new int[2];
        int major1 = -1;
        int major2 = -1;
        int count1 = 0;
        int count2 = 0;
        for (int i : arr) {
            if(major1 == i){
                count1++;
            }else if(major2 == i){
                count2++;
            }else if(count1 == 0){
                major1 = i;
                count1 = 1;
            }else if(count2 == 0){
                major2 = i;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        ret[0] = major1;
        ret[1] = major2;
        return ret;
    }



    //摩尔投票法
    public static int majorityElement(int[] arr){
        int count = 0;
        int major = arr[0];
        for (int i : arr) {
            if (major == i) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                major = i;
            }
        }
        return major;
    }


    //多数元素一定是大于n/2的，因此排序后中间元素一定是多数元素
//    public static int majorityElement(int[] arr){
//        bubbleSort(arr);
//        return arr.length / 2;
//    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }


    //双引用 - 暴力解法
//    public static int majorityElement(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count > arr.length / 2){
//                return arr[i];
//            }
//        }
//        return -1;
//    }

}
