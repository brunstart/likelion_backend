package Java.day09_250828;

import Java.day08_250827.Pen;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExam {
    public static void main(String[] args) {
        // 가장 많이 사용되는 자료구조
        // 저장될 때 Object가 저장됨
        // <> --> 제네릭

        ArrayList list = new ArrayList();   // 제네릭 생략해도 안만들어지는건 아님
        list.add("123");
        list.add(11);
        list.add(new Pen());
        // 모든 것이 다 들어갈 때 단점은?

        list.get(0);

        ArrayList list2 = new ArrayList();
        list2.add("abc");
        list2.add("def");

        // String의 메소드를 사용할 수 없는 이유? Object 타입이라 꺼낼때마다 형변환을 해줘야하는 단점 존재
        // 부모 타입일 경우 자식의 메서드로 접근 불가
        ((String)list2.get(0)).trim();

        // < > 제네릭이 추가된 이유 - 해당 타입만 넣겠다고 선언하는 것
        ArrayList<String> sList = new ArrayList<>();

        sList.add("abc");
//        sList.add(12);          // 제네릭으로 제한되면 다른 타입은 입장 불가
//        sList.add(new Pen());   // 오류 발생
        sList.add("kang");
        sList.add("kim");

        System.out.println(sList.size());

        // ArrayList는 순서가 있는 자료구조이므로 인덱스가 존재
        for(int i = 0; i < sList.size(); i++){
            System.out.println(sList.get(i));
        }

        System.out.println("=========================================");
        Iterator<String> iter = sList.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        System.out.println("=========================================");
        for(String str : sList)
        {
            System.out.println(str);
        }

    }
}
