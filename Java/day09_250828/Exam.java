package Java.day09_250828;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {

    public void party(Object obj)
    {
        // 매개변수로 객체만 들어올 수 있음
        // 8개의 객체가 아닌 타입이 있음 (기본형) - 입장불가
        // 8개도 입장하게 하려면 -> Wrapper 클래스
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int value = sc.nextInt();
//
//        System.out.println(value);

//        if (value == 0) {
//            System.exit(0);     // 정상종료
//            System.exit(1);     // 비정상종료
//        }


//        어딘가에 열려 있는 것들, 연결되어 있는 것들
//        이용 끝나면 닫아줘야 함
        sc.close();

        System.out.println(System.currentTimeMillis());

        System.out.println(System.nanoTime());

        System.out.println(System.getenv("PATH"));

        // 배열 복사 (native 메소드로 빠름)
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[5];
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.println("복사된 배열: " + Arrays.toString(dest));

        System.gc();        // 가비지 컬렉션 제안 (강제 실행 아님)

        // 시스템 프로퍼티
        System.out.println("Java 버전: " + System.getProperty("java.version"));
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("사용자 홈: " + System.getProperty("user.home"));
        System.out.println("현재 디렉토리: " + System.getProperty("user.dir"));
    }
}
