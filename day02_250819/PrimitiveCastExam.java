package day02_250819;

public class PrimitiveCastExam {
    public static void main(String[] args) {
//        형변환 - 관련있는 것들끼리만 변환할 수 있다.
//        기본 - 숫자, boolean

        byte b = 10;
        int i = b;
//        형변환이 일어날 때 값의 크기는 중요하지 않다. 그릇(타입)의 크기가 중요.
        b = (byte)i;    // 명시적 형변환

        byte b2 = (byte)128;
        System.out.println(b2);

//        산술 승격
//        byte, short, char 연산 시 int로 승격
//        피연산자 중 더 큰 타입으로 승격하여 연산
//        JVM은 int를 기본 연산 단위로 사용하여 성능을 최적화하기 때문

        byte c = 10;
        byte d = 20;
//        byte result = c + d;
        int result = c + d;

        char c1 = 'A';
        char c2 = 'B';
//        char result = c1 + c2;
        int result2 = c1 + c2;

        System.out.println(result + "\n" + result2);

        float price = 3.14f;            // float 리터럴에 f 추가할것
        long bigNumber = 300000000L;    // long 리터럴에는 l 추가할것 (1과 혼동할 수 있으니 L로 사용하는것이 좋을듯)


    }
}
