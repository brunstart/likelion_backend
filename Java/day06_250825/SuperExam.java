package Java.day06_250825;

class Parent3{
    int i = 10;

    public void print()
    {
        System.out.println("parent : " + i);
    }

    public Parent3(){           // 부모의 기본 생성자가 없을 경우 자식 생성자에서 부모의 다른 생성자를 반드시 명시해야함
        System.out.println("Parent3");
    }

    public Parent3(int i)
    {
        System.out.println("Parent3 int");
    }
}

class Child3 extends Parent3{
    int i = 20;

    public void childMethod()
    {
        System.out.println("Child method");
    }

    public void print(){
        super.print();
        System.out.println("child : " + i);
    }

    public Child3(){
        super();
        System.out.println("Child3");
    }

    public Child3(int i)
    {
        super();
        System.out.println("Child3 int");
    }

    public int getI(){
        return i;
    }
}

public class SuperExam {
    public static void main(String[] args) {
//        Parent3 parent3 = new Parent3();
        Child3 c = new Child3(10);

        System.out.println(c.i);
        System.out.println(c.getI());
        c.print();


//        필드는 타입을 따른다
        Parent3 p = new Child3();
//        p.childMethod();           // Child3 인스턴스인데 childMethod를 못쓰는 이유
//                                      chileMethod를 갖고는 있지만 타입이 Parent3이기 때문에 자신이 물려준것만 사용가능
        ((Child3)p).childMethod();   // 이 때 Child3로 형변환을 해주면 childMethod를 사용이 가능
    }
}
