/**
 * 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
 */
public class HomeWork1 {

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,7,9};
        System.out.println("avg = " + avg(arr));
    }

    public static double avg(int[] arr){
        double sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum / arr.length;
    }

}
