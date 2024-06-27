package day16.model.dao;

import day16.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// 회원 데이터 접근 객체(DAO)
public class MemberDao {
    // 공유 MemberDao 인스턴스
    public static MemberDao mDao = new MemberDao();

    // 데이터베이스 연결 객체
    Connection conn;
    // SQL 실행 객체
    PreparedStatement ps;
    // 쿼리 결과 저장 객체
    ResultSet rs;

    // 데이터베이스 연결 생성자
    MemberDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06",
                    "root", "1234");
        } catch (Exception e) {
            System.out.println("데이터베이스 연결 실패: " + e);
        }
    }

    // 회원가입 처리 메서드
    public boolean signup(MemberDto memberDto) {
        try {
            String sql = "INSERT INTO member (mid, mpwd, mname, mphone) VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);

            ps.setString(1, memberDto.getMid());
            ps.setString(2, memberDto.getMpwd());
            ps.setString(3, memberDto.getMname());
            ps.setString(4, memberDto.getMphone());

            int count = ps.executeUpdate();
            return count == 1;
        } catch (Exception e) {
            System.out.println("회원가입 처리 실패: " + e);
            return false;
        }
    }

    // 로그인 처리 메서드
    public void login() {
        // 미구현 상태
    }


    // 아이디 찾기 처리 메서드
    public void findId() {
        // 미구현 상태
    }

    // 비밀번호 찾기 처리 메서드
    public void findPwd() {
        // 미구현 상태
    }
}