package day03_250820;

public class ArrayExam {
    public static void main(String[] args) {
        int[] iarr;
        int iarr2[];

        iarr = new int[3];

        iarr[0] = 10;

        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        int i = iarr[0];

        System.out.println(i);

        System.out.println("iarr의 길이:"+iarr.length);

        for(int ii = 0; ii < iarr.length; ii++)
        {
            System.out.println(iarr[ii]);
        }

//        foreach ==> 1.5에서 추가된 문법
//        for(꺼낸값을 담을 변수:반복되는 자료구조)
        for(int val:iarr)
        {
            System.out.println(val);
        }

        String[] strArr = new String[3];
        strArr[0] = "kkkk";
        strArr[1] = "qqqq";
        strArr[2] = "aaaa";

        for(int ii = 0; ii < strArr.length; ii++)
        {
            System.out.println(strArr[ii]);
        }

        for(String str:strArr)
        {
            System.out.println(str);
        }
    }
}
