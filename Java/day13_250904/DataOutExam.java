package Java.day13_250904;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutExam {
    public static void main(String[] args) {
        try(
                // 원시 데이터 타입으로 파일에 쓰는 기능을 제공
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/Java.day13_250904/data.txt"))
                )
        {
            dos.writeBoolean(true);
            dos.writeChar('a');
            dos.writeInt(2);
            dos.writeDouble(Double.MAX_VALUE);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
