package Java.day07_250826;

//  추상 클래스
public abstract class Animal {

    private String name;

    public void eat()
    {
        System.out.println("먹는다.");
    }

    public void move()
    {
        System.out.println("걷다.");
    }

    // 이 클래스를 상속받아 사용할 클래스들에게 강제성을 부여함
    // 해당 기능을 일관성있게 구현하도록 제시하는 기능
    public abstract void makeSound();       // 모든 동물이 소리내는 걸 여기서 구현불가
                                            // 소리낸다. 라는 개념만 넣어놓고 구현은 X -> abstract 키워드 사용
                                            // abstract 메소드는 abstract 클래스 안에서만 쓸 수 있음. 클래스도 abstract 키워드 사용
                                            // 추상클래스의 추상메소드는 반드시 구현해야 함. 안하면 오류남.


}
