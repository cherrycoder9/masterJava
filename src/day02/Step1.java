package day02; // 현재 클래스 파일이 위치한 패키지

public class Step1 { // class 시작
    // 자바는 모든 코드를 클래스 안에 작성해야 함 (스레드 포함)
    // 실행할 코드는 모드 메인 함수 안에 작성한다
    // 지역변수 정의, 함수 호출
    public static void main(String[] args) { // 메인 시작
        // 자바에서 상수 사용시 final 예약어/키워드
        final int MAX_NUM = 100;
        // MAX_NUM = 200; 오류 발생: 상수이므로 수정이 불가능하다.
        final int MIN_NUM;
        MIN_NUM = 0;
        System.out.println("MIN_NUM = " + MIN_NUM);
        // 리터럴이란? 개발자 코드에 입력하는 모든 숫자, 문자, 논리값 등을 일컫는 말(문자열 제외)

    } // 메인 끝
} // class 끝
