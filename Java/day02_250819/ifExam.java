package Java.day02_250819;

public class ifExam {
    public static void main(String[] args) {
        int i = 10;
        i += 5;

//        System.out.println(i);  // i의 값이 10보다 크다면 출력하고 싶다

        int score = 85;

        if (score >= 80)
        {
            System.out.println("합격");
            System.out.println("축하");
        }
        else
        {
            System.out.println("불합격");
            System.out.println("분발");
        }

//        삼항연산자
//        System.out.println((score >= 80 ? "합격" : "불합격"));

//        System.out.println("프로그램 종료");

        score = 87;
        char grade;
        if (score >= 90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        }else if (score >= 70){
            grade = 'C';
        }else if (score >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.println("점수: " + score);
        System.out.println("학점: " + grade);



    }
}
