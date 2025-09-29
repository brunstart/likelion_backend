package Java.day07_250826;

public interface SmartDevice {
    void turnOn();
    void turnOff();

//    dafault 메소드 (Java 8+)
    default void reset()
    {
        System.out.println("기본 설정으로 초기화 합니다.");
        turnOff();
        turnOn();
    }

//    static 메소드 (Java 8+)
    static void showInfo()
    {
        System.out.println("스마트 기기 인터페이스 v1.0");
    }
}
