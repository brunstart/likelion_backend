package Java.day09_250828;

public class WrapperExam {
    // 1. 객체가 아닌 기본타입을 객체로 변환
    // 2. 문자열을 각 데이터타입으로 형변환
    // 자바 프로그램 외부로부터 입력받는 값들은 모두 문자타입
    // 자바 프로그램 내에서는 각 알맞는 데이터 타입으로 사용될 필요가 있다

    public static void test(Object obj)
    {

    }

    public static void main(String[] args) {
        // 기본타입을 객체인 타입으로 바꾸는 작업 : 박싱
        // 객체타입을 기본타입으로 바꾸는 작업 : 언박싱

        Integer integerValue = 10;
        int intValue = 10;
        integerValue = intValue;    // 자동박싱 (기본 -> 객체로 변환)
        intValue = integerValue;    // 자동언박싱 (객체 -> 기본타입으로 변환)

//        Integer num1 = new Integer(10);     // Deprecated 됨
        Integer num2 = Integer.valueOf(10);     // 권장

        // 문자열 변환
        int parsed = Integer.parseInt("123");
        String str = Integer.toString(456);

        // 진법 변환
        System.out.println(Integer.toBinaryString(10)); // "1010"
        System.out.println(Integer.toOctalString(10));  // "12"
        System.out.println(Integer.toHexString(10));    // "a"

        // 다른 진법 파싱
        int binary = Integer.parseInt("1010", 2);   // 10
        int octal = Integer.parseInt("12", 8);      // 10
        int hex = Integer.parseInt("A", 16);        // 10

        test(10);   // 오류가 안남 -> 오토박싱이 일어난 상태

//        새 b = new ... ; // 뻐꾸기, 참새, 오리
//        b.노래하다(); // 뒤에 어떤 새가 와도 노래하다 그대로 사용

        // 순서가 중요
        // 순서 안 중요
        // key-value 쌍으로 저장

        // 학생 50명의 데이터를 저장
        // 학번 - 학생으로 저장하면 학번으로 검색해서 학생의 정보를 볼 수 있음

        // foreach
        // for - 인덱스에 따라서 1, 2번 ... 전체 크기 먼저 구해서

        // set - 순서가 중요하지 않다 - index 가 없다
        // set에서 모든 데이터를 꺼내는 방법? 전에는 Iterator를 사용했어야만 했는데
        // 이제는 foreach문 쓰면 내부적으로 알아서 해줌
    }
}
