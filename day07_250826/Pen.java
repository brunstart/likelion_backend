package day07_250826;

public class Pen {
    public void write()
    {
        System.out.println("dd");
    }
//    오버라이딩은 상속에서만 가능

    public static void main(String[] args) {
        BallPen pen = new BallPen();
        pen.write();
        pen.write("msg");
    }
}

class BallPen extends Pen{
    public void write(String msg)
    {
        System.out.println("BallPen write");
    }
}