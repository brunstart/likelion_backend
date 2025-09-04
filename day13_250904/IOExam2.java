package day13_250904;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOExam2 {
//     사용자의 정보 (이름, 전화번호, 주소) 를 입력받아서 파일에 저장하는 메소드
    public void saveInfo()
    {
        String name;
        String phoneNumber;
        String address;
        Scanner sc = new Scanner(System.in);

        try (PrintWriter pw = new PrintWriter(new FileWriter("src/day13_250904/result.txt")))
        {
            System.out.print("이름 : ");
            name = sc.nextLine();
            pw.println("이름 : " + name);

            System.out.print("전화번호 : ");
            phoneNumber = sc.nextLine();
            pw.println("전화번호 : " + phoneNumber);

            System.out.print("주소 : ");
            address = sc.nextLine();
            pw.println("주소 : " + address);
            pw.println();

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

//     파일로부터 읽어와서 사용자의 정보를 출력하는 메소드
    public void readInfo()
    {
        String path = "src/day13_250904/";
        String file = "result.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path + file))) {
            while((file = reader.readLine()) != null)
            {
                System.out.println(file);
            }

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        IOExam2 io = new IOExam2();
        io.saveInfo();
        io.readInfo();
    }
}
