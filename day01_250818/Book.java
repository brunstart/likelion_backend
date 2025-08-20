package day01_250818;

public class Book {
    private String title;
    private int price;

//
    public int getPrice() {
        return this.price * 2;
    }

//  가격을 입력받아서 가격을 수정함
    public void setPrice(int price) {
        this.price = price;
    }

//  제목을 반환
    public String getTitle() {
        return title;
    }

//  제목을 수정하는 메소드
    public void setTitle(String title) {
        this.title = title;
    }
}
