package exercise;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String inputString = "tieplequangvippro";
        System.out.println("Nhập ký tự cần đếm");
        char targetChar = scanner.next().charAt(0);
        int count = 0;
        for(int i =0;i<inputString.length();i++){
            if(inputString.charAt(i)==targetChar){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Ký tự không xuất hiện trong mảng");
        }
        else {
            System.out.println("Ký tự " + targetChar + " xuất hiện " +count + " lần");

        }
    }
}
