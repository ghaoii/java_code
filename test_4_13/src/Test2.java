import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int[] arr1 = {3,2,3};
        int[] arr2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr1));
        System.out.println(majorityElement(arr2));
    }
    //homework1
    public static int[] twoSum(int[] arr, int target){
        int[] ret = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }


    //homework3 - 摩尔投票法
    public static int majorityElement(int[] arr){
        int major = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == major){
                count++;
            }else{
                count--;
                if(count == 0){
                    major = arr[i];
                    count = 1;
                }
            }
        }
        return major;
    }

    //homework4
    public static boolean threeOdd(int[] arr){
        int count = 0;//表示连续出现的次数
        for (int i : arr) {
            if (i % 2 == 1) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                //此时碰到了偶数
                count = 0;
            }
        }
        return false;
    }

    //扩展 - 如果找出两个出现最多的元素
//    public static int[] twoMajorityElement(int[] arr){
//        int major1 = -1;
//        int major2 = -1;//-1表示目前没有候选人
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(major1 == arr[i]){
//                count1++;
//            }else if(major2 == arr[i]){
//                count2++;
//            }else if(count1 == 0){
//                major1 = arr[i];
//                count1 = 1;
//            }else if(count2 == 0){
//                major2 = arr[i];
//                count2 = 1;
//            } else{
//                count1--;
//                count2--;
//            }
//        }
//        return new int[] {major1, major2};
//    }



    //homework3 - 排序后的中间元素
//    public static int majorityElement(int[] arr){
//        Arrays.sort(arr);
//        return arr[arr.length / 2];
//    }

    //homework3 - 暴力解法
//    public static int majorityElement(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//                if(count > arr.length / 2){
//                    return arr[i];
//                }
//            }
//        }
//        return -1;//不存在返回-1
//    }


    //homework 2
//    public static int single(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(count == 1){
//                return arr[i];
//            }
//        }
//        return -1;
//    }

}
