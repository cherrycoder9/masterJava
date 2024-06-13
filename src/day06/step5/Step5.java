package day06.step5;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car k5 = new Car();
        k5.color = "wine";
        k5.carNumber = "397노7921";

        while (true) {
            // 출력함수
            System.out.println("-----------------------------");
            System.out.print("1. 증속 2. 감속 3. 중지 : ");

            // 입력함수 이용해서 키보드로부터 입력받은 값을 정수형으로 반환해서 변수에 대입
            int ch = scanner.nextInt();
            if (ch == 1) {
                // 증속
                k5.increase();
            } else if (ch == 2) {
                // 감속
                k5.decrease();
            } else if (ch == 3) {
                // 중지
                k5.stop();
                break;
            } else {
                System.out.println("알 수 없는 입력번호 입니다.");
            }
        }
    }
}
