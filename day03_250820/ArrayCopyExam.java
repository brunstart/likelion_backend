package day03_250820;

import java.util.Arrays;

public class ArrayCopyExam {
    public static void main(String[] args) {

        int i = 10;
        int copyI = i;          // 기본 데이터 타입은 값을 복사

        copyI = 20;

        System.out.println(i);

        int[] iarr = {1,2,3};
//        int[] copyIarr = iarr;  // 배열의 주소값을 복사
        int[] copyIarr = new int [iarr.length];

//        copyIarr[0] = 100;

        System.out.println(iarr[0]);

        for(int j = 0; j < iarr.length; j++)
        {
            copyIarr[j] = iarr[j];
        }

        for(int arrVal:copyIarr)
        {
            System.out.println(arrVal);
        }

//        2.System.arraycopy() 사용
        int[] copy2 = new int[iarr.length];
        System.arraycopy(iarr, 0, copy2, 0, iarr.length);

//        3.Arrays.copyOf()
        int[] copy3 = Arrays.copyOf(iarr, iarr.length);

//        4.Arrays.copyOfRange()
        int[] copy4 = Arrays.copyOfRange(iarr, 1, 3);

        System.out.println("원본: " + Arrays.toString(iarr));
        System.out.println("copy2: " + Arrays.toString(copy2));
        System.out.println("copy3: " + Arrays.toString(copy3));
        System.out.println("copy4(부분): " + Arrays.toString(copy4));


        copyIarr[0] = 100;
        System.out.println(iarr[0]);
    }
}
