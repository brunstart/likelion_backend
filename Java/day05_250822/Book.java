package Java.day05_250822;

public class Book {
    String title;
    String author;
    int price;

//    생성자가 한 번도 정의된 적이 없다면 컴파일러가 자동으로 디폴트 생성자를 생성함.
//    메소드와 흡사하나 리턴타입이 없고, 메소드 명이 클래스 명과 동일함.
    public Book(){
        this("java", "양승민", 3000);
//        title = "java";
//        author = "양승민";
//        price = 30000;
    }

//    생성자 오버로딩 또한 가능
//    매개변수 없는 생성자가 없어서 Book() 주석처리하면 에러.
    public Book(String title)
    {
        this.title = title;
//        this(title, "", 0);
        System.out.println("Book(t) 실행");
    }

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        System.out.println("Book(t,a) 실행");
    }

    public Book(String title, String author, int price)
    {
        this(title);            // this 호출은 반대도 가능함.
        this.author = author;
        this.price = price;
        System.out.println("Book(t,a,p) 실행");
    }

    public static void main(String[] args) {
        Book book = new Book("java");     // () - 생성자
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.price);

        Book book2 = new Book("spring", "yang", 30000);

//        book.title = "java";
    }
}
