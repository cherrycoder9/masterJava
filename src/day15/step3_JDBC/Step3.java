package day15.step3_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step3 {
    public static void main(String[] args) throws SQLException {
        // 1. 연동코드
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL 구현체 클래스명
            System.out.println("JDBC 드라이버 호출 성공");
        } catch (Exception e) {
            System.out.println("JDBC 연동 실패: " + e);
        }

        // 2.
        Connection conn; // 인터페이스 타입의 변수 선언
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day04", "root", "1234");
        System.out.println(conn);
        System.out.println("연동 성공");
        /*
         *   JDBC: Java DataBase Connect: 자바 데이터베이스 연동
         *
         *    자바                     각 DBMS 회사별
         *    JDBC인터페이스 제공        구현 클래스 제공
         *                            - MySQL
         *                            - Oracle
         *                            - 등등 각 회사별 구현 클래스가 있는 라이브러리 파일 필요
         *
         *   - JDBC 관련 클래스/인터페이스 라이브러리 설치
         *      1. https://dev.mysql.com/downloads/connector/j/
         *      2.
         *      3. 다운로드 받고 압축 푼 폴더내 mysql-connector-j-8.4.0.jar
         *      4. 해당 jar 오른쪽 클릭 -> 메뉴 하단에 라이브러리 추가
         * 6. [확인] 인텔리제이 상단메뉴 -> 파일 -> 프로젝트 구조 -> 프로젝트세팅 -> 라이브러리
         *
         * - 연동 코드
         *      1. Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 구현체 드라이버 클래스 호출
         *      2. 연동
         *          DriverManager.getConnection("연동할DB서버URL+DB명")
         *      3. 연동 성공시 연동성공한 정보를 가진 객체를 반환, 해당 연동 객체를 가지고 DML(DB) 조작
         * - Connection 인터페이스: DB와 연동 성공한 객체 정보를 가지고 조작/기능/메소드 제공하는 인터페이스
         *      - 추상메소드
         * */
    }
}
