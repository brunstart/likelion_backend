package day05_250822;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println("사각형 넓이 : " + rectangle.getArea());
    }
}
