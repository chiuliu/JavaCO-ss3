package exercise;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length ; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr3.length-1; i > arr1.length-1 ; i--) {
            arr3[i] = arr2[i -(arr1.length) ];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }
}
