package day11_250902;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam10 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++)
        {
            numbers.add(i);
        }

        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        // 여태 정렬은 숫자만 있는걸 했는데 숫자가 아니라 Person이라는 객체가 들어간다면
        // 어떻게 정렬을 할까

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("kang", 40));
        persons.add(new Person("yang", 30));
        persons.add(new Person("jang", 10));
        persons.add(new Person("park", 20));

        System.out.println(persons);
        Collections.sort(persons, new PersonComparator());      // 1번 방법
        System.out.println("나이 정렬 : " + persons);
        // 인스턴스가 comparable이 아니라는 오류가 뜸 = Comparable 인터페이스를 구현하고 있는지 확인
        // Comparable을 implements해서 구현하거나 Comparator를 매개변수에 추가로 넣어줘야함, Comparator는 직접 구현해야함.

        Comparator<Person> personCom = new Comparator<Person>() {   // 2번 방법
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(persons, personCom);

        Collections.sort(persons, new Comparator<Person>() {        // 3번 방법
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

//        1,2,3번 모두 가능


//        자바는 매개변수에 객체가 아닌 것들은 들어올 수 없음
//        자바는 함수를 일급객체로 취급하지 않는다.

//        람다식 예제
        Collections.sort(persons, (o1, o2) -> o1.getAge() - o2.getAge());
//        코드가 간결해짐 (보이는건 함수처럼 보이는데 실제 컴파일러가 구현한 객체를 만듬)

//        나이를 기준점으로 삼고 있었음
//        이름으로 정렬되도록 구현

        Collections.sort(persons, new Comparator<Person>(){
           @Override
           public int compare(Person o1, Person o2) {
               return o1.getName().compareTo(o2.getName());
           }
        });

        System.out.println("이름 정렬 : " + persons);

    }
}
