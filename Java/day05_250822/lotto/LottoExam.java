package Java.day05_250822.lotto;

public class LottoExam {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();      // lotto 객체 생성
        lotto.reset();                  // 공 배열 초기화
        lotto.play();                   // 추첨

        lotto.reset();
        lotto.play();                   // reset 하지 않고 재추첨 시 초기화 안내문구 출력

    }
}
