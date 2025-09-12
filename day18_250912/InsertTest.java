package day18_250912;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest {
    public static void main(String[] args) throws Exception {
        // 0. 드라이버로딩 (MySQL 드라이버를 메모리에 올려준다)
        // 최신 버전은 알아서 해줌, 생략 가능
        // Class.forName("com.mysql.cj.jdbc.Driver");

        // 1. 접속 :  Connection 을 얻어내는 일
        String url = "jdbc:mysql://localhost:3306/liondb";      // DBMS마다 원하는 url 형식이 조금씩 다름
        String user = "root";       // root 접속은 바람직하지는 않음
        String password = "root1234";
        Connection conn = DriverManager.getConnection(url, user, password);

        // 2. 쿼리 작성 : Statement(쿼리를 추상화한 객체), PreparedStatement
        // 쿼리문이 실행될 때 DBMS가 알아들을 수 있게 번역(파싱) 된다.
        // 같은 쿼리가 또 들어오면 이미 번역한 것을 사용한다.

        // insert into students(name) values('kang');
        // insert into students(name) values('hong');
        // insert into students(name) values('kim');
        // 위 세개의 쿼리는 각자 다른 쿼리로 인식, statement는 값까지 들어간 완벽한 쿼리로 실행된다.
        // insert into students(name) values (?); -- PreparedStatement는 여기까지 미리 번역해놓음, ?값이 달라져도 미리 번역해놓은걸 사용
        // PreparedStatement 사용 예정
        String sql = "insert into dept(deptno, dname, loc) values (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        // 반드시 ? 에 값을 채워줘야함
        ps.setInt(1, 50); // 1번째 ?에 50을 넣는다.
        ps.setString(2, "lion"); // 2번째 ?에 lion을 넣는다
        ps.setString(3, "Seoul"); // 3번째 ?에 Seoul을 넣는다.

        // 3. 실행!
        // ps.executeQuery();  // resultSet을 반환, (조회 할 때 사용)
        int resultCount = ps.executeUpdate(); // int를 반환 (등록, 수정, 삭제할 때 사용)

        if (resultCount == 1)
        {
            System.out.println("입력성공");
        }

        ps.close();
        conn.close();
    }
}
