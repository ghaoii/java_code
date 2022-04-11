/**
 *给定一个有序整型数组, 实现二分查找
 */

public class HomeWork5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 10));
    }

    public static int binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            //判断key的位置
            if(key < arr[mid]){
                right--;
            }else if(key > arr[mid]){
                left++;
            }else{
                System.out.println("找到了，下标是");
                return mid;
            }
        }
        return -1;
    }
}
