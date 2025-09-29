package Java.day07_250826;

public class PhotoTest {
    public static void main(String[] args) {
        // 추상클래스도 타입으로 사용가능
        // 인터페이스도 타입으로 사용이 가능하다.

        Drawable d = new Photo("a.png", 200,500);       // 타입을 인터페이스로 사용

        // d. 어떤 것 까지 사용이 가능? Drawble이 가진 것까지만 사용 가능
        d.draw();
        d.erase();

        // Drawable d 타입을 사용할 경우의 장점은?
        // 부모 타입을 이용하는 이유 : 부모 타입이 가진것만 사용할 수 있음 -> 타입이 제공하는 것만 접근 가능
        // 원하는 접근 범위 설정이 가능 (보안상의 이유도 되는듯)
    }
}
