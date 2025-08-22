package day05_250822;

import java.util.Scanner;

public class Calculator {
//    계산기
//    속성 - 크기, 표시할 수 있는 자릿수
//    기능 -  숫자버튼, 더하기, 빼기, 곱하기, 나누기, 제곱 구하기

    public static void main(String[] args) {

        Calculator c = new Calculator();

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력 : ");
        int firstNumber = sc.nextInt();
        System.out.println("두번째 숫자 입력 : ");
        int secondNumber = sc.nextInt();
        System.out.println("연산자 입력(+,-,*,/,^) : ");
        char operator = sc.next().charAt(0);

        switch (operator)
        {
            case '+':
                c.add(firstNumber, secondNumber);
                break;
            case  '-':
                c.sub(firstNumber, secondNumber);
                break;
            case '*':
                c.mul(firstNumber, secondNumber);
                break;
            case '/':
                c.div(firstNumber, secondNumber);
                break;
            case '^':
                c.square(firstNumber, secondNumber);
                break;
            default:
                System.out.println("잘못된 연산자 입력");
                break;
        }


    }

    void add(int a, int b)
    {
        System.out.printf("%d + %d = %d\n", a, b, a+b);
    }

    void sub(int a, int b)
    {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }

    void mul(int a, int b)
    {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
    }

    void div(int a, int b)
    {
        if (b == 0) {
            System.out.println("0으로는 나눌 수 없습니다.\n");
        }
        else {
            System.out.printf("%d / %d = %d\n", a, b, a / b);
        }
    }

    void square(int a, int b)
    {
        if (b == 0)
            System.out.printf("%d ^ 0 = 1\n", a);
        else
            System.out.printf("%d ^ %d = %d\n", a, b, (int)Math.pow(a, b));
    }
}
