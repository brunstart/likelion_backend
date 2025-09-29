package Java.day02_250819;

public class PrintfExam {
    public static void main(String[] args) {
        String name = "Yang Seungmin";
        int age = 30;
        double height = 173.21341;
        String gender = "male";

        System.out.printf("이름 : %s\n나이 : %d\n성별 : %s\n", name, age, gender);
        System.out.printf("신장 : %.1fcm\n", height);
    }
}
