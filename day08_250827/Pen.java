package day08_250827;

public class Pen {
    private String brand;
    private String color;
    private int price;

    public Pen(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //    추상화해서 toString, equals 메소드를 오버라이드

    @Override
    public String toString() {
        return "brasd : " + brand + "\ncolor : " + color + "\nprice : " + price + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        if (brand.equals(pen.brand) && color.equals(pen.color) && price == pen.price) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Pen jet = new Pen("JETSTREAM", "RED", 4000);
        Pen uni = new Pen("UNI", "BLACK", 1500);
        Pen jet3 = new Pen("JETSTREAM", "RED", 4000);

        System.out.println(jet);
        System.out.println(uni);
        System.out.println(jet3);

        System.out.println(jet == uni);
        System.out.println(jet.equals(uni));

        System.out.println(jet == jet3);
        System.out.println(jet.equals(jet3));
    }
}
