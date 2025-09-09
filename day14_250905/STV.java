package day14_250905;

// 전원을 켜다, 전원을 끄다, 소리를 줄이다, 소리를 키우다.
public class STV implements TV{

    public void turnOn()
    {
        System.out.println("S ON");
    }

    public void turnOff()
    {
        System.out.println("S OFF");
    }

    public void volumeUp()
    {
        System.out.println("S VOLUME UP");
    }

    public void volumeDown()
    {
        System.out.println("S VOLUME DOWN");
    }
}
