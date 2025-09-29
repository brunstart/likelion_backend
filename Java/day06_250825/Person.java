package Java.day06_250825;

public class Person {
//    필드는 private 선언하는것이 일반적
    private int age;
    private String name;

//    필드가 모두 private 하다면 저 정보를 써야할 때 어떻게 해야할까요?
//    이 객체를 사용할 때 필드에 직접이 아니라 메소드를 통해 접근하도록 함

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
//    위와 같은 메소드 자주 필요
//    -> getter setter라고 칭함

}
