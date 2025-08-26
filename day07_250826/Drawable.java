package day07_250826;

// 추상클래스 : 클래스, 미완성 메소드를 가질 수 있는 클래스
// 인터페이스 : 껍데기만 갖는다. - 구현체가 없는 것이 기본
public interface Drawable {
    void draw();    // 추상메소드(구현부가 없는 메소드)
    void erase();
}
