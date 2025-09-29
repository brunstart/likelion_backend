package Java.day04_250821;

class Book{
//    클래스에 있는 변수는 해당하는 타입의 기본값이 들어가있음
    String title;
    int price;
}

public class Test {
    public static void main(String[] args) {
        int i = 10;

        System.out.println(i);

        Book b = new Book();
        System.out.println(b.title);
        System.out.println(b.price);
    }
}
