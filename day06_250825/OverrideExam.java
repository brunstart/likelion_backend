package day06_250825;

public class OverrideExam {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        System.out.println("\n=========================\n");

        Animal animal = null;
        if("1".equals(args[0]))     // 문자열 비교시 == 사용하면 주소값을 비교해서 잘못될 수 있음. 그래서 equals를 사용함
        {
            animal = new Cat();
        }
        else
        {
            animal = new Dog();
        }

        animal.makeSound();
        animal.move();

    }
}
