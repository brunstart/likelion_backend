package Java.day05_250822;

public class StaticExam {
    int i;
    static int si;

    public void method()
    {
        System.out.println(i);
        System.out.println(si);
    }

    public void method2()
    {
        method();
        smethod();
        smethod2();
    }

//    static 키워드가 있는 메소드, 필드는 객체가 인스턴스화 되기 전에 메모리에 올라감
    public static void smethod()
    {
//        static한 메소드에서는 static한 필드만 접근 가능
//        System.out.println(i);    객체가 인스턴스화 되지 않았기 때문에
        System.out.println(si);
    }

    public static void smethod2()
    {
        smethod();
//        method2();
    }

    public static void main(String[] args) {
        System.out.println(si);
        smethod();

//        인스턴스 필드, 메소드는 반드시 객체가 인스턴스화 되어야 쓸 수 있다.
    }
}
