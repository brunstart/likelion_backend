package day09_250828;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        // ArrayList 생성
        List<String> fruits = new ArrayList<>();    // List 타입 선언의 장점은? ArryaList 부분을 다른걸로 수정이 가능

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");

        System.out.println(fruits.get(0));

        fruits.set(0, "Cherry");
        System.out.println(fruits.get(0));

        System.out.println(fruits);

        fruits.remove("Cherry");
        System.out.println(fruits);
        System.out.println(fruits.remove(0));
        System.out.println(fruits);
    }
}
