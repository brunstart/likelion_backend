package day11_250902;

import java.time.*;

public class PeriodDurationExample {
    public static void main(String[] args) {
        // Period - 날짜 간격
        LocalDate birth = LocalDate.of(1995, 11, 17);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birth, today);
        System.out.printf("나이: %d년 %d개월 %d일%n",
                age.getYears(), age.getMonths(), age.getDays());

        // Duration - 시간 간격
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 30);

        Duration workTime = Duration.between(start, end);
        System.out.println("근무 시간: " + workTime.toHours() + "시간 " +
                (workTime.toMinutes() % 60) + "분");

        // Instant - 타임스탬프
        Instant instant = Instant.now();
        System.out.println("타임스탬프: " + instant);
        System.out.println("에포크 초: " + instant.getEpochSecond());
    }
}