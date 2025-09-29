package Java.day04_250821;

public class ArrayExam {
    public static void main(String[] args) {

//        실습 1 : 길이 10인 int 배열, 1~10 저장 후 짝수 출력
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++)
        {
            arr[i] = i+1;
        }

        for(int num : arr)
        {
            if (num % 2 == 0)
                System.out.println(num);
        }

//        실습 2 : 정수 배열에서 최대값과 최소값을 찾는 프로그램 작성

        int[] arr2 = {1, 3, 4, 5, 7, 9, 12, 32, 62, 91, 152};
        int max = arr2[0];
        int min = arr2[0];

        for(int num : arr2)
        {
            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }
        System.out.printf("최대값 : %d, 최소값 : %d\n", max, min);


    }
}
