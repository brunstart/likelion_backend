package day07_250826;

public class Exam02 {
    public static void main(String[] args) {
//        추상 클래스는 객체 생성이 불가능하다.
//        추상 클래스는 미완성된 설계도 -> 물건 제작 불가 = 인스턴스 생성 불가
//        Animal animal = new Animal();

//        타입으로의 역할은 모두 가능
        Animal animal = new Dog();
        Animal animal1 = new Cat();

//        부모타입으로 자식이 새로 구현한 메소드 사용불가
//        메소드는 오버라이드 되면 무조건 자식 것을 사용
//        추상 메소드로 선언한 경우는 형변환 없이 사용가능
        animal1.makeSound();
    }
}
