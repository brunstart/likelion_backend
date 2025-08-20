package day03_250820;

public class LabelExam {
    public static void main(String[] args) {

        outter:
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 3; k++){
                if(i == 0 && k == 2)
                    break outter; // 바깥쪽 반복문까지 종료
                System.out.println(i + ", " + k);
            }
        }

        outter:
        for(int i = 0; i < 5; i++){
            for(int k = 0; k < 5; k++){
                if(i == 0 && k == 2)
                    continue outter; // 바깥쪽 반복문의 다음 반복으로
                System.out.println(i + ", " + k);
            }
        }
    }
}
