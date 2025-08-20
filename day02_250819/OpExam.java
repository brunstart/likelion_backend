package day02_250819;

public class OpExam {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;  // = 대입연산자

        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a % b);

        boolean ba = true, bb = false;


        System.out.println(ba && bb);       // AND && 둘 다 true일 경우 true 반환
        System.out.println(ba || bb);       // OR  || 둘 중 하나가 true일 경우 true 반환
        System.out.println(!ba);            // NOT !  입력된 값의 반대값을 반환 (true -> false)
        System.out.println(ba ^ bb);        // XOR ^  둘 중 하나가 false일 경우 true 반환

        System.out.println(1 ^ 2);

        System.out.println("===============단락평가=================");

        int c = 5, d = 8;

        System.out.println((a<b++) && (c<d++));     // && 연산 중 첫번째가 false라서 뒤 조건은 아예 실행을 안하고
                                                    // 넘어감. 그래서 d++가 동작하지 않았기 때문에 8이 출력됨

        System.out.println((a>b++) || (c<d++));     // || 연산 중 첫번째가 true면 결과값이 무조건 true기 때문에
                                                    // 뒤 조건 실행하지 않음. 그래서 d의 값이 8로 출력됨

        System.out.println((a<b++) & (c<d++));      // & 연산은 뒤 조건도 실행함.

        System.out.println(b);
        System.out.println(d);

//        증감연산자
        int incrI = 10;
        System.out.println(++incrI);    // 증가 후 출력

        System.out.println(incrI++);    // 출력 후 증가
    }
}
