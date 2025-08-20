package day03_250820;

public class DoWhileExam {
    public static void main(String[] args) {

        int i = 10;

        do{        // 조건 비교 없음. 무조건 해당블럭을 한 번은 실행함. 조건이 false여도 한번은 실행함.
            System.out.println(i++);
        }while(i < 5);

        System.out.println("==============================");

        int sum = 0;
        i = 1;

//        1부터 100까지의 합
        while(i <= 100)
        {
//            System.out.println(i);
            sum += i;
            i++;
        }
        System.out.println("sum : " + sum);

        System.out.println("================================");

//        10부터 1까지 역순으로 출력
        i = 10;

        do{
            System.out.println(i--);
        }while(i >= 1);

        System.out.println("================================");

//        20이하의 홀수만 출력
        i = 0;

        while(i < 20)
        {
            if (i++ % 2 == 1)
                continue;
            System.out.println(i);
        }

        System.out.println("=================================");

//        조건이 처음부터 false여도 1회 실행되는 do/while문
        i = 105;

        do{
            System.out.println(i++);
        }while(i < 10);

    }
}
