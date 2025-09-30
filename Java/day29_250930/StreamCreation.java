package Java.day29_250930;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "JavaScript");
        System.out.println(list);

        list.stream()
                .filter(s -> s.startsWith("J"))         // filter 처리한 값을 새로운 스트림으로 반환
                .forEach(s -> System.out.println(s));

        System.out.println("=".repeat(50));

        // 처리가 헷갈리는 경우 stream을 쓰지 않았다면 어떻게 구현할지를 생각
        List<String> filterResult = new ArrayList<>();

        for(String s : list) {
            if(s.startsWith("J")) {
                filterResult.add(s);
            }
        }

        for(String s : filterResult) {
            System.out.println(s);
        }

        System.out.println("=".repeat(50));

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        // for(int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        //
        // System.out.println("=".repeat(50));
        // stream.forEach(System.out::println);    // stream을 이미 사용했기 때문에 재사용 불가

        System.out.println("=".repeat(50));
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> streamFromSet = set.stream();
        streamFromSet.forEach(System.out::println);

        System.out.println("=".repeat(50));
        // 배열에서 스트림 생성
        String[] array = {"Spring", "Summer", "Fall", "Winter"};
        Stream<String> streamFromArray = Arrays.stream(array);

        streamFromArray.forEach(System.out::println);

        System.out.println("=".repeat(50));

        // 부분 배열에서 스트림 생성
        Stream<String> partialStream = Arrays.stream(array, 1, 3); // Summer, Fall
        partialStream.forEach(System.out::println);

        System.out.println("=================== 정적 메소드 ====================");

        // Stream.of() 사용
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
        numberStream.forEach(System.out::println);

        // Stream.iterate() - 무한 스트림 생성
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 2)
                .limit(10); // 0, 2, 4, 6, 8...
        iterateStream.forEach(System.out::println);

        // Stream.generate() - 무한 스트림 생성
        Stream<Double> randomStream = Stream.generate(Math::random)
                .limit(5);
        randomStream.forEach(System.out::println);

        System.out.println("=".repeat(50));


    }
}
