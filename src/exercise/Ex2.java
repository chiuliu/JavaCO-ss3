package exercise;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Số phần tử trong mảng là : ");
        int numbers = Integer.parseInt(scanner.nextLine());
        int[] arrNumber = new int[numbers];
        // Nhập phần tử
        System.out.println("Nhập vào " + numbers + " phần tử của mảng :");
        for (int i = 0; i < arrNumber.length ; i++) {
            arrNumber[i] = Integer.parseInt(scanner.nextLine());
        }
//        System.out.println(arrNumber.toString());
        // Nhập x là số cần chèn
        System.out.println("Nhập giá trị cần chèn : ");

        int x = Integer.parseInt(scanner.nextLine());

        // Nhập vào vị trí cần chèn :
        System.out.println( " Nhập vị trí cần chèn");
        int index = scanner.nextInt();

        for (int i = numbers -1; i > index ; i--) {
            arrNumber[i] = arrNumber[i-1];
        }
        arrNumber[index] = x;

        System.out.println("Mảng sau khi chèn là : ");
        for (int i = 0; i < numbers +1  ; i++) {
            System.out.print( arrNumber[i] + "");

        }



    }
}
