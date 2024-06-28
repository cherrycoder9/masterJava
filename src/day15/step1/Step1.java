package day15.step1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        // 일반 예외: 발생 할수도 있고 안할수도 있는데 컴파일러가 무조건 예외처리 검사
        try {
            Class.forName("java.lang.String"); // .forName(클래스명): 해당 클래스명이 존재하는지 검사해주는 함수
            Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("1. ClassNotFoundException e: " + e); // 로그를 남기고 추후에 개발자가 코드 수정
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
            System.out.println("2. NullPointerException e: " + e);
        }

        //
        String str3 = "100";
        String str4 = "1aa";

        int result1 = Integer.parseInt(str3); // Integer 클래스: int형 관련 클래스,
        // parseInt() 문자열 -> 정수형 타입 변환
        // .parseInt(): static 함수인가요? 맞습니다
        System.out.println(result1);

        try {
            int result2 = Integer.parseInt(str4);
            System.out.println(result2);
        } catch (NumberFormatException e) {
            System.out.println("3. NumberFormatException e: " + e);
        }

        //
        try {
            int[] intArray = {1, 2, 3};
            System.out.println(intArray[2]);
            System.out.println(intArray[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4. ArrayIndexOutOfBoundsException e: " + e);
        }

        //
        try {
            Scanner scanner = new Scanner(System.in);
            // 만약에 문자 입력시 InputMismatchException 예외 발생
            int ch = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("5. InputMismatchException e: " + e);
        }

        // try 다중 catch
        try {
            String str5 = "1aa";
            int result3 = Integer.parseInt(str5);
            int[] intArray3 = {1, 2, 3};
            System.out.println(intArray3[3]);
        } catch (NumberFormatException e) {
            System.out.println("숫자형으로 변환 불가");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열에 없는 인덱스야");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외 발생. 추후 보수 예정");
        } finally {
            System.out.println("여기는 예외가 있던 말던 무조건 실행되는 구역");
        }


    }
}
