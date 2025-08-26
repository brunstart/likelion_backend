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
    }
}
