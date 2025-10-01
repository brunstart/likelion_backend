package Java.day07_250826;

public class Code {
    public static void main(String[] args) {
        String ineq = "<";
        String eq = "=";

        int n = 20;
        int m = 50;

        if (ineq.equals("<"))
        {
            if (eq.equals("="))
            {
                if (n <= m)
                {
                    System.out.println(1);
                }
                else
                {
                    System.out.println(0);
                }
            }
            else
            {
                if (n < m)
                {
                    System.out.println(1);
                }
                else
                {
                    System.out.println(0);
                }
            }
        }
        else
        {
            if (eq.equals("="))
            {
                if (n <= m)
                {
                    System.out.println(1);
                }
                else
                {
                    System.out.println(0);
                }
            }
            else
            {
                if (n < m)
                {
                    System.out.println(1);
                }
                else
                {
                    System.out.println(0);
                }
            }
        }
    }
}
