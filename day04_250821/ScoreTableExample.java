package day04_250821;

public class ScoreTableExample {
    public static void main(String[] args) {
        // 학생별 과목 점수 (3명의 학생, 4과목)
        String[] students = {"김철수", "이영희", "박민수"};
        String[] subjects = {"국어", "영어", "수학", "과학"};
        int[][] scores = {
                {90, 85, 88, 92},  // 김철수
                {85, 90, 95, 88},  // 이영희
                {78, 82, 85, 90}   // 박민수
        };

        System.out.println("=== 성적표 ===");
        System.out.print("이름\t\t");

        for (String sub : subjects)
        {
            System.out.print(sub+"\t");
        }

        System.out.print("총점\t평균\n");
        System.out.println("------------------------------------");

        for(int i = 0; i < students.length; i++)
        {
            int sum = 0;
            double avg;

            System.out.print(students[i]+"\t");
            for(int score : scores[i])
            {
                sum += score;
                System.out.print(score + "\t");
            }
            avg = (double)sum / scores[i].length;
            System.out.printf("%d\t%.1f\n", sum, avg);
        }
    }
}
