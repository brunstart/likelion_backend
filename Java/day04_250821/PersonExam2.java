package Java.day04_250821;

public class PersonExam2 {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "yang";
        person.age = 30;
        person.address = "강원도";
//        person.phoneNumber = "";        // private 필드여서 접근불가
    }
}
