package Java.day02_250819;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력 (1~7) : ");
        int day = sc.nextInt();

        if (day == 1)
        {
            System.out.println("월요일입니다.");
        }
        else if (day == 2)
        {
            System.out.println("화요일입니다.");
        }
        else if (day == 3)
        {
            System.out.println("수요일입니다.");
        }
        else if (day == 4)
        {
            System.out.println("목요일입니다.");
        }
        else if (day == 5)
        {
            System.out.println("금요일입니다.");
        }
        else if (day == 6)
        {
            System.out.println("토요일입니다.");
        }
        else if (day == 7)
        {
            System.out.println("일요일입니다.");
        }
        else
        {
            System.out.println("잘못된 숫자 입력");
        }
    }
}
