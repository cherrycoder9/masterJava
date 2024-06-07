package day02;

import java.util.Arrays;

public class Step4 {
    public static void main(String[] args) { // main s
        // [콘솔 출력]
        // System: 시스템 관련 기능 제공하는 클래스
        // out: 출력 관련 객체 제공
        // print(리터럴 또는 변수명 또는 연산식) : 출력함수
        // println(): 출력함수 + 줄바꿈 포함
        // printf(): 출력 함수 + 형식문자 지원
        System.out.println("Java1");
        System.out.print("Java2");
        System.out.println("Java3");
        System.out.printf("%s 프로그래밍\n", "Java4"); // 문자열
        System.out.printf("%d 프로그래밍\n", 123); // 정수
        System.out.printf("%f 프로그래밍\n", 3.14); // 실수
        System.out.printf("%c 프로그래밍\n", 'c'); // 형식문자
        System.out.printf("\n줄바꿈 \t들여쓰기 \"큰따옴표 출력 \\백슬래시출력 '작은따옴표출력\n"); // 형식문자
        int price = 1500;
        String name = "콜라";
        System.out.println("상품의 가격은 " + price + "원 입니다."); // 형식문자
        System.out.printf("상품의 가격은 %d원 입니다.\n", price); // 형식문자
        System.out.printf("%s의 가격은 %6d원 입니다.\n", name, price);
        System.out.printf("%s의 가격은 %-6d원 입니다.\n", name, price);
        System.out.printf("%s의 가격은 %06d원 입니다.\n", name, price);
        System.out.printf("%s의 가격은 %6.2f원 입니다.\n", name, 3.141592);
        // 형식문자: printf() 함수에서 사용되는 형식문자
        // %s 문자열
        // %c 문자
        // %d 정수
        // %f 실수
        // %자릿수d 자릿수만큼 자리를 차지, 만일 비어있으면 공백처리, 오른쪽 정렬
        // %-자릿수d 자릿수만큼 자리를 차지, 만일 비어있으면 공백처리, 왼쪽 정렬
        // %0자릿수d 자릿수만큼 자리를 차지, 만일 비어있으면 '0'처리, 오른쪽 정렬
        // %자릿수.소수점자릿수f 자릿수만큼 정수부분 자리를 차지, 소수점자릿수만큼 소수점포함 소수점개수 출력

        // 제어문자: 기능이 포함된 문자
        // \n: 줄바꿈
        // \t: 들여쓰기
        // \r: 개행(커서를 앞으로)
        // \\: \ 출력
        // \": " 출력
        // \': ' 출력

        // [콘솔 입력]
        // System:

        // sout
        System.out.println();
        // souf
        System.out.printf("");
        // soutm : 현재 함수명을 문자열로 출력 
        System.out.println("Step4.main");
        // soutp : 현재 함수의 매개변수 값을 출력
        System.out.println("args = " + Arrays.toString(args));
        // soutv : 커서에서 가장 가까운 변수/상수를 출력
        System.out.println("name = " + name);

        System.out.printf("|\\_/|\n" +
                "|q p|   /}\n" +
                "( 0 )\"\"\"\\\n" +
                "|\"^\"`    |\n" +
                "||_/=\\\\__|");
    } // main e
}
