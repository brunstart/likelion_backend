package Java.day29_250930;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam01 {
    public static void main(String[] args) {
        int[] iarr = {1,2,3,4,5,6,7,8,0};

        // 스트림 없이
        for(int i : iarr){
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("=".repeat(50));
        // 스트림 이용
        Arrays.stream(iarr)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Cherry", "Date");
        // words 에서 글자수가 5개 이상인 것만 필터링하고,
        // 중복을 제거하고 새로운 리스트를 얻으려면
        // 리스트.contains(단어) -- 리스트에 단어가 있으면 true 리턴
        List<String> resultWords = new ArrayList<>();
        for(String word:words){
            if(word.length() >= 5)
            {
                if (resultWords.contains(word)) continue;
                resultWords.add(word);
            }
        }



        // 스트림에서는 distinct() 메소드 제공
        List<String> resultWords2 = words.stream()
                .filter(word -> word.length() >= 5)
                .distinct()
                .toList();  // 불변 리스트를 반환

        System.out.println(resultWords2);
        // resultWords2.add("test");

        System.out.println("=".repeat(50));

        List<String> resultWords3 = words.stream()
                .filter(word -> word.length() >= 5)
                .distinct()
                .collect(Collectors.toList());  // 가변 리스트를 반환

        System.out.println(resultWords3);
        resultWords3.add("test");
        System.out.println(resultWords3);
    }
}
