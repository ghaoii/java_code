/**
 * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2
 * 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
 */

public class HomeWork2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5};
        transform(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = " + arr[i] + ", ");
        }
    }

    public static void transform(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

}
