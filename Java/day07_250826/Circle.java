package Java.day07_250826;

import java.lang.Math;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle("blue", 15);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}
