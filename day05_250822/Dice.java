package day05_250822;

import java.util.Random;

public class Dice {
    // 필요한 속성
    // 필드 - 면, 눈
    int face = 6;
    int eye;

    // 기능 - 던지기, 굴리기
    public void roll()
    {
//        주사위의 면에 따라서 랜덤한 값을 하나 발생.
//        Random random = new Random();

//        0.0 ~ 1.0 사이의 값을 반환. 1.0은 포함되지 않음
        eye = (int)(Math.random()*face)+1;
    }

    public static void main(String[] args) {

//        System.out.println((int)(Math.random()*6)+1);

//        Dice d = new Dice();
//        int cnt = 0;
//
//        for(int i = 0; i < 10; i++)
//        {
//            d.roll();
//            if (d.eye == 3)
//                cnt++;
//
//        }

//        System.out.println("3이 나온 횟수 : " + cnt);
    }
}
