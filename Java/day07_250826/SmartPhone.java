package Java.day07_250826;

public class SmartPhone implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("스마트폰 전원 ON");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰 전원 OFF");
    }

    @Override
    public void reset() {
        System.out.println("스마트폰 공장 초기화 진행");
        turnOff();
        turnOn();
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.reset();
        SmartDevice.showInfo();

    }
}
