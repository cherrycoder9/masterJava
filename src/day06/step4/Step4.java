package day06.step4;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        // 클래스 사용처: 1. 객체설계도 2. main 함수 가지고 있는 실행 클래스

        // 1. 입력객체
        Scanner scanner = new Scanner(System.in);

        int speed = 0; // 속도변수 선언하고 0으로 초기화
        String color = "레드";
        String carNumber = "245어9872";

        // 2. 무한루프
        while (true) {
            // 출력함수
            System.out.println("-----------------------------");
            System.out.print("1. 증속 2. 감속 3. 중지 : ");

            // 입력함수 이용해서 키보드로부터 입력받은 값을 정수형으로 반환해서 변수에 대입
            int ch = scanner.nextInt();
            if (ch == 1) {
                // 증속
                speed++; // 속도 1 증가
                System.out.println("속도 증가" + speed);
            } else if (ch == 2) {
                // 감속
                speed--; // 속도 1 감소
                System.out.println("속도 감소" + speed);
            } else if (ch == 3) {
                // 중지
                speed = 0; // 정지
                System.out.println("멈춤" + speed);
                break;
            } else {
                System.out.println("알 수 없는 입력번호 입니다.");
            }
        }
    }
}
