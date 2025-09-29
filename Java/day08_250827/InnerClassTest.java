package Java.day08_250827;

public class InnerClassTest {
    public static void main(String[] args) {

//        멤버 내부 클래스 생성
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

//        정적 내부 클래스 생성
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();

//        지역 내부 클래스
        outer.methodWithLocalClass();

//        익명 내부 클래스
        outer.createAnonymousClass();
    }
}
