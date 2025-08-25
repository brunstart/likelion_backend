package day05_250822.lotto;
import java.util.Arrays;

import static java.lang.Math.*;

public class Lotto {

    final static int LOTTO_NUMBER = 45;     // 로또 공의 수 = 45개
    final static int WIN_COUNT = 6;         // 뽑을 공의 수 = 6개

    int[] balls = new int[LOTTO_NUMBER];    // 로또 공 배열 생성
    int[] winning = new int[WIN_COUNT];     // 당첨 공 배열 생성

    int cnt = 0;                            // 뽑은 공의 수

    public void reset()
    {
        //        공 46개를 넣음
        for(int i = 0; i < balls.length; i++)
        {
            balls[i] = i+1;
        }

        Arrays.fill(winning, 0);          // 당첨 공 배열 초기화

        cnt = 0;                              // 뽑은 공의 수 초기화
//        for(int i = 0; i < WIN_COUNT; i++)
//        {
//            winning[i] = 0;                 // 당첨 공 배열 초기화
//        }
    }

    public void play()                      // 추첨
    {
        for(int win : winning)
        {
            if (win != 0)
            {
                System.out.println("초기화 후 다시 추첨해주세요");
                return;
            }
        }

        //        마지막 공이 뽑힐 때 까지 추첨
        while(true)
        {
            int num = (int) (random() * LOTTO_NUMBER) + 1;    // 당첨 번호

            if (balls[num - 1] != 0)                // 뽑힌 적이 없는 공인 경우
            {
                winning[cnt] = num;                 // 공을 뽑음
                balls[num - 1] = 0;                 // 이미 뽑은 공은 없는 것으로 처리
                cnt++;                              // 뽑은 공의 수 + 1
            }

            if (winning[winning.length - 1] != 0)   // 마지막 공도 뽑았으면
                break;                              // 탈출
        }

        System.out.print("로또 번호 : ");
        for(int win : winning)
        {
            System.out.print(win + "\t");
        }
        System.out.println();
    }
}