package day02_250819;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
//        라인넘버 옆 우클릭 후 Modify run configuration 옵션으로 args 값 설정 가능


        String str1 = args[0];
//        기본타입을 객체로 바꿔주는 8개의 객체들은 형변환 하는데도 사용됨.
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        System.out.println(i + j);
        System.out.println(i);
        System.out.println(j);

//       스캐너     새 객체생성       키보드
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        int val1 = sc.nextInt();

        System.out.println("입력받은 값 : " + val1);

    }
}
