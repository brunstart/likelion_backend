package mysql.day18_250912;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String[] args) throws Exception {
        // 자바 프로그래밍도 DBMS 입장에서는 클라이언트다.
        // 1.DB에 접속, Connection -- 접속을 추상화한 객체

        // Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/liondb";      // DBMS마다 원하는 url 형식이 조금씩 다름
        String user = "root";       // root 접속은 바람직하지는 않음
        String password = "root1234";
        connection = DriverManager.getConnection(url, user, password);

        // connection은 인터페이스인데 이 객체는 누가 구현했는가 : db벤더
        if (connection != null) {
            System.out.println("^^");
        }else {
            System.out.println("-_-;;");
        }

        connection.close();
    }
}