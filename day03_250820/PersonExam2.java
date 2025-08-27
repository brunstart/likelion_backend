package day03_250820;

import day04_250821.Person;

public class PersonExam2 extends Person{

    public void test()
    {
        System.out.println(name);
//        System.out.println(age);            //서로 다른 패키지 영역이므로 사용불가
        System.out.println(address);        //패키지는 다르지만 상속관계이므로 사용가능
//        System.out.println(phoneNumber);    //private이라 비공개
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.name = "yang";
//        person.age = 30;                // Person.java와 패키지가 달라서 접근불가
//        person.address = "강원도";       // Person.java와 PersonExam2의 패키지가 달라서 접근불가
//        person.phoneNumber = "";        // private 필드여서 접근불가

        PersonExam2 personExam2 = new PersonExam2();
        System.out.println(personExam2.address);        // PersonExam2는 Person을 상속받았기 때문에 address에 접근이 가능
    }
}
