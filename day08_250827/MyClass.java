package day08_250827;

import java.util.Objects;

public class MyClass {
    private String name;
    private int age;

    public String toString(){
        return "나는 " + name + "입니다.";
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;      // 필드는 타입을 따르기 때문에 Object 타입으로는 name에 접근을 못하기 때문에 MyClass로 형변환함
        return Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.name = "양승민";

        System.out.println(myClass);
        System.out.println(myClass.toString());
//        myClass.toString();

        MyClass myClass2 = new MyClass();
        myClass2.name = "양승민";

//        myClass와 myClass2는 같은 객체일까요? 다른 객체일까요?
        System.out.println(myClass == myClass2);
//        이렇게 비교하면 주소만 비교하므로 다르다고 판단함

//        객체타입과 필드의 값이 같다면 동일하다 라는 판단을 하게하고 싶다
//        equals를 사용
        System.out.println("==============equals==============");
        System.out.println(myClass.equals(myClass2));   // false가 출력됨 -> Object가 의미 없는 equals를 사용했기 때문
    }
}
