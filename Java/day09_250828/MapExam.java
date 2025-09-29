package Java.day09_250828;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        // list에 50명의 person이 저장되어있다.
        // 이름이 양승민인 사람의 주소를 확인하고 싶다면 -> 리스트를 모두 순회해야함
        // Map은 키 : 값 의 형태로 데이터가 관리된다.

        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("yang", "010-1111-1111");
        phoneBook.put("kim", "010-2222-2222");
        phoneBook.put("park", "010-3333-3333");

        System.out.println(phoneBook.get("yang"));
        System.out.println(phoneBook.get("kim"));
        System.out.println(phoneBook.get("park"));

        System.out.println("=========keySet==========");
        Set<String> keys = phoneBook.keySet();
        System.out.println(keys);

        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            System.out.println(key + " : " + phoneBook.get(key));
        }

        System.out.println("=========foreach==========");
        for(String key : keys)
        {
            System.out.println(key + " : " + phoneBook.get(key));
        }

        System.out.println("=========entrySet==========");
        for(Map.Entry<String, String> entry : phoneBook.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
