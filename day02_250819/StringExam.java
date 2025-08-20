package day02_250819;

public class StringExam {
    public static void main(String[] args) {
        String name = "양승민";
        int i = 10;

        System.out.println(name.concat(" hahaha"));

        System.out.println(name + " hahaha");

        System.out.println(name + (i + 20));

        System.out.println(name + 20 + 22 + "hi");
//        이렇게 문자열을 늘리면 원래 String이 계속 길어지는게 아니라
//        name, name+20, name+20+22, name+20+22+hi가 생성됨

    }
}
