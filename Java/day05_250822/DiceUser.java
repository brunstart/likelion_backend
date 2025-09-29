package Java.day05_250822;

public class DiceUser {
    public static void main(String[] args) {

//        Dice d = new Dice();
//        int cnt = 0;
//
//        for(int i = 0; i < 10; i++)
//        {
//            d.roll();
//            if (d.eye == 3)
//                cnt++;
//        }
//
//        System.out.println("3이 나온 횟수 : " + cnt);

        rollTheDice(100, 5);
        rollTheDice(1000, 3);

    }

//    times : 던지는 횟수, num : 원하는 주사위의 눈
    public static void rollTheDice(int times, int num)
    {
        Dice dice = new Dice();
        int cnt = 0;

        for(int i = 0; i < times; i++)
        {
            dice.roll();
            if (dice.eye == num)
                cnt++;
        }

        System.out.printf("주사위를 %d번 굴려서 %d 나온 횟수 : %d\n", times, num, cnt);
    }
}
