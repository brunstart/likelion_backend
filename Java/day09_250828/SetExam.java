package Java.day09_250828;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();

        fruitSet.add("apple");
        fruitSet.add("orange");
        fruitSet.add("grape");
        fruitSet.add("apple");
        fruitSet.add("apple");
        fruitSet.add("apple");
        fruitSet.add("apple");

//        System.out.println(fruits.get(0));
        System.out.println(fruitSet);      // Set는 중복 허용 안함, 출력해도 오렌지 사과 포도 세개만 나옴

        Set<Pen> penSet = new HashSet<>();
        penSet.add(new Pen("red"));
        penSet.add(new Pen("black"));
        penSet.add(new Pen("green"));
        penSet.add(new Pen("red"));

        System.out.println(penSet);     // red pen이 두개가 나옴, 어째서? equals(), hashCode()가 오버라이드 되어 있지 않아서
                                        // 같은 객체인지 판단할 기준이 없음, 그래서 중복이 아닌걸로 판단했기 때문에 red pen이 두개가 나옴

//        set은 index가 없다. 순서가 중요하지 않은 자료구조
        System.out.println();

        Iterator<String> iterator = fruitSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=====================================");

        for(String fruit : fruitSet){
            System.out.println(fruit);
        }

        System.out.println(fruitSet.contains("apple"));
        System.out.println(fruitSet.remove("apple"));       // return 값이 boolean 타입 (true, false)
        System.out.println(fruitSet);
        System.out.println(fruitSet.size());


    }
}
