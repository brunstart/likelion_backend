package Java.day14_250905;

public class LTV implements TV{

    public void turnOn()
    {
        System.out.println("ON");
    }

    public void turnOff()
    {
        System.out.println("OFF");
    }

    @Override
    public void volumeUp()
    {
        System.out.println("VOLUME UP");
    }

    @Override
    public void volumeDown()
    {
        System.out.println("VOLUME DOWN");
    }
}
