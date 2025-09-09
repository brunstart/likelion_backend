package day14_250905;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}