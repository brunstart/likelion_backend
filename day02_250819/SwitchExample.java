package day02_250819;

public class SwitchExample {
    public static void main(String[] args) {
        int month = 7;
        String season;

//        스위치 문은 break가 없을 경우 case에 해당한다고 해도 스위치 문 탈출 안하고 계속 내려감
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "잘못된 월";
                break;
        }

//        IntelliJ가 추천하는 향상된 스위치 구문
//        String season = switch (month) {
//            case 12, 1, 2 -> "겨울";
//            case 3, 4, 5 -> "봄";
//            case 6, 7, 8 -> "여름";
//            case 9, 10, 11 -> "가을";
//            default -> "잘못된 월";
//        };


//        해당 스위치 문을 if문으로 변환하는 경우
//        if (month == 12 || month == 1 || month == 2)
//        {
//            season = "겨울";
//        }
//        else if (month == 3 || month == 4 || month == 5)
//        {
//            season = "봄";
//        }
//        else if (month == 6 || month == 7 || month == 8)
//        {
//            season = "여름";
//        }
//        else if (month == 9 || month == 10 || month == 11)
//        {
//            season = "가을";
//        }
//        else
//        {
//            season = "잘못된 월";
//        }

        System.out.println(month + "월은 " + season + "입니다.");
    }
}
