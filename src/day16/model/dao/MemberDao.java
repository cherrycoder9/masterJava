package day16.model.dao; // day16 패키지의 model.dao 서브 패키지에 속함

// MemberDto 클래스를 사용하기 위해 import
// Connection: 데이터베이스 연결을 위한 클래스
// DriverManager: JDBC 드라이버를 로드하고 연결을 설정하기 위한 클래스
// PreparedStatement: SQL 쿼리를 실행하기 위한 클래스
// ResultSet: SQL 쿼리의 결과를 저장하고 처리하기 위한 클래스

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

    // MemberDao 생성자
    MemberDao() {
        try {
            // MySQL JDBC 드라이버를 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 데이터베이스 연결을 설정
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/day06", // JDBC URL (데이터베이스 주소)
                    "root", // 데이터베이스 사용자 이름
                    "1234"); // 데이터베이스 비밀번호
        } catch (Exception e) {
            // 예외 발생 시 예외 메시지 출력
            System.out.println("데이터베이스 연결 실패: " + e);
        }
    } // MemberDao 생성자 끝

    // 회원가입 처리 메서드
    public boolean signup(MemberDto memberDto) {
        try {
            // SQL 쿼리 작성: 회원 정보를 member 테이블에 삽입하는 쿼리
            String sql = "INSERT INTO member (mid, mpwd, mname, mphone) VALUES (?, ?, ?, ?)";
            // PreparedStatement 객체 생성
            ps = conn.prepareStatement(sql);
            // SQL 쿼리의 첫 번째 '?'에 회원 ID 설정
            ps.setString(1, memberDto.getMid());
            // SQL 쿼리의 두 번째 '?'에 회원 비밀번호 설정
            ps.setString(2, memberDto.getMpwd());
            // SQL 쿼리의 세 번째 '?'에 회원 이름 설정
            ps.setString(3, memberDto.getMname());
            // SQL 쿼리의 네 번째 '?'에 회원 연락처 설정
            ps.setString(4, memberDto.getMphone());

            // SQL 쿼리 실행 후 삽입된 행의 수를 반환
            int count = ps.executeUpdate();
            // 삽입된 행의 수가 1이면, 즉 성공적으로 삽입되었으면 true 반환
            return count == 1;
        } catch (Exception e) {
            // 예외 발생 시 예외 메시지 출력
            System.out.println("회원가입 처리 실패: " + e);
        }
        return false;
    } // signup 함수 종료

    // 로그인 처리 메서드 : 로그인 성공한 회원번호 반환
    public int login(MemberDto memberDto) {
        System.out.println("memberDto = " + memberDto);
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
            if (rs.next()) {
                // 결과 확인 및 회원 번호 반환
                return rs.getInt("mno"); // 다음 레코드가 1개라도 회원번호 반환
            }


        } catch (Exception e) {
            System.out.println("로그인 처리 실패: " + e);

        }
        return 0; // 로그인 실패
    } // login 함수 종료


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
    } // findId 메서드 종료

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
            // rs.next(): 현재 커서를 다음 행으로 이동시킴
            // rs.next(): 다음 행이 존재하면 true를 반환하고, 더 이상 행이 없으면 false를 반환
            if (rs.next()) {
                // 다음 행이 존재하면 해당 행의 "mpwd" 컬럼 값을 반환
                return rs.getString("mpwd");
            } else {
                // 다음 행이 존재하지 않으면 null을 반환
                return null;
            }
        } catch (Exception e) {
            System.out.println("로그인 처리 실패: " + e);
            return null;
        }
    } // findPwd 메서드 종료

    // 1. 로그아웃 함수
    public void logout() {
    } // logout 메서드 종료

    // 2. 회원수정 함수
    // 로그인된 회원이름과 회원연락처를 수정 구현
    public boolean mUpdate(MemberDto memberDto) {
        try {
            // SQL 쿼리 작성: 회원 이름과 연락처를 업데이트하는 쿼리
            String sql = "update member set mname = ?, mphone = ? where mno = ?;";
            // PreparedStatement 객체 생성
            ps = conn.prepareStatement(sql);
            // SQL 쿼리의 첫 번째 '?'에 회원 이름 설정
            ps.setString(1, memberDto.getMname());
            // SQL 쿼리의 두 번째 '?'에 회원 연락처 설정
            ps.setString(2, memberDto.getMphone());
            // SQL 쿼리의 세 번째 '?'에 회원 번호 설정
            ps.setInt(3, memberDto.getMno());

            // SQL 쿼리 실행 후 업데이트된 행의 수를 반환
            int count = ps.executeUpdate();
            // 업데이트된 행의 수가 1이면, 즉 성공적으로 업데이트되었으면 true 반환
            if (count == 1) {
                return true;
            }
        } catch (Exception e) {
            // 예외 발생 시 예외 메시지 출력
            System.out.println(e);
        }
        // 업데이트 실패 시 false 반환
        return false;
    } // mUpdate 함수 종료

    // 3. 회원탈퇴 함수
    public boolean mDelete(String confirmPwd, int loginMno) {
        try {
            // SQL 쿼리 작성: 회원 번호와 비밀번호를 조건으로 회원을 삭제하는 쿼리
            String sql = "delete from member where mno = ? and mpwd = ?";
            // PreparedStatement 객체 생성
            ps = conn.prepareStatement(sql);
            // SQL 쿼리의 첫 번째 '?'에 로그인된 회원 번호 설정
            ps.setInt(1, loginMno);
            // SQL 쿼리의 두 번째 '?'에 확인용 비밀번호 설정
            ps.setString(2, confirmPwd);
            // SQL 쿼리 실행 후 삭제된 행의 수를 반환
            int count = ps.executeUpdate();
            // 삭제된 행의 수가 1이면, 즉 성공적으로 삭제되었으면 true 반환
            if (count == 1) {
                return true;
            }
        } catch (Exception e) {
            // 예외 발생 시 예외 메시지 출력
            System.out.println(e);
        }
        // 삭제 실패 시 false 반환
        return false;
    } // mDelete 함수 종료

} // MemberDao 클래스 종료