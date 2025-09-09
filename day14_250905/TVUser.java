package day14_250905;

public class TVUser {
    public static void main(String[] args) {
        // STV tv = new STV();
        // LTV tv = new LTV();

        // TV tv = new STV();   // 생성하는 객체에 따라 new ~ 가 바뀐다. 이 부분도 수정안해도 되게 할 수는 없을까?
        // TV Factory가 있다고 생각하면 TV 객체 생성을 팩토리가 해준다면 어떨까

        TV tv = TVFactory.getTV("l");

        // TV tv1;  현재 코드로는 불가능

        tv.turnOn();
        tv.turnOff();
        tv.volumeDown();
        tv.volumeUp();
    }
}
