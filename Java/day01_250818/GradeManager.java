package Java.day01_250818;

/**
 * 학생 성적을 관리하고 처리하는 유틸리티 클래스입니다.
 *
 * <p>이 클래스는 점수를 학점으로 변환하고,
 * 여러과목의 평균을 계산하는 기능을 제공합니다.</p>
 *
 * @author 양승민
 * @version 1.0
 * @since 2025-08-18
 */
public class GradeManager {
    /**
     * 점수를 학점으로 변환합니다.
     *
     * <p>변환 기준:
     * <ul>
     *     <li>90점 이상 : A</li>
     *     <li>80점 이상 : B</li>
     *     <li>70점 이상 : C</li>
     *     <li>60점 이상 : D</li>
     *     <li>60점 미만 : F</li>
     * </ul>
     * </p>
     * @param score 변환할 점수 (0-100 범위)
     * @return 변환된 학점 (A, B, C, D, F)
     * @throws IllegalArgumentException 점수가 0-100 범위를 벗어난 경우
     */
    public static char convertToGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("점수는 0-100 사이여야 합니다");
        }

        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    /**
     * 여러 과목의 평균 점수를 계산합니다.
     *
     * @param scores 각 과목의 점수 배열
     * @return 평균 점수 (소수점 둘째 자리까지)
     * @throws IllegalArgumentException 점수 배열이 null이거나 비어있는 경우
     */
    public static double calculateAverage(int[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("점수 배열이 비어있습니다");
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return Math.round((double)sum / scores.length * 100) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println(convertToGrade(75));
        System.out.println(calculateAverage(new int[] {80,82,94,97,100,66,72,92,80,90}));
    }
}