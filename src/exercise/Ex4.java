package exercise;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số dòng và số cột của ma trận
        System.out.print("Nhập số dòng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử tại vị trí (%d, %d): ", i, j);
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Bước 3: Tìm phần tử lớn nhất và vị trí của nó
        double max = matrix[0][0];
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Bước 4: In ra kết quả
        System.out.printf("Giá trị lớn nhất trong ma trận là: %.2f\n", max);
        System.out.printf("Vị trí của giá trị lớn nhất là: (%d, %d)\n", maxRow, maxCol);
    }
}
