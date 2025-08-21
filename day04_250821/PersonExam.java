package day04_250821;

public class PersonExam {
    public static void main(String[] args) {
//        Person이 가진 필드를 이용하려면

        Person.count++;

        System.out.println(Person.MAX_AGE);
        System.out.println(Person.count);

        Person yang = new Person();
        yang.name = "양승민";

        Person kim = new Person();
        kim.name = "김주원";

        yang.count++;
        System.out.println(yang.count);

        System.out.println(kim.count);
    }
}
