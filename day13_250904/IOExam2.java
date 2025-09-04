package day13_250904;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOExam2 {
//     사용자의 정보 (이름, 전화번호, 주소) 를 입력받아서 파일에 저장하는 메소드
    public void saveUserInfo(List<Person> personList){
        String name = null;
        String phoneNumber = null;
        String address = null;

        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            for(int count = 0; count < 2; count++){
                System.out.println("이름 : ");
                name = br.readLine();
                System.out.println("전화번호 : ");
                phoneNumber = br.readLine();
                System.out.println("주소 : ");
                address = br.readLine();

                personList.add(new Person(name, phoneNumber, address));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//     파일로부터 읽어와서 사용자의 정보를 출력하는 메소드
    public void readInfo(List<Person> personList)
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

    // Collection의 값을 읽어와서 파일에 저장
    public void saveCollection(List<Person> personList)
    {
        String name = null;
        String phoneNumber = null;
        String address = null;

        String path = "src/day13_250904/";
        String outputFile = "userInfo.txt";

        try
        (
            PrintWriter writer = new PrintWriter(new FileOutputStream(path + outputFile, true))
        ){
            for (Person person : personList)
            {
                writer.print(person.getName() + " | ");
                writer.print(person.getPhoneNumber() + " | ");
                writer.print(person.getAddress());
                writer.println();
            //     person의 toString을 형식에 맞게 오버라이딩 해서 사용할 수도 있음
            }
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    // 파일의 값을 읽어서 Collection에 저장
    public void readUsersFromFile(List<Person> personList, String fileName)
    {
        String userInfo = null;
        String path = "src/day13_250904/";
        try(
            BufferedReader reader = new BufferedReader(new FileReader(path + fileName))
            )
        {
            while((userInfo = reader.readLine()) != null)
            {
                String[] info = userInfo.split("\\|");
                Person person = new Person(info[0].trim(), info[1].trim(), info[2].trim());
                personList.add(person);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        IOExam2 io = new IOExam2();
        List<Person> personList = new ArrayList<>();
        // io.saveUserInfo(personList);
        //
        // System.out.println(personList.size());
        //
        // io.saveCollection(personList);

        io.readUsersFromFile(personList, "userInfo.txt");

        for(Person person : personList)
        {
            System.out.println(person);
        }
    }
}
