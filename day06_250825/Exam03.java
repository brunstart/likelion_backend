package day06_250825;

public class Exam03 {
    public static void main(String[] args) {
//        비슷한 것들끼리만 가능
//        객체들 사이의 형변환은 어떤 조건들 사이에서만 가능한지
//        상속 관계에 있을때만 형변환이 가능
        Parent1 p = new Child1();
//        형변환 - 작은 그릇에서 큰 그릇으로 바꿀 때 (묵시적 형변환 가능)
//        큰 그릇 : Parent1, 작은 그릇 : Child1

        Object obj = p;     // 묵시적 형변환 (Object는 가장 큰 객체)
        //p = obj;          // 큰 그릇으로 옮겨 담은 후 다시 작은 그릇으로 옮겨 담을 때 오류 발생
        p = (Parent1) obj;  // 명시적 형변환

        Child1 c = (Child1) p;  // 가능

        Parent1 pp = new Parent1();

//        형변환시에는 인스턴스가 중요
//        p는 Child1 인스턴스라서 형변환이 가능
//        pp는 인스턴스 자체가 Parent1이라서 Child1으로 형변환 불가

//        Child1 cc = (Child1) pp;    // 오류는 없지만 실행 불가

        if (pp instanceof Child1) {     // pp의 인스턴스가 Child1인지 검사하고 맞다면 형변환
            Child1 cc = (Child1) pp;
        }
    }
}
