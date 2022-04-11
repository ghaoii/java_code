/**
 *  给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */

public class HomeWork8 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,5,6,4,1,2};
        System.out.println("只出现了一次的数字是：" + findSingle(arr));
    }

    public static int findSingle(int[] arr){
        int ret = 0;
        for (int i : arr) {
            ret = ret ^ i;
        }
        return ret;
    }

}
