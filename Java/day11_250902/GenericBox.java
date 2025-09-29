package Java.day11_250902;

// 설계 당시에는 박스에 뭐가 담길지 모름
// 타입을 특정하지 않고 가상의 타입 I를 선언
// GenericBox<Pen> pen ... 으로 생성 시 I가 전부 Pen으로 치환됨
public class GenericBox<I> {
    I item;

    public void setItem(I item)
    {
        this.item = item;
    }

    public I getItem()
    {
        return item;
    }
}
