package day07_250826;

public class YangTest {
    public static void main(String[] args) {
        Yang yang = new Yang();
//        모든 클래스들의 레퍼런스 변수를 이용해서 사용될 수 있는
//        우리가 구현한 적 없는 메소드들이 있음
//        -> Object가 가지고 있는 메소드

        yang.setName("양승민");
        System.out.println(yang.toString());  // Yang 클래스에 아무것도 없어도 메소드를 불러올 수 가 있음
        System.out.println(yang);

        String str = "hello";

        System.out.println(str.toString());
        System.out.println(str);
    }
}
