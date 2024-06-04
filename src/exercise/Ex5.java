package exercise;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng : ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        System.out.println("Nhập từng giá trị trong mảng : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Giá trị thứ : " + i + 1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
