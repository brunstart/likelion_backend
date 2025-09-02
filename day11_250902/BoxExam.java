package day11_250902;

public class BoxExam {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
//        박스에 담을 수 있는 물건
        box.setItem(new Person("yang", 30));

        box.setItem(new Pen());

        ((Pen)box.getItem()).write();
//        Pen의 write 사용햐려면 형변환 필요

        PenBox penBox = new PenBox();
        penBox.setPen(new Pen());

        penBox.getPen().write();

        GenericBox<Pen> penGenericBox = new GenericBox<>();
        penGenericBox.setItem(new Pen());
        penGenericBox.getItem().write();

        GenericBox<Person> personGenericBox = new GenericBox<>();

        personGenericBox.setItem(new Person("yang", 30));
        personGenericBox.getItem().getName();

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setItem(new String("ABCDefG"));
        stringGenericBox.getItem().toLowerCase();
    }
}
