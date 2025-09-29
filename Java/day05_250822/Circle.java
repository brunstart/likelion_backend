package Java.day05_250822;
import static java.lang.Math.*;
public class Circle {
    int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);

        circle.radius = 15;
        System.out.println("원의 넓이 : " + circle.getArea());
    }
}
