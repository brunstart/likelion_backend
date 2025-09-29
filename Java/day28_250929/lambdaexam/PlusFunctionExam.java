package Java.day28_250929.lambdaexam;

public class PlusFunctionExam {
    public static void main(String[] args) {
        PlusFunction plus = (int i, int j) -> {
            return i + j;
        };

        PlusFunction plus2 = (i, j) -> { // 타입을 생략해도, 타입을 추론해서 실행
            return i + j;
        };

        PlusFunction plus3 = (i, j) -> i + j;

    //     plus, plus2, plus3 모두 동일하다.
    }
}
