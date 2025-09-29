package Java.day04_250821;

public class VarArgsExample {
//    객체 - 속성(값, 필드), 행위(기능, 메소드)
//    접근제한자 리턴타입 메소드명(매개변수들...)
//    정수 2개를 받아들여 더한 값을 return 하는 add라는 이름의 메소드 정의
//    누구든지 사용할 수 있도록 접근제한자를 정한다.

    public static int add(int a, int b)
    {
        System.out.println("add a, b");
        return a + b;
    }

//    같은 이름의 메소드를 매개변수와 타입을 다르게 하는것 - 메소드 오버로딩
    public static int add(int a, int b, int c)
    {
        System.out.println("add a, b, c");
        return a + b + c;
    }

//    매개변수 이름과는 상관없이 타입과 개수가 같으면 오류가 생김
//    public static int add(int x, int y, int z)
//    {
//        return x + y + z;
//    }

    public static int add(int x, int y, int z, int a)
    {
        return x + y + z + a;
    }

    //        가변길이 매개변수
    public static int add(int... numbers)
    {
        System.out.println("add numbers");
        int total = 0;

        for (int num : numbers)
        {
            total += num;
        }

        return total;
    }

    public static void printInfo(String name, int... scores)
    {
        System.out.print(name + "의 점수: ");
        for(int score : scores)
        {
            System.out.print(score + " ");
        }
        System.out.println("(총 " + scores.length + "과목)");
    }


//    위와 다른 부분은 동일하고, 두개의 정수를 받아서 첫번째 매개변수에서
//    두번째 매개변수를 뺀 값을 return 하는 minus라는 메소드를 정의.

    public static int minus(int a, int b)
    {
        return a - b;
    }

//    main - 프로그램의 시작점
    public static void main(String[] args) {

        add(1, 3);      // 메소드가 메모리에 올라가있지 않아서 쓸 수가 없는 상태
                              // static 키워드를 써서 메모리에 올리면 사용 가능

        int result = add(15, 32);
        System.out.println(result);

        add(10, 20, 30);
        add(10, 20, 30, 40);

        add(10);
        add(10, 20, 30, 40, 50, 60, 70);
        add(10, 20, 30, 40, 50, 60, 70, 80);

        printInfo("김철수 " , 90, 85, 88);


    }
}
