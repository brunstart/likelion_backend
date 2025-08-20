package day03_250820;

import java.util.Scanner;

public class ForExam3 {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("중단하고 싶은 단을 입력 : ");
//        int dan = sc.nextInt();


        for(int i = 2; i < 10; i++)
        {
            for(int j = 1; j < 10; j++)
            {
//                System.out.print(i + " x " + j + " = " + (i*j) + "\t");
                System.out.printf("%d x %d = %d\t", i, j, i*j);
            }
            System.out.println();
        }

        System.out.println("==========================");

        for(int i = 1; i < 6; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("============================");

        for(int i = 0; i < 5; i++)
        {
            for(int j = 5; j > i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("============================");

        for(int i = 0; i < 5; i++)
        {
            for(int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }

            for(int j = 0; j < 2 * i + 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("============================");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 2 * (5 - i) - 1; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
