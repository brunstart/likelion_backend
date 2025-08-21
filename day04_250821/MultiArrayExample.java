package day04_250821;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {
//        선언 - [][] 몇개인지가 차원을 결정.
        int[][] iarr;
        iarr = new int[3][2];   // 3은 1차원 배열을 가리키는 주소값이 들어감
                                // 2는

        int[][] iarr2 = new int[2][];
        iarr2[0] = new int[2];
        iarr2[0][0] = 10;
        iarr2[1] = new int[10];
        iarr2[1][0] = 20;

        System.out.println(iarr2[0][0]);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix[2][1]);

        int[][] iarr7 = {{1,2}, {3,4,5,6,7}, {8}};
        System.out.println(iarr7[1][2]);

//        2차원 배열 순회
        System.out.println("2차원 배열 출력");
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        가변 길이 2차원 배열
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1,2};
        jagged[1] = new int[]{3,4,5,6,7};
        jagged[2] = new int[]{8,9,10};

        System.out.println("\n=== 가변 길이 배열 ===");
        for(int[] row : jagged)
        {
            System.out.println(Arrays.toString(row));
        }

    }
}
