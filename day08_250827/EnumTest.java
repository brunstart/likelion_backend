package day08_250827;

import static day08_250827.OrderStatus.fromCode;

public class EnumTest {
    public static void main(String[] args) {
//        요일 값을 저장하고 싶다.
        String day;
        day = "MONDAY";
//        요일만 저장하고 싶은데
        day = "test";
        day = "yang";

        Day today = Day.TUESDAY;
//        today = "kang";

        OrderStatus status = OrderStatus.CANCELLED;
        System.out.println(fromCode("P"));
        System.out.println(status.getDescription());
    }
}
