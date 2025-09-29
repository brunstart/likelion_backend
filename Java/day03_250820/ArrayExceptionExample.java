package Java.day03_250820;

public class ArrayExceptionExample {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
        }catch (ArrayIndexOutOfBoundsException e){
//            예외처리 하는 부분
            System.out.println("배열 인덱스 범위 초과");
            System.out.println("배열 길이 : " + arr.length);
            System.out.println("유효한 인덱스: 0 ~ " + (arr.length - 1));
        }

        System.out.println("다음 실행해야하는 문장");
        System.out.println("그 다음 실행해야하는 문장");
    }
}
