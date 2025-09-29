package Java.day03_250820;

import java.util.Arrays;

public class ArrayCopyExam2 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        int[] shallow = nums;
        int[] deep = Arrays.copyOf(nums, 3);

        shallow[1] = 200;
        deep[2] = 300;

        System.out.println("nums    : " + Arrays.toString(nums));
        System.out.println("shallow : " + Arrays.toString(shallow));
        System.out.println("deep    : " + Arrays.toString(deep));

        int[] ori1 = {1,2,3};
        int[] ori2 = {4,5,6,7};

        int[] copy = new int[ori1.length + ori2.length];

        System.arraycopy(ori1, 0, copy, 0, ori1.length);
        System.arraycopy(ori2, 0, copy, ori1.length, ori2.length);

        System.out.println(Arrays.toString(copy));

//        Array Utility 클래스
//        1. toString() - 배열 내용 출력
        System.out.println(Arrays.toString(ori1));

//        2. sort() - 정렬
        int[] sortArray = {3,2,4,5,1,6};
        Arrays.sort(sortArray);
        System.out.println("정렬된 배열: " + Arrays.toString(sortArray));

//        3.binarySearch() - 이진 탐색 (정렬된 배열에서만)
        int idx = Arrays.binarySearch(sortArray, 5);
        System.out.println("5의 위치: " + idx);

//        4.equals() - 배열 비교
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = {1,2,4};
        System.out.println("arr1 == arr2: " + Arrays.equals(arr1, arr2));
        System.out.println("arr1 == arr3: " + Arrays.equals(arr1, arr3));

//        5.fill() 배열 채우기
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("채워진 배열: " + Arrays.toString(filled));

    }
}
