package day13_250904;

import java.io.*;
import java.util.Scanner;

// JAVA IO 실습 예제
// 간단한 메모장 프로그램
public class SimpleMemo {
    String fileName = "result.txt";

    public static void main(String[] args) {
        while(true){
            System.out.println("======== 메뉴 ========");
            System.out.println("1.쓰기\t2.읽기\t3.종료");
            System.out.println("메뉴 입력");

            Scanner sc = new Scanner(System.in);
            int num = Integer.parseInt(sc.nextLine());

            switch(num){
                case 1:
                    System.out.println("내용 입력 (빈 줄 입력 시 입력 종료)");

                    try(
                            PrintWriter pw = new PrintWriter(new FileWriter("src/day13_250904/result.txt", true))
                        )
                    {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                        String str;
                        while(!(str = br.readLine()).isEmpty())     // 빈 줄 입력할 때 까지 저장
                        {
                            pw.println(str);
                        }

                    }catch (IOException e){
                        System.out.println(e.getMessage());
                    }

                    System.out.println("메모 저장 완료");
                    break;

                case 2:
                    String memo;
                    try(BufferedReader br = new BufferedReader(new FileReader("src/day13_250904/result.txt")))
                    {
                        while((memo = br.readLine()) != null)
                        {
                            System.out.println(memo);
                        }
                    }catch (IOException e){
                        System.out.println(e.getMessage());
                    }

                case 3:
                    System.out.println("종료");
                    return;
                default:
                    break;
            }
        }
    }
}
