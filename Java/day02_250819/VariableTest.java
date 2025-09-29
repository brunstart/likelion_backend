package Java.day02_250819;

public class VariableTest {
    int intValue;       // 클래스변수(전역변수)
    public static void main(String[] args) {

//        변수선언
//        타입 변수명;
        int i = 1;      // 지역변수(로컬변수)

        int x;          // 로컬 변수는 기본값이 0이 아님. 반드시 초기화 후 사용
        x = 0;
        x = 10;
        System.out.println("x : " + x);

        final int MAX_SIZE;    // final : 상수 선언, 상수는 전부 대문자로 표기 : UPPER_SNAKE_CASE
        MAX_SIZE = 0;
//        MAX_SIZE = 10;       // final을 사용할 경우 값을 한번 설정하면 수정 못함.
        System.out.println("MAX_SIZE : " + MAX_SIZE);


//        JAVA = 강형 언어
//        변수의 타입이 정해지는 언어
//        어떤 언어는 그릇의 종류에 상관없이 아무거나 담는 언어 - 약형언어

//        자바의 타입 - 기본타입, 레퍼런스 타입
//        기본타입 - 값이 들어감
//        레퍼런스 타입 - 주소값이 들어감
//        자바프로그램의 대다수는 레퍼런스 타입임.
//        기본타입 - 딱 8개만 존재. - 숫자(정수, 실수), 문자 - 불린
//        정수 : byte, short, int, long
//        실수 : float, double
//        논리 : boolean
//        문자 : char

        byte b = 'a';   // 형변환 - 묵시적 형변환
        System.out.println(b);

        byte c = 'a';
        System.out.println((char)c);    // 명시적 형변환 - 괄호치고 안에 타입을 넣음 (TypeCasting)
//        형변환은 연관있는 것들만 바뀔 수 있음. char <-> byte -- 숫자

        byte 바이트값 = 10;
        System.out.println(바이트값);

//    실습 1 : 기본 타입 변수 선언과 출력
        byte byteVar = 127;
        short shortVar = 32098;
        int intVar = 2147483647;
        long longVar = 931232151039190923L;

        float floatVar = 3.14f;
        double doubleVar = 1.797693134862315;

        boolean boolVar = true;

        char charVar = 'a';

        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);

        System.out.println(floatVar);
        System.out.println(doubleVar);

        System.out.println(boolVar);

        System.out.println(charVar);


    }
}
