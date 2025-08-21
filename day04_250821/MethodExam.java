package day04_250821;

public class MethodExam {

//    입력 x, 반환 x
    public void m1()
    {
        System.out.println("할일만함");
    }

    //    입력 o, 반환 x
    public void m2(int x)
    {
        System.out.println(x);
    }


    //    입력 x, 반환 o
    public int m3()
    {
        return 10;
    }

    //    입력 여러개, 반환 x
    public void m4(int x, int y)
    {
        System.out.println("ddd");
    }

    //    입력 o, 반환 o
    public int m5(int x)
    {
        System.out.println("할일하고");
        return x;
    }

//    매개변수(parameter) : 메소드 정의 시 선언하는 변수
//    전달인자(argument) : 메소드 호출 시 전달하는 실제 값

}
