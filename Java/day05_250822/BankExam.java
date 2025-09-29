package Java.day05_250822;

public class BankExam {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(111222333, "양승민", 100000);

        System.out.println(ba.getBalance());    // 잔액 조회
        ba.deposit(50000);                 // 입금
        System.out.println(ba.getBalance());
        ba.withdraw(500000000);             // 잔액 부족 유도
        ba.withdraw(12000);                 // 출금
        System.out.println(ba.getBalance());

    }
}
