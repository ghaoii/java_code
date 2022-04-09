/**
 * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
 */

public class HomeWork4 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        int[] ret = copyOf(arr);
        for(int i : ret){
            System.out.print(i + " ");
        }
    }

    public static int[] copyOf(int[] arr){
        int[] ret = new int[arr.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }

}
