package day15.step3_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        Connection conn = null; // 데이터베이스 연결을 위한 Connection 객체 선언
        try {
            // MySQL JDBC 드라이버를 메모리에 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 데이터베이스 연결 설정 (URL, 사용자명, 비밀번호)
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05", "root", "1234");
        } catch (Exception e) {
            System.out.println("연동실패: " + e); // 데이터베이스 연결 실패 시 에러 메시지 출력
        }

        while (true) { // 무한 루프로 프로그램 실행
            System.out.print("1.등록 2.출력 3.수정 4.삭제: ");
            try {
                int ch = scan.nextInt(); // 사용자로부터 메뉴 선택 입력 받기
                if (ch == 1) {
                    // 1. 사용자로부터 이름 입력 받기
                    System.out.print(">>[저장C] 이름: ");
                    String name = scan.next();
                    // 2. 입력받은 이름을 DB에 저장
                    String sql = "insert into table1 values('" + name + "')";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate(); // SQL 실행
                } else if (ch == 2) {
                    // 출력 기능 (미구현)
                } else if (ch == 3) {
                    // 수정 기능 (미구현)
                } else if (ch == 4) {
                    System.out.print(">>[삭제D] 이름: ");
                    String name = scan.next();
                    String sql = "delete from table1 where name = '" + name + "'";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate();
                } else {
                    System.out.println("없는 기능 번호입니다."); // 잘못된 메뉴 선택 시 메시지 출력
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력" + e); // 입력 형식이 잘못된 경우 예외 처리
                // 잘못 입력된 값을 가지고 있는 객체를 초기화
                scan = new Scanner(System.in);
            } catch (SQLException e) {
                System.out.println("SQL 구문오류: " + e); // SQL 관련 예외 처리
            } catch (NullPointerException e) {
                System.out.println("널포인터 오류: " + e); // SQL 관련 예외 처리
            }
        }
    }
}