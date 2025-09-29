package Java.day02_250819;

public class TenaryExample {
    public static void main(String[] args) {
        int a = 30, b = 20;

        int max1;
        if (a > b)
        {
            max1 = a;
        }
        else
        {
            max1 = b;
        }

        int max2 = (a > b) ? a : b;

        System.out.println("if-else 결과: " + max1);
        System.out.println("삼항 연산자 결과: " + max2);

        String result = (a % 2 == 0) ? "짝수" : "홀수";
        System.out.println(a + "는 " + result);

        char grade = (85 >= 80) ? 'B' : 'C';
        System.out.println("학점: " + grade);


    }
}
