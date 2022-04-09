

public class Test {

//    public static void main(String[] args) {
//        int[] arr1 = new int[] {1,3,5,7,9};
//        //访问数组arr1的每个元素
//        for (int i = 0; i < arr1.length; i++) {
//            if( i == 2){
//                arr1[i] = 55;
//            }
//        }
//        System.out.println("第三个元素的值为：" + arr1[2]);
//        //JDK1.5引入的for-each循环，增强型for循环
//        for(int i : arr1){
//            if(i == 5){
//                i = 55;//尝试把数组中值为5的元素改为55
//            }
//        }
//        System.out.println("第三个元素的值为：" + arr1[2]);
//    }

//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a, b);
//        System.out.println("a = " + a + ", b = " + b);
//    }
//
//    public static void swap(int a , int b){
//        int tmp = a;
//        a = b;
//        b = tmp;
//    }

    public static void main(String[] args) {
        int[] arr = {10, 20};
        int[] ret = swapArr(arr);
        System.out.println("arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
        System.out.println("ret[0] = " + ret[0] + ", ret[1] = " + ret[1]);
    }

    public static int[] swapArr(int[] arr){
        arr = new int[] {10, 20};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        return arr;
    }
//执行结果
//arr[0] = 10, arr[1] = 20
//ret[0] = 20, ret[1] = 10
}
