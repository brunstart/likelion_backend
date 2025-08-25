package day06_250825;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    @Override
    public void move() {
        System.out.println("강아지가 네 발로 뛰어다닙니다.");
    }

    // Dog만의 고유 메소드
    public void wagTail() {
        System.out.println("꼬리를 흔듭니다.");
    }
}
