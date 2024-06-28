package day15.step3_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Step4 {
    public static void main(String[] args) throws SQLException {
        try {
            // MySQL JDBC 드라이버를 메모리에 로드
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 데이터베이스 연결 설정 (URL, 사용자명, 비밀번호)
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05", "root", "1234");

            // SQL 문 작성: '유재석'을 table1에 삽입
            String sql = "insert into table1 values('유재석')";

            // SQL 문을 실행하기 위한 PreparedStatement 객체 생성
            PreparedStatement ps = conn.prepareStatement(sql);

            // SQL 문 실행 (데이터베이스에 변경 사항 적용)
            ps.executeUpdate();

            // SQL 문 작성: '강호동'을 table1에 삽입
            sql = "insert into table1 values('강호동')";

            // 새로운 SQL 문을 실행하기 위한 PreparedStatement 객체 생성
            ps = conn.prepareStatement(sql);

            // SQL 문 실행 (데이터베이스에 변경 사항 적용)
            ps.executeUpdate();

        } catch (Exception e) {
            // 예외 발생 시 에러 메시지 출력
            System.out.println("JDBC 연동 실패: " + e);
        }
    }
}