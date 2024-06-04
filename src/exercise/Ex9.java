package exercise;

public class Ex9 {
    public static void main(String[] args) {
        int[] arr = {1,4,9,13,17,20,10,3,5,7};
        int max = arr[0];
        int max2 = arr[0];
        for (int num : arr) {
            if (num > max) {
                max2 = max;
                max = num;
            } else if (num > max2 && num != max) {
                max2 = num;
            }
        }
        System.out.println(max2);

    }


}
