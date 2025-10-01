package Java.day09_250828;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExam02 {
    public static void main(String[] args) {
        // list, set, map 에 각각 데이터를 5개씩 입력해보고
        // 입력된 모든 데이터를 출력

        List<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int cnt = 5;

        for (int i = 0; i < cnt; i++) {
            System.out.println("과일명 입력 : ");
            fruits.add(sc.nextLine());
        }

        System.out.println(fruits);

    }
}
