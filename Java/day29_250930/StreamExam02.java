package Java.day29_250930;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam02 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Cherry", "Date");

        // 각 요소를 소문자로 바꿔서 출력
        words.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);

        int[] intArr = {200,3,4,7,88,99};

        // 1. 각 요소에 3씩 더해서 출력
        Arrays.stream(intArr)
                .map(i -> i + 3)
                .forEach(System.out::println);

        // 2. 배열로 만들것
        int[] resultArr = Arrays.stream(intArr)
                        .map(i -> i+3)
                                .toArray();

        for(int i : resultArr){
            System.out.println(i);
        }

        System.out.println("========= 정렬해보기 =========");
        Arrays.stream(intArr)
                .sorted()
                .forEach(System.out::println);

        // 내림차순 정렬
        Arrays.stream(intArr)
                // .sorted(Comparator.reverseOrder())  기본타입에는 적용되지 않음
                .boxed() // Integer 타입으로 형변환
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("============ peek ============");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> doubledNumbers = numbers.stream()
                .peek(n -> System.out.println("Processing 1: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("Processing 2: " + n))
                .collect(Collectors.toList());

        for(int i : doubledNumbers){
            System.out.println(i);
        }

    }
}
