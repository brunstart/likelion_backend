package Java.day12_250903;

public class ExceptionExam5 {
//    예외처리 2가지 방법
    public static void work1()      // 직접 처리
    {
        int i = 0;
        try{
            System.out.println(10 / i);
        }catch(ArithmeticException e){
            System.out.println("다른 마트로 감");
        }
    }


    public static void work2() throws Exception {  // 예외를 심부른 시킨 쪽으로 알려줌. 책임전가
//        throws 넘기고 싶은 예외
//        예외를 심부름 시킨 쪽으로 알려줌

        int i = 0;

        System.out.println(10 / i);
    }

    public static void main(String[] args) throws Exception {
        work1();

        // Unhandled Exception이 있다고 컴파일 에러가 뜸
//        예외의 종류 - 반드시 처리해야만 하는 예외, checked Exception - 처리 안하면 컴파일부터 안됨
//                  - 처리하지 않아도 컴파일 에러는 발생 안함, unChecked Exception
        work2();

        String str = null;

        str.charAt(0);      // NullPointerException은 unChecked Exception
                            // unChecked Exception은 모두 NullPointerException 으로부터 상속받음

//        FileReader fr = new FileReader();

    }
}
