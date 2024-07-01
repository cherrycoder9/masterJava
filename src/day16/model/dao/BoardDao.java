package day16.model.dao;

import day16.model.dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDao {
    // 싱글톤 인스턴스 생성
    private static BoardDao bDao = new BoardDao();
    // JDBC 인터페이스
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // 생성자: 데이터베이스 연결 설정
    private BoardDao() {
        try {
            // MySQL JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 데이터베이스 연결 설정
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/day06",
                    "root",
                    "1234"
            );

        } catch (Exception e) {
            System.out.println(e); // 예외 발생 시 에러 메시지 출력
        }
    }

    // 싱글톤 인스턴스 반환 메소드
    public static BoardDao getInstance() {
        return bDao;
    }

    // 게시판 (게시물 전체 출력) 함수
    // 매개변수: 없음, 리턴값: 여러 개의 게시물을 담은 ArrayList<BoardDto>
    public ArrayList<BoardDto> bPrint() {
        // 여러개 DTO 담을 리스트 선언
        ArrayList<BoardDto> list = new ArrayList<>();
        try {
            // SQL 쿼리 작성
            String sql = "select * from board";
            // PreparedStatement 객체 생성
            ps = conn.prepareStatement(sql);
            // 쿼리 실행 및 결과 집합(ResultSet) 반환
            rs = ps.executeQuery();
            while (rs.next()) {
                String btitle = rs.getString("btitle");
                String bcontent = rs.getString("bcontent");
                String bdate = rs.getString("bdate");
                int bview = rs.getInt("bview");
                int mno = rs.getInt("mno");
                int bno = rs.getInt("bno");
                // Dto 만들기
                BoardDto boardDto = new BoardDto(btitle, bcontent, bdate, bview, mno, bno);
                // 리스트에 DTO 담기
                list.add(boardDto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list; // 여러개 담긴 DTO 리스트 반환
    } // bPrint 함수 종료

    // 5. 게시물 쓰기 함수
    public boolean bWrite(BoardDto boardDto) {
        try {
            // SQL 쿼리 작성: board 테이블에 새로운 게시물을 삽입
            String sql = "insert into board(btitle, bcontent, mno) values(?,?,?)";
            ps = conn.prepareStatement(sql); // SQL 쿼리 준비
            ps.setString(1, boardDto.getBtitle()); // 첫 번째 ?에 게시물 제목 설정
            ps.setString(2, boardDto.getBcontent()); // 두 번째 ?에 게시물 내용 설정
            ps.setInt(3, boardDto.getMno()); // 세 번째 ?에 작성자 회원 번호 설정
            // 쿼리 실행 및 결과 확인
            if (ps.executeUpdate() == 1) {
                return true; // 쿼리 실행 결과가 1이면 true 반환
            } else {
                return false; // 그렇지 않으면 false 반환
            }
        } catch (Exception e) {
            System.out.println(e); // 예외 발생 시 에러 메시지 출력
        }
        return false; // 예외 발생 시 false 반환
    } // bWrite 함수 종료

    // 6. 게시물 개별 조회 함수
    public BoardDto bView(int bno) {
        BoardDto boardDto = new BoardDto(); // 조회된 게시물을 담을 BoardDto 객체 생성
        try {
            // SQL 쿼리 작성: 특정 게시물 번호에 해당하는 게시물 조회
            String sql = "select * from board where bno=?";
            ps = conn.prepareStatement(sql); // SQL 쿼리 준비
            ps.setInt(1, bno); // 첫 번째 ?에 게시물 번호 설정
            rs = ps.executeQuery(); // 쿼리 실행 및 결과 집합(ResultSet) 반환
            if (rs.next()) {
                // 현재 레코드의 각 필드 값을 BoardDto 객체에 설정
                boardDto.setBno(rs.getInt("bno")); // 게시물 번호 설정
                boardDto.setBtitle(rs.getString("btitle")); // 게시물 제목 설정
                boardDto.setBcontent(rs.getString("bcontent")); // 게시물 내용 설정
                boardDto.setBdate(rs.getString("bdate")); // 게시물 작성 날짜 설정
                boardDto.setBview(rs.getInt("bview")); // 게시물 조회수 설정
                boardDto.setMno(rs.getInt("mno")); // 작성자 회원 번호 설정
                return boardDto; // 설정된 BoardDto 객체 반환
            }
        } catch (Exception e) {
            System.out.println(e); // 예외 발생 시 에러 메시지 출력
        }
        return null; // 예외 발생 시 또는 결과가 없을 시 null 반환
    }

    // 게시물 삭제 함수
    public boolean bDelete(int bno, int mno) {
        try {
            // SQL 쿼리 작성: 특정 게시물 번호와 작성자 회원 번호가 일치하는 게시물 삭제
            String sql = "delete from board where bno=? and mno=?";
            ps = conn.prepareStatement(sql); // SQL 쿼리 준비
            ps.setInt(1, bno); // 첫 번째 ?에 게시물 번호 설정
            ps.setInt(2, mno); // 두 번째 ?에 작성자 회원 번호 설정

            // 쿼리 실행 및 결과 확인
            if (ps.executeUpdate() == 1) {
                return true; // 쿼리 실행 결과가 1이면 true 반환
            }
        } catch (Exception e) {
            System.out.println(e); // 예외 발생 시 에러 메시지 출력
        }
        return false; // 예외 발생 시 또는 삭제 실패 시 false 반환
    } // bDelete 함수 종료

    // 게시물 수정
    public boolean bUpdate(BoardDto boardDto) {
        try {
            // SQL 쿼리 작성: 특정 게시물 번호와 작성자 회원 번호가 일치하는 게시물의 제목과 내용을 수정
            String sql = "update board set btitle=?, bcontent=? where bno=? and mno=?";
            ps = conn.prepareStatement(sql); // SQL 쿼리 준비
            ps.setString(1, boardDto.getBtitle()); // 첫 번째 ?에 새로운 게시물 제목 설정
            ps.setString(2, boardDto.getBcontent()); // 두 번째 ?에 새로운 게시물 내용 설정
            ps.setInt(3, boardDto.getBno()); // 세 번째 ?에 게시물 번호 설정
            ps.setInt(4, boardDto.getMno()); // 네 번째 ?에 작성자 회원 번호 설정
            // 쿼리 실행 및 결과 확인
            if (ps.executeUpdate() == 1) {
                return true; // 쿼리 실행 결과가 1이면 true 반환
            }
        } catch (Exception e) {
            System.out.println(e); // 예외 발생 시 에러 메시지 출력
        }

        return false; // 예외 발생 시 또는 수정 실패 시 false 반환
    } // bUpdate 종료
} // BoardDao 클래스 종료
