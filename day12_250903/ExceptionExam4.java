package day12_250903;

public class ExceptionExam4 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
//        try-catch
//        예외 발생하지 않을 경우 catch 블럭은 실행되지 않는다 (핵심)
//        예외가 발생했을 때 모든 catch가 실행되는 것은 아님, 예외에 해당하는 catch 블럭만 실행
//        반드시 실행해야 할 문장이 있다면 -> finally 블럭 사용
        String str = null;
        try{
            int i = Integer.parseInt(args[0]);
//            try 블럭에서도 예외가 발생되면, 발생된 지점부터 나머지 try 블럭안의 문장은 실행되지 않음
            System.out.println(10/i);

//            System.out.println(str.charAt(0));

            System.out.println("try 블럭에서 하는 다음 일");
        }catch (ArithmeticException e){ // catch 블럭이 있다고 해서 모든 예외가 처리되는 것은 아님
            System.out.println("ArithmeticException catch 블럭 실행");
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException 블럭 실행");
            System.out.println(e);
        }finally {
//            예외처리가 되지 않아도 실행됨
            System.out.println("finally 실행");
        }

//        예외가 발생되었다면, 적절히 처리해야만 실행됨
        System.out.println("실행되어야 하는 문장");
        System.out.println("프로그램 종료");
    }
}
