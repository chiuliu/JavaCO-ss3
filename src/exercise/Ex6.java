package exercise;

import java.util.Scanner;

public class Ex6 {


    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cot can tinh tong");
        int col = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                if (j == col) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.printf("Tong gia tri cua cot %d la : %d", col, sum);
    }
}
