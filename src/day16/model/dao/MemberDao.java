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
    public boolean login(MemberDto memberDto) {
        try {
            // 1. SQL 쿼리 준비
            String sql = "SELECT * FROM member WHERE mid = ? AND mpwd = ?;";

            // 2. PreparedStatement 객체 생성
            ps = conn.prepareStatement(sql);

            // 3. SQL 쿼리의 파라미터 설정
            ps.setString(1, memberDto.getMid());
            ps.setString(2, memberDto.getMpwd());

            // 4. SQL 쿼리 실행 및 결과 저장
            rs = ps.executeQuery();

            // 5. 결과 확인 및 반환
            return rs.next(); // 결과가 존재하면 true, 없으면 false 반환
        } catch (Exception e) {
            System.out.println("로그인 처리 실패: " + e);
            return false;
        }
    }


    // 아이디 찾기 처리 메서드
    public String findId(MemberDto memberDto) {
        try {
            // 1. SQL 쿼리 준비
            String sql = "SELECT * FROM member WHERE mname = ? and mphone = ?;";

            // 2. PreparedStatement 객체 생성
            ps = conn.prepareStatement(sql);

            // 3. SQL 쿼리의 파라미터 설정
            ps.setString(1, memberDto.getMname());
            ps.setString(2, memberDto.getMphone());

            // 4. SQL 쿼리 실행 및 결과 저장
            rs = ps.executeQuery();

            // 5. 결과 확인 및 반환
            if (rs.next()) {
                return rs.getString("mid");
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("로그인 처리 실패: " + e);
            return null;
        }
    }

    // 비밀번호 찾기 처리 메서드
    public String findPwd(MemberDto memberDto) {
        System.out.println(memberDto);
        try {
            // 1. SQL 쿼리 준비
            String sql = "SELECT * FROM member WHERE mid = ? and mphone = ?;";

            // 2. PreparedStatement 객체 생성
            ps = conn.prepareStatement(sql);

            // 3. SQL 쿼리의 파라미터 설정
            ps.setString(1, memberDto.getMid());
            ps.setString(2, memberDto.getMphone());

            // 4. SQL 쿼리 실행 및 결과 저장
            rs = ps.executeQuery();

            // 5. 결과 확인 및 반환
            if (rs.next()) {
                return rs.getString("mpwd");
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("로그인 처리 실패: " + e);
            return null;
        }
    }
}