package day15.step3_JDBC;

import java.sql.*;
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
                    // 1. 등록 기능
                    System.out.print(">>[저장C] 이름: ");
                    String name = scan.next(); // 사용자로부터 이름 입력 받기
                    // 입력받은 이름을 DB에 저장하는 SQL 쿼리 작성 및 실행
                    String sql = "insert into table1 values('" + name + "')";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate(); // SQL 실행
                } else if (ch == 2) {
                    // 2. 출력 기능
                    System.out.println("====== 이름 명단 ======");
                    // DB에서 모든 레코드를 검색하는 SQL 쿼리 작성 및 실행
                    String sql = "select * from table1";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery(); // 쿼리 실행 결과를 ResultSet으로 받음
                    while (rs.next()) { // 결과 셋의 모든 행을 순회
                        System.out.println(rs.getString("name")); // 각 행의 "name" 컬럼 값을 출력
                    }
                } else if (ch == 3) {
                    // 3. 수정 기능
                    System.out.print(">>[수정U] 기존이름: ");
                    String oldName = scan.next(); // 수정할 기존 이름 입력 받기
                    System.out.print(">>[수정U] 새로운이름: ");
                    String newName = scan.next(); // 새로운 이름 입력 받기
                    // DB에서 기존 이름을 새로운 이름으로 수정하는 SQL 쿼리 작성 및 실행
                    String sql = "update table1 set name = '" + newName + "' where name = '" + oldName + "'";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate(); // SQL 실행
                } else if (ch == 4) {
                    // 4. 삭제 기능
                    System.out.print(">>[삭제D] 이름: ");
                    String name = scan.next(); // 삭제할 이름 입력 받기
                    // 입력받은 이름에 해당하는 레코드를 DB에서 삭제하는 SQL 쿼리 작성 및 실행
                    String sql = "delete from table1 where name = '" + name + "'";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.executeUpdate(); // SQL 실행
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
                System.out.println("널포인터 오류: " + e); // 널 포인터 예외 처리
            }
        }
    }
}