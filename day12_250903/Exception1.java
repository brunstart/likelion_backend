package day12_250903;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exobj = new ExceptionObj1();
        int value = exobj.divide(10, 0);

        try {
            int value2 = exobj.divide2(10, 0);
        }catch (Exception e){
            int value2 = exobj.divide(10, 1);
        }

        System.out.println(value);
//        System.out.println(value2);

        // 올바른 처리 방법 1: try-catch
        try {
            FileInputStream fis = new FileInputStream("Exception5.java");
        } catch(IOException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
}

class ExceptionObj1 {
    public int divide(int i, int k) {
        int value = 0;
        try {
            value = i / k; // 0으로 나누기 - ArithmeticException 발생!
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
            value = i / 1;
        }

        return value;
    }

    public int divide2(int i, int k) throws Exception {
        int value = 0;
        value = i / k;
        return value;
    }
}
