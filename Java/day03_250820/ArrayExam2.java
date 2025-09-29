package Java.day03_250820;

public class ArrayExam2 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];

        for(int val : arr1)
        {
            System.out.println(val);
        }

        int[] arr2 = {10, 20, 30, 40, 50, 60};

        for(int val : arr2)
        {
            System.out.println(val);
        }

        int[] arr3 = new int[]{10,20,30};

        int[] arr4;
        arr4 = new int[100];


        for(int i = 0; i < arr4.length; i++)
        {
            arr4[i] = i+1;
            System.out.println(arr4[i]);
        }


    }
}
