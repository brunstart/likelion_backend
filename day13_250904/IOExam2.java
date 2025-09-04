package day13_250904;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOExam2 {
//     사용자의 정보 (이름, 전화번호, 주소) 를 입력받아서 파일에 저장하는 메소드
public void saveUserInfo(){
    String name = null;
    String phoneNumber = null;
    String address = null;

    try(
            PrintWriter pw = new PrintWriter(new FileOutputStream("src/day13_250904/userInfo.txt", true));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ){
        for(int count = 0; count < 3; count++){
            System.out.println("이름 : ");
            name = br.readLine();
            System.out.println("전화번호 : ");
            phoneNumber = br.readLine();
            System.out.println("주소 : ");
            address = br.readLine();

            pw.println(name + " "+phoneNumber + " "+address);
        }

        pw.close();
        System.out.println("사용자 정보가 src/day12/userInfo.txt 에 저장되었습니다.");

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

//     파일로부터 읽어와서 사용자의 정보를 출력하는 메소드
    public void readInfo()
    {
        String userInfo = null;

        String path = "src/day13_250904/";
        String file = "userInfo.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path + file))) {
            while((userInfo = reader.readLine()) != null)
            {
                System.out.println(userInfo);
            }
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        IOExam2 io = new IOExam2();
        io.saveUserInfo();
        io.readInfo();
    }
}
