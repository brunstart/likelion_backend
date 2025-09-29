package Java.day07_250826;

public class InterfaceTest {
    public static void main(String[] args) {

//        static 키워드를 쓰면 따로 implements하지 않아도 그냥 쓸 수 있음
        Drawable.showInfo();

//        public class Photo implements Drawable, Resizable 로 정의되어 있을 때
        Photo photo = new Photo("b.png", 20,30);

        System.out.println(photo instanceof Photo);         // true
        System.out.println(photo instanceof Drawable);      // true
        System.out.println(photo instanceof Resizable);     // true

        Drawable d = new Drawable(){
            @Override
            public void draw() {

            }

            @Override
            public void erase() {

            }
        };
    }
}
