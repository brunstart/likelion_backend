package Java.day11_250902;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        Date birthDay = new Date(2010, 11,25);
        System.out.println(birthDay);
//        월이 0월부터 시작 11월까지, 월 입력시에는 항상 -1
//        출력할 때는 +1

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(birthDay));

        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth()+1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

//        Calendar는 추상클래스라서 인스턴스화가 불가능
        Calendar calendar = Calendar.getInstance(); // 그럼 이 인스턴스는? Gregorian Calendar
//        왜 이렇게 쓰는가. 그레고리언 캘린더를 다른걸로 교체한다고 해도 실제 사용자들이 무언가를 수정할 필요가 없도록 하려고
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(Calendar.MONTH)+1);

//        Date보다는 Calendar가 더 최신
        calendar.set(Calendar.YEAR,2020);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(2020, 11, 25);

        System.out.println("============");
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        Calendar now2 = Calendar.getInstance();
        System.out.println(now2.get(Calendar.DATE));
        System.out.println(now2.getActualMaximum(Calendar.DATE));
        System.out.println(now2.get(Calendar.DAY_OF_WEEK));     // 3인 이유, 일월화수목금토 순서로 되어있음
    }
}
