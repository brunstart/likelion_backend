package day12_250903;

// 예외처리 방법
// 1. 직접처리 try-catch-finally
// 2. 호출한 쪽에 예외보고, throws

public class ExceptionExam3 {
    public static void methodA(int[] iarr)
    {
        try {
            System.out.println(iarr[5]);
        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] iarr = new int[5];
        methodA(iarr);

        int[] iarr2 = null;
        methodA(iarr2);

        System.out.println("메소드 실행 후 처리할 부분");
    }
}
