import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;

/**
 * 给定一个整型数组, 实现冒泡排序(升序排序)
 */

public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if(isSorted){
                return;
            }
        }
    }

}
