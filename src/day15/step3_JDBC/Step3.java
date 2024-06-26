package day15.step3_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step3 {
    public static void main(String[] args) throws SQLException {
        // 1. JDBC 드라이버 로드
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL JDBC 드라이버 클래스 로드
            System.out.println("JDBC 드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 실패: " + e);
            return; // 드라이버 로드 실패 시 프로그램 종료
        }

        // 2. 데이터베이스 연결
        Connection conn = null;
        try {
            // JDBC URL, 사용자명, 비밀번호를 이용해 데이터베이스에 연결
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day04", "root", "1234");
            System.out.println("데이터베이스 연결 성공: " + conn);
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패: " + e);
        } finally {
            // 연결 객체 닫기 (리소스 해제)
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("연결 닫기 실패: " + e);
                }
            }
        }
    }
}

/*
 * JDBC (Java Database Connectivity)
 *
 * 1. JDBC 개요
 *    - 정의: Java 애플리케이션에서 데이터베이스에 접근할 수 있게 해주는 API
 *    - 구성: Java에서 제공하는 인터페이스와 DBMS 제공업체의 구현 클래스
 *
 * 2. JDBC 드라이버 설치 과정
 *    1) https://dev.mysql.com/downloads/connector/j/ 에서 드라이버 다운로드
 *    2) mysql-connector-j-x.x.x.jar 파일을 프로젝트에 추가
 *    3) IntelliJ IDEA에서 추가 방법: File -> Project Structure -> Libraries
 *
 * 3. JDBC 연동 단계
 *    1) 드라이버 로드: Class.forName("com.mysql.cj.jdbc.Driver");
 *    2) DB 연결: DriverManager.getConnection(url, user, password);
 *    3) SQL 실행: PreparedStatement 또는 Statement 객체 사용
 *    4) 결과 처리: ResultSet 객체로 조회 결과 처리
 *    5) 리소스 해제: Connection, Statement, ResultSet 객체 close
 *
 * 4. 주요 JDBC 인터페이스
 *    4.1 Connection: 데이터베이스 연결 관리
 *        - 주요 메서드:
 *          prepareStatement(String sql): SQL 준비 및 PreparedStatement 반환
 *
 *    4.2 Statement/PreparedStatement: SQL 실행
 *        - 주요 메서드:
 *          executeUpdate(): INSERT, UPDATE, DELETE 실행 및 영향받은 행 수 반환
 *          executeQuery(): SELECT 실행 및 ResultSet 반환
 *
 *    4.3 ResultSet: 쿼리 결과 저장 및 접근
 *        - 주요 메서드:
 *          next(): 다음 레코드로 이동, 존재 시 true, 없으면 false 반환
 *          getString("필드명"): 현재 레코드의 지정된 컬럼 값을 문자열로 반환
 *          getInt("필드명"): 현재 레코드의 지정된 컬럼 값을 정수로 반환
 *
 *        - 내부 구조 및 동작 예시:
 *          초기 상태: ResultSet [커서] ---.next()--> [첫 번째 레코드]
 *          ResultSet에서 '커서'는 현재 데이터베이스 결과 집합에서 어느 위치를 가리키고 있는지를 나타내는 개념적인 포인터
 *          ResultSet이 생성되면 커서는 첫 번째 행의 바로 앞에 위치
 *          이 상태에서는 어떤 데이터도 가리키고 있지 않음
 *
 *          테이블 예시 (name 필드):
 *          1. 신동엽
 *          2. 하하
 *          3. 유재석
 *
 *          ResultSet 사용:
 *          1. rs.next() -> true,  현재 레코드: [신동엽]
 *             rs.getString("name") 호출 시 "신동엽" 반환
 *          2. rs.next() -> true,  현재 레코드: [하하]
 *             rs.getString("name") 호출 시 "하하" 반환
 *          3. rs.next() -> true,  현재 레코드: [유재석]
 *             rs.getString("name") 호출 시 "유재석" 반환
 *          4. rs.next() -> false, 더 이상 레코드 없음
 */