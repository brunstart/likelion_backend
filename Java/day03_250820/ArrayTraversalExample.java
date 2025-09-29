package Java.day03_250820;

public class ArrayTraversalExample {
    public static void main(String[] args) {
        int[] scores = {95, 87, 66, 73, 82};

//        1. 배열의 모든 요소 출력
        for(int val : scores)
        {
            System.out.println(val);
        }

//        2.총점, 평균 구하기

        double avg;
        int sum = 0;
        int max = 0;

        for(int val : scores)
        {
            if (val > max)
                max = val;
            sum += val;
        }
        avg = (double)sum /scores.length;

        System.out.printf("최대값 : %d, 총점 : %d, 평균 : %.2f\n", max, sum, avg);

//      모든 객체가 오브젝트의 자손이기 때문에 오브젝트 배열을 만들면 다 넣을 수 있음
        String[] fruits = {"사과", "바나나", "오렌지", "포도"};

        System.out.println("=== 과일 목록 ===");
        for(String fruit : fruits)
        {
            System.out.println("- " + fruit);
        }


    }
}
