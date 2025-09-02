package day12_250903;

public class ExceptionExam {
    public static void main(String[] args) {
//        예외
//        에러와 예외의 차이는?

//        예외처리 : 프로그램 실행 중에 발생할 수 있는 예상치 못한 상황(예외)에 대비하여
//        프로그램의 정상적인 흐름을 유지하고 예외 상황을 안전하게 처리하는 프로그래밍 기법

        int[] iarr = {1,2,3,4};

        int value = 0;

        try{
//            예외가 발생할 것 같은 부분
            value = iarr[4];
            System.out.println(iarr[4]);
            value = 1;
        } catch (Exception e) {
//            예외 처리 로직을 가지는 블럭
//            catch 블럭을 비워두는 것 - 가장 나쁜 예외처리
//            예외가 발생했다는 것 정도는 알려야함
            System.out.println(e);
        }

        System.out.println(value);
        System.out.println("그 다음에 수행해야 할 작업 1");
        System.out.println("그 다음에 수행해야 할 작업 2");
        System.out.println("그 다음에 수행해야 할 작업 3");
        System.out.println("종료");

//        예외가 발생했고, 처리하지 않으면 프로그램이 종료됨
//        프로그램 종료를 막기위해 필요한 것이 예외 처리


    }
}
