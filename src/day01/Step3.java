package day01;

import java.util.Arrays;

public class Step3 { // class start
    public static void main(String[] args) {
        // 1. 정수 자료형
        byte b1 = -128;
        System.out.println("b1 = " + b1);
        byte b2 = 127;
        System.out.println("b2 = " + b2);
        // byte b3 = 128; // 저장가능 범위가 아님
        short s1 = 32000;
        System.out.println("s1 = " + s1);
        short s2 = -32000;
        System.out.println("s2 = " + s2);
        // short s3 = 40000; // 저장가능 범위가 아님
        int i1 = 2100000000;
        System.out.println("i1 = " + i1);
        // int i2 = 3000000000; // 저장가능 범위가 아님
        long l1 = 3000000000000000000L; // 자바는 모든 값의 기본을 int로 처리하기 때문에 L붙여야함, 21억 이상인 경우
        
        // 2. 문자 자료형, 문자 1개만 저장가능, ' '작은따옴표, 65536개 문자 표현가능
        // 문자만 됨
        char c1 = 'A';
        System.out.println("c1 = " + c1);
        int i3 = 'A';
        System.out.println("i3 = " + i3);
        char c2 = '가';
        System.out.println("c2 = " + c2);
        int i4 = '가';
        System.out.println("i4 = " + i4);
        // char c3 = '안녕' // char는 문자열 불가능

        // String 클래스, 기본자료형이 아닌 클래스를 사용하므로 첫글자 대문자 String
        // 길이만큼 할당됨
        String str1 = "안녕하세요";
        System.out.println("str1 = " + str1);

        // 논리 자료형
        // boolean: true, false
        boolean bool1 = true;
        boolean bool2 = false;
        // 허용범위 벗어남 boolean bool3 = 't';
        System.out.println("bool1 = " + bool1);
        System.out.println("bool2 = " + bool2);
        
        // 4. 실수 자료형
        // double: 
        double d1 = 0.123456789123456789; // 실수 기본 자료형임. 정수형은 int가 기본자료형
        System.out.println("d1 = " + d1);
        float d2 = 0.123456789123456789f;
        System.out.println("d2 = " + d2);
    }
}
