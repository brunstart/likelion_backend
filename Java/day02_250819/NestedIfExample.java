package Java.day02_250819;

public class NestedIfExample {
    public static void main(String[] args) {
        int score  = 85;
        char gender = 'M';

        if (score >= 80)
        {
            if (gender == 'M')
            {
                System.out.println("합격 : 남학생");
            }
            else
            {
                System.out.println("합격 : 여학생");
            }
        }
        else
        {
            System.out.println("불합격");
        }
    }
}
