package day15.step3_MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
    // 정적 필드로 Dao 인스턴스를 생성
    static Dao dao = new Dao();

    // 데이터베이스 연결 및 쿼리 실행을 위한 객체들
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    // 생성자: 데이터베이스 연결을 초기화
    Dao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05",
                    "root", "1234");
            System.out.println("연동 성공");
        } catch (Exception e) {
            System.out.println("연동실패" + e);
        }
    }

    // 회원 등록을 위한 SQL 실행 메서드
    public boolean signupC(String name) {
        try {
            String sql = "insert into table1 values('" + name + "')";
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("등록 SQL 처리 함수: " + e);
        }
        return false;
    }

    // 모든 회원 목록을 조회하는 SQL 실행 메서드
    public ArrayList<String> printC() {
        ArrayList<String> list = new ArrayList<>();
        try {
            String sql = "select * from table1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("출력 SQL 처리 함수: " + e);
        }
        return list;
    }

    // 회원 정보를 수정하는 SQL 실행 메서드
    public boolean updateC(String oldName, String newName) {
        try {
            String sql = "update table1 set name = '" + newName + "' where name = '" + oldName + "'";
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("수정 SQL 처리 함수: " + e);
        }
        return false;
    }

    // 회원을 삭제하는 SQL 실행 메서드
    public boolean deleteC(String name) {
        try {
            String sql = "delete from table1 where name = '" + name + "'";
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("삭제 SQL 처리 함수: " + e);
        }
        return false;
    }
}