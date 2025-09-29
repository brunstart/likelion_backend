package Java.day08_250827;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("양승민");
        person.setAge(30);
        person.setAddress("강원도 춘천시");

        System.out.println(person);

        Person yang = new Person("yangseungmin", 30, "강원도 춘천시");
        System.out.println(yang);
    }
}
