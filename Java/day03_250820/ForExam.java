package Java.day03_250820;

public class ForExam {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }

        System.out.println("============================");

//        for(;;){} = while(true){}

        int j = 0;
        for(;j < 10; j++){
            System.out.println(j);
        }

//        변수의 범위(scope) -- 언어마다 차이가 있을 수 있다.
//        자바는 변수의 스코프가 블럭 단위
//        for문 안에서 선언된 변수는 밖에서 못씀.

        System.out.println("============================");

//        무한루프
        for(;;){
            System.out.println("무한 루프");
            break;
        }


    }
}
