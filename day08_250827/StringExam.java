package day08_250827;

import java.util.Arrays;

public class StringExam {
    public static void main(String[] args) {
//        String은 상속할 수 없다.
//        new를 이용해 객체를 생성해왔다.
        String str = new String("abc");

//        조금 특별한 클래스로 아래처럼 문자열을 생성할 수 있다.
        String str2 = "abc";
        System.out.println(str2.charAt(0));
        char c = str2.charAt(1);
        System.out.println(c);

        String str3 = new String("abc");
        String str4 = "abc";

        System.out.println(str == str3);
        System.out.println(str2 == str4);

//        str1 != str3 (new로 선언)인데 str2 = str4 (""으로 선언)
//        new로 만들 경우 새롭게 만듬
//        "abc"으로 저장하면 문자열만 저장하는 공간에 abc를 만든 후 가리킴 (str2)
//        "abc"로 다시 만들면 문자열 공간에 있는 abc를 찾아서 가리킴 (str4)
//        위의 특징 때문에 String은 불변 클래스

        str2.concat("def");             // abcdef는 생성되지만 str2는 여전히 abc 문자열을 가리키고 있음
        str2 = str2.concat("def");      // =를 이용해 assign 해줘야 abcdef를 가리킴
        System.out.println(str2);

        String str5 = " abc";
        String str6 = "abc";

        System.out.println(str5.trim().equals(str6));
        System.out.println("========================================");

        String strr = "  Hello Java World  ";
//        길이와 문자 접근
        System.out.println("length : " + strr.length());
        System.out.println("5th : " + strr.charAt(5));

//        부분 문자열
        System.out.println(strr.substring(8, 12));

//        검색
        System.out.println(strr.indexOf("Java"));
        System.out.println(strr.contains("Java"));
        System.out.println(strr.startsWith("   Hello"));
        System.out.println(strr.endsWith("World   "));

//        변환
        System.out.println(strr.toLowerCase());
        System.out.println(strr.toUpperCase());
        System.out.println(strr.trim());
        System.out.println(strr.replace("Java", "C"));

//        분할과 겷합
        String[] words = strr.trim().split(" ");
        System.out.println(Arrays.toString(words));

        String joined = String.join("-", words);
        System.out.println(joined);

//        형식화
        String formatted = String.format("name : %s, age : %d", "양승민", 30);
        System.out.println(formatted);

    }
}
