package day03;

import java.util.Scanner;

public class Step2 { // class start
    public static void main(String[] args) { // main start
        // 이름을 하나 입력받고, 내용 입력받고 나이를 입력받는다
        Scanner scan = new Scanner(System.in);

        // 이름 입력받기
        System.out.println("작성자를 입력하세요.");
        String name = scan.next();

        // 내용 입력받기
        System.out.println("방문록을 입력하세요.");
        scan.nextLine();
        String content = scan.nextLine();

        // 나이 입력받기
        System.out.println("나이를 입력하세요.");
        int age = scan.nextInt();

        // 양식에 맞춰서 출력한다
        System.out.println("============ 방문록 ============");
        System.out.printf("%-5s\t%-15s\t%-5s\n", "작성자", "방문록", "나이");
        System.out.printf("%-5s\t%-15s\t%-5d", name, content, age);


        // 기본급과 수당을 정수로 입력받아 실수령액을 계산해 출력
        // 실수령액: 기본급 + 수당 - 세금(기본급의 10%)
//        Scanner scan = new Scanner(System.in);

        // 기본급 입력(정수)
        System.out.println("기본급을 입력하세요:");
        int basicSalary = scan.nextInt();

        // 수당 입력(정수)
        System.out.println("수당을 입력하세요:");
        int allowances = scan.nextInt();

        // 세금
        float taxes = 0.1f;

        // 실수령액 계산
        float netPay = (float) basicSalary * (1.0f - taxes) + (float) allowances;

        // 실수령액 출력
        System.out.println("실수령액 = " + netPay);


    } // main end
} // class end
