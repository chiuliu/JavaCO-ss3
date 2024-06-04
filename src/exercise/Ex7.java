package exercise;

public class Ex7 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.printf("Tong gia tri cac phan tu o duong cheo chinh la: %d", sum);
    }
}

