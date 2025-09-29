package Java.day07_250826;

// 추상클래스 : 클래스, 미완성 메소드를 가질 수 있는 클래스
// 인터페이스 : 껍데기만 갖는다. - 구현체가 없는 것이 기본
public interface Drawable {
    void draw();    // 추상메소드(구현부가 없는 메소드)
    void erase();


//    java version 7까지는 구현체를 가질 수 없었다.
//    version 8에서 추가된 메소드.
//    1. default 메소드 : 필요하면 자식클래스가 오버라이드해서 사용하라는 목적으로 만든 메소드
    default void defaTest()
    {
        System.out.println("필요하면 자식클래스가 오버라이드해서 사용하는 것이 목적");
    }

//    version 8에서 추가된 또 다른 메소드
//    2. static 메소드 : 미리 메모리에 할당돼서 따로 Drawable을 implements하지 않아도 사용가능
    static void showInfo()
    {
        System.out.println("STATIC TEST");
    }
}
