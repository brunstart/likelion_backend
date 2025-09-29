package Java.day28_250929;

class IncrementCounter implements Runnable {
    private int i;

    public IncrementCounter() {
        i = 1;
    }

    @Override
    public void run() {
        for(int j = 0; j < 100; j++) {
            System.out.println("Increment: {" + (i++) + "}");
            try {
                Thread.sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DecrementCounter implements Runnable {
    private int i;
    public DecrementCounter() {
        i = 100;
    }

    @Override
    public void run() {
        for(int j = 0; j < 100; j++) {
            System.out.println("Decrement: {" + (i--) + "}");
            try {
                Thread.sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class 쓰레드실습문제1_0929 {
    public static void main(String[] args) {
        // Runnable 객체 생성
        Runnable task1 = new IncrementCounter();
        Runnable task2 = new DecrementCounter();

        // Thread 객체에 전달
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}

