package day07_250826;

public abstract class Shape {
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void displayColor(){
        System.out.println("color : " + color);
    }
}
