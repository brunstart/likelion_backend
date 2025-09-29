package Java.day06_250825;

class Parent {
    int i = 10;
    int j = 20;
}

// 상속 - 부모가 가진 속성과 기능을 그대로 물려 받는 것
class Child extends Parent {

}

public class Exam01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i);
        Child c = new Child();
        System.out.println(c.i);
        System.out.println(c.j);
    }
}
