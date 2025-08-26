package day07_250826;

class Parent {
    Parent(){
        System.out.println("Parent 생성자 실행");
    }
    int i = 5;

    public int getI() {
        return i;
    }
}
class Child extends Parent {
    Child(){
        System.out.println("Child 생성자 실행!!");
    }
    int i = 10;   //i가 오버라이딩 된 상태.

    public int getI(){
        return i;
    }

    public void print(){
        System.out.println(i);
    }
}

public class Exam01 {

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i);
        System.out.println(p.getI());

        Child c = new Child();
        System.out.println(c.i);
        System.out.println(c.getI());

        Parent pc = new Child();
        System.out.println(pc.i);
        System.out.println(pc.getI());

        System.out.println("==============================");
        test(p);

        System.out.println("==============================");
        test(c);        // 출력값 5, 10임
                        // c.i, c.getI() 면 10, 10 아닌지?
                        // test의 파라미터가 Parent 타입임. c의 주소값을 받았는데
                        // 타입은 Parent로 묵시적 형변환이 일어나서 Parent 타입의 변수값 5를 출력
                        // getI()는 오버라이드 된게 있으니까 자식의 메소드를 사용 -> child의 i인 10 출력
    }

    public static void test(Parent p){
        System.out.println(p.i);
        System.out.println(p.getI());

//        p.print();                // print는 Child에서 선언된 메소드라서 Parent 타입으로는 접근이 불가
//        ((Child)p).print();       // 사용하려면 Child로 다운캐스팅 해야함
                                    // 하지만 test(p)를 하면 전달받은 p는 Parent 타입이라 불가
        if (p instanceof Child){    // 그래서 p의 인스턴스가 Child인지 확인을 하고 다운캐스팅을 해야함.
            ((Child)p).print();
        }

        /*
        * 다운캐스팅은, 말씀해주신 것처럼 업캐스팅 되어 생성된 객체는 업캐스팅된 타입의 속성에 접근할 수 있기 때문에
        * 실제로 생성된 객체(자식)의 속성을 사용하고자 한다면 다운캐스팅해서 접근할 수 있습니다.
        * 그냥 부모 클래스를 자식 클래스로의 형변환은, 실제로 생성된 객체가
        * 자식 클래스로 생성된 객체가 아닌 부모클래스의 객체가 생성된 경우라면 생성된 객체 타입이 다르기 때문에 형변환이 불가능한 것입니다!
        *
        * 김주원 멘토님 답변
        * */
    }
}
