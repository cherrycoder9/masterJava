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
    }

    // 5. 게시물 쓰기 함수
    public boolean bWrite(BoardDto boardDto) {
        try {
            String sql = "insert into board(btitle, bcontent, mno) values(?,?,?)";
            ps = conn.prepareStatement(sql); // sql 기재
            ps.setString(1, boardDto.getBtitle());
            ps.setString(2, boardDto.getBcontent());
            ps.setInt(3, boardDto.getMno());
            if (ps.executeUpdate() == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    // 6. 게시물 개별 조회 함수
    public BoardDto bView(int bno) {
        BoardDto boardDto = new BoardDto();
        try {
            String sql = "select * from board where bno=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, bno);
            rs = ps.executeQuery();
            if (rs.next()) {
                // 현재 레코드들의 필드값 각 호출 해서 생성자에 매개변수로 대입
                boardDto.setBno(rs.getInt("bno"));
                boardDto.setBtitle(rs.getString("btitle"));
                boardDto.setBcontent(rs.getString("bcontent"));
                boardDto.setBdate(rs.getString("bdate"));
                boardDto.setBview(rs.getInt("bview"));
                boardDto.setMno(rs.getInt("mno"));
                return boardDto;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
