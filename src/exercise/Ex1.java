package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] arrNumber = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to delete : ");
        int numDelete = Integer.parseInt(scanner.nextLine());
        int indextoRemove = -1;
        for (int i = 0; i < arrNumber.length; i++) {
            if (numDelete == arrNumber[i]) {
                indextoRemove = i;
                break;
            }
            }
        if (indextoRemove == -1) {
            System.out.println("Không tìm thấy phần tử trong mảng");
        }
       // Thực hiện xóa
        for (int i = indextoRemove; i < arrNumber.length -1; i++) {
            arrNumber[i] = arrNumber[i + 1];

        }
        arrNumber[arrNumber.length -1 ] = 0;


        //in ra
        for (int num : arrNumber) {
            System.out.print( num + " " );

        }

        System.out.println(Arrays.toString(arrNumber));

    }


}
