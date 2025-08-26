package day07_250826;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("green", 20, 34);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
