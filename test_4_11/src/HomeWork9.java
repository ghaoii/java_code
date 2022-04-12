/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class HomeWork9 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,3,3,2,3,2,};
        //摩尔投票法
        int count = 1;
        int major = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(major == arr[i]){
                count++;
            }else{
                count--;
            }
        }



        //排序解法
//        bubbleSort(arr);//排序
//        System.out.println(arr[arr.length >> 1]);


        //双引用 - 暴力解法
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[j] == arr[i]){
//                    count++;
//                }
//            }
//            if(count >= arr.length / 2){ //问题
//                System.out.println(arr[i]);
//                break;
//            }
//        }



//        int i = 0;
//        while(i < arr.length - 1){
//            int count = 1;
//            while(i < arr.length - 1 && arr[i] == arr[i + 1]){
//                count++;
//                i++;
//            }
//
//            if(count >= arr.length / 2){
//                System.out.println("多数元素是：" + arr[i]);
//                break;
//            }
//            i++;
//        }
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

}
