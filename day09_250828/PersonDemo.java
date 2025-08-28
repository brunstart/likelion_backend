package day09_250828;

import java.util.*;

public class PersonDemo {
    public static void main(String[] args) {
        // Person을 여러명 저장하고 싶다
//        1. Person 객체 5개 생성

        Person yang = new Person("yang", "010-1111-1111", "001", "seoul");
        Person kang = new Person("kang", "010-2222-1111", "002", "daejeon");
        Person kim = new Person("kim", "010-3333-1111", "003", "daegu");
        Person park = new Person("park", "010-4444-1111", "004", "busan");
        Person Lee = new Person("Lee", "010-5555-1111", "005", "yeosu");

//        이렇게 생성한 person 객체들은 List, Set, Map에 담을 것
//        map은 key를 idNumber로 하고, value는 Person을 담을 것

        List<Person> pList = new ArrayList<Person>();
        pList.add(yang);
        pList.add(kang);
        pList.add(kim);
        pList.add(park);
        pList.add(Lee);

        Set<Person> pSet = new HashSet<>();
        pSet.add(yang);
        pSet.add(kang);
        pSet.add(kim);
        pSet.add(park);
        pSet.add(Lee);

        Map<String, Person> pMap = new HashMap<>();
        pMap.put(yang.getIdNumber(), yang);
        pMap.put(kang.getIdNumber(), kang);
        pMap.put(kim.getIdNumber(), kim);
        pMap.put(park.getIdNumber(), park);
        pMap.put(Lee.getIdNumber(), Lee);

        // 각 List, Set, Map에서 특정 idNumber에 해당하는 Person 객체를 찾고 싶다면?

        for(Person p : pList)
        {
            if (p.getIdNumber().equals("004"))
            {
                System.out.println(p);
            }
        }

        for(Person p : pSet)
        {
            if (p.getIdNumber().equals("004"))
            {
                System.out.println(p);
            }
        }

        System.out.println(pMap.get("004"));
    }
}
