package Java.day14_250905;

interface payMethod {
    void pay(int amount);
}

class Credit implements payMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Credit Card Payment : " + amount);
    }
}

class Pay implements payMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Pay Pal Payment : " + amount);
    }
}

class Kakao implements payMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Kakao Pay Payment : " + amount);
    }
}

class payProcess {
    public void process(payMethod paymentMethod, int amount) {
        paymentMethod.pay(amount);
    }
}

public class OCPExam {
    public static void main(String[] args) {
        payProcess p = new payProcess();
        p.process(new Credit(), 100);
        p.process(new Pay(), 100);
        p.process(new Kakao(), 100);
    }
}
