package day15.step1;

public class Step1 {
    public static void main(String[] args) {
        // 일반 예외: 발생 할수도 있고 안할수도 있는데 컴파일러가 무조건 예외처리 검사
        try {
            Class.forName("java.lang.String"); // .forName(클래스명): 해당 클래스명이 존재하는지 검사해주는 함수
            Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException e: " + e); // 로그를 남기고 추후에 개발자가 코드 수정
        }


        try {
            // 실행 예외: 발생 할수도 있고 안할수도 있고 (방지)
            String str1 = "This is Java";
            // 문자열 길이
            System.out.println(str1.length());

            String str2 = null;
            // 널포인터익셉션
            System.out.println(str2.length()); // . 접근 연산자
        } catch (NullPointerException e) {
            System.out.println("NullPointerException e: " + e);
        }
    }
}
