package Java.day28_250929.lambdaexam;

// 자바는 class에 감싸지지 않은채로 메소드만 독립적으로 나올 수 없다.
// public void testMethod() {
//     System.out.println("메소드");
// }

public class Test {
    // 자바는 반드시 클래스의 구성요소로 메소드가 존재한다.
    public void testMethod() {
        System.out.println("메소드");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
