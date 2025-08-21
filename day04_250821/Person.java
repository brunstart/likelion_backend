package day04_250821;

public class Person {
    // 인스턴스 필드 (인스턴스가 생성될 때 공간을 확보하는 필드)
    public String name;         // 접근제한자 public : 전체공개
    int age;                    // 생략하는 경우 : 같은 패키지에서만 공개
    protected String address = "서울시";   // 같은 패키지 또는 상속관계에 있다면 공개
    private String phoneNumber; // 비공개 : 객체 내에서만 사용가능


//    static 필드의 경우 메모리에 올라가고 모든 인스턴스들이 해당 필드를 공유함
    // 클래스 필드 (static) : 인스턴스를 생성하기 전에 메모리에 미리 올라가 있는 필드, 인스턴스끼리 공유됨.
    static int count = 0;

    // 상수 (static final)
    static final int MAX_AGE = 150;


    public void printPhoneNumber()
    {
        System.out.println(phoneNumber);
    }
}
