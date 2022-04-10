import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

//    public static void main(String[] args) {
//        int[] arr = {1,3,5};
//        String str = arrToString(arr);
//        System.out.println(str);
//    }
//
//    public static String arrToString(int[] arr){
//        String ret = "[";
//        for (int i = 0; i < arr.length; i++) {
//            ret += arr[i];
//            //如果是数组中的最后一个元素，不需要再加分隔符
//            if(i != arr.length - 1) {
//                ret += ", ";
//            }
//        }
//        ret += "]";
//        return ret;
//    }
////执行结果 [1, 3, 5]

    //模拟实现Array.copyOf
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8};
//        int[] ret = arrayCopyOf(arr, 10);
//        System.out.println(Arrays.toString(ret));
//
//    }
//
//    public static int[] arrayCopyOf(int[] arr, int length) {
//        int[] ret = new int[length];
//        if(length <= arr.length){
//            for (int i = 0; i < length; i++) {
//                ret[i] = arr[i];
//            }
//        }else{
//            for (int i = 0; i < arr.length; i++) {
//                ret[i] = arr[i];
//            }
//            for (int i = arr.length; i < length; i++) {
//                ret[i] = 0;
//            }
//        }
//        return ret;
//    }

    //找最大值
//    public static void main(String[] args) {
//        int[] arr = {1,5,3,5,7,8,9,2,4,6};
//        int max = arrMax(arr);
//        System.out.println("max = arr[" + max + "] = " + arr[max]);
//    }
//
//    public static int arrMax(int[] arr){
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            //如果有元素大于max，则赋值给max，否则什么都不做
//            if(arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }

    //求数组平均数
//    public static void main(String[] args) {
//        int[] arr = {1,3,5,7,9};
//        System.out.println("avg = " + arrAvg(arr));
//    }
//
//    public static double arrAvg(int[] arr){
//        double sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        return sum / arr.length;
//    }

//    public static void main(String[] args) {
//        int[] arr = {1,5,3,5,7,8,9,2,4,6};
//        System.out.println(arrFind(arr, 7));
//    }
//
//    public static int arrFind(int[] arr, int key){
//        for (int i = 0; i < arr.length; i++) {
//            //判断key是否和数组元素相等，相等则返回下标
//            if(key == arr[i]){
//                System.out.print("找到了，下标是");
//                return i;
//            }
//        }
//        //没有找到对应的元素，返回 -1
//        return -1;
//    }

//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println(binarySearch(arr, 8));
//    }
//
//    public static int binarySearch(int[] arr, int key){
//        int left = 0;
//        int right = arr.length - 1;
//        while(left <= right){
//            int mid = (left + right) / 2;//mid每次循环都会变
//            if(key < arr[mid]){
//                right = mid - 1;
//            }else if(key > arr[mid]){
//                left = mid + 1;
//            }else{
//                System.out.print("找到了，下标是");
//                return mid;
//            }
//        }
//        return -1;
//    }
//    //找到了，下标是7

//    public static void main(String[] args) {
//        int[] arr = {1,3,4,5,6,2,9};
//        System.out.println(isSorted(arr));
//    }
//    public static boolean isSorted(int[] arr){
//        for (int i = 0; i < arr.length - 1; i++) {
//            if(arr[i] > arr[i + 1]){
//                return false;
//            }
//        }
//        return true;
//    }
//执行结果 false

//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println(binarySearch(arr, 1, 0, arr.length - 1));
//    }
//
//    public static int binarySearch(int[] arr, int key, int left, int right){
//        if(left > right){
//            //找不到，直接返回
//            return -1;
//        }
//        int mid = (left + right) / 2;
//        if(key < arr[mid]){
//            //key在左区间
//            return binarySearch(arr, key, left, mid - 1);
//        }
//        if(key > arr[mid]){
//            //key在右区间
//            return binarySearch(arr, key, mid + 1, right);
//        }
//        //如果上面都不满足，说明找到了
//        System.out.print("找到了,下标是");
//        return mid;
//    }
//    //执行结果：找到了,下标是0

//    public static void main(String[] args) {
//        int[] arr = {9,8,7,6,5,4,3,2,1};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void bubbleSort(int[] arr){
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean a = true;
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if(arr[j] > arr[j+1]){
//                    a = false;
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j+1] = tmp;
//                }
//            }
//            if(a){
//                return;
//            }
//        }
//    }

//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        int[] arr1 = {1,2,3,4,5};
//        reverse(arr);
//        reverse(arr1);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
//    }
//
//    public static void reverse(int[] arr){
//        int left = 0;
//        int right = arr.length - 1;
//        while(left < right){
//            int tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//    }

//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
//        swap(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void swap(int[] arr){
//        int left = 0;
//        int right = arr.length - 1;
//        while(left < right){
//            //如果全是奇数或者偶数，内层循环坑会越界，因此也要判断left < right
//            while(left < right && arr[left] % 2 == 0){
//                left++;
//            }
//            //如果right左边有奇数，left一定停留在从左到右的第一个奇数，否则一直执行到left==right
//
//            while(left < right && arr[right] % 2 == 1){
//                right--;
//            }
//            //如果left右边有偶数，right一定停留在从右到左的第一个偶数，否则一直执行到left==right
//
//            int tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//    }
//    //执行结果 [6, 2, 4, 3, 5, 1]

    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };//内存的大括号表示一行
        for(int row = 0;row < arr.length;row++){
            for(int col = 0;col < arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    //执行结果

}
