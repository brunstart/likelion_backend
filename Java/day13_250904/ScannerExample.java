package Java.day13_250904;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("정수를 입력하세요: ");
            int intValue = scanner.nextInt();

            System.out.print("실수를 입력하세요: ");
            double doubleValue = scanner.nextDouble();

            System.out.print("true/false를 입력하세요: ");
            boolean boolValue = scanner.nextBoolean();

            // 버퍼 비우기 (nextLine() 전에 필요) nextInt 같은것들이 값만 가져가고 엔터(개햄문자)는 처리를 못해서 버퍼에 남아있기 때문
            scanner.nextLine();

            System.out.print("문자열을 입력하세요: ");
            String stringValue = scanner.nextLine();

            System.out.println("\n=== 입력 결과 ===");
            System.out.println("정수: " + intValue);
            System.out.println("실수: " + doubleValue);
            System.out.println("불린: " + boolValue);
            System.out.println("문자열: " + stringValue);

        } finally {
            scanner.close();
        }
    }
}