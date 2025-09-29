package Java.day06_250825;

class Parent1{
    int i = 10;
    public int getI()
    {
        return i;
    }
}

class Child1 extends Parent1 {
//    부모가 가진 것을 자식이 똑같이 다시 정의하는 것 (오버라이딩)
    int i = 20;
    public int getI()
    {
        return i;
    }
}

public class Exam02 {
    Parent1 p1 = new Child1();
//    Child1 c1 = new Parent1();        // 오류 발생. 이유는?

//    새 b = new 참새();
//    새 b2 = new 비둘기();
//
//    비둘기 b3 = new 새();

    public static void main(String[] args) {
//        2. 필드는 타입을 따른다
        Parent1 pp = new Parent1();     // Parent1 타입
        System.out.println(pp.i);
        Child1 cc = new Child1();       // Child1 타입
        System.out.println(cc.i);
        Parent1 pc = new Child1();      // Parent1 타입
        System.out.println(pc.i);


//        3. 메소드는 오버라이드되면 무조건 자식의 것이 사용된다
        System.out.println(pc.getI());
    }
}
