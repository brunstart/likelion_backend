package Java.day02_250819;

public class OverflowTest {
    public static void main(String[] args) {
//        int 오버플로우
//        다른 패키지에 있는 클래스를 쓰는 경우 최상단에 import 구문을 이용해 패키지를 불러와야함
//        Integer의 경우 java.lang 패키지에 들어있는데 lang은 너무 많이 써서 import 안해도 됨
//        레퍼 클래스 : 8개의 기본타입을 객체로 변환될 수 있게 해주는 클래스

        int max = Integer.MAX_VALUE;
        System.out.println("int 최댓값: " + max);
        System.out.println("최댓값 + 1: " + (max+1));

//        byte 오버플로우
        byte b = 127;
        System.out.println("byte 최댓값: " + b);
        b = (byte)(b + 1);
        System.out.println("최댓값 + 1: " + b);

//        int 언더플로우
        int min = Integer.MIN_VALUE;
        System.out.println("int 최솟값: " + min);
        System.out.println("최솟값 - 1: " + (min - 1));


    }
}
