package 과제.level2;

import java.util.Random;
import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        /*[문제] 가위바위보 게임을 진행합니다.
	    [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        2. 가위 바위 보 입력은 문자로 입력받습니다. [ player 변수 사용 ]
        3. 그림과 같이 컴퓨터가 낸 수를 출력합니다. [ com 변수 사용 ]
        난수 생성 코드 참고 : int random = new Random().nextInt(3);
        4. 승리자를 출력합니다.*/

        Random randomGen = new Random();
        int random = randomGen.nextInt(3);
        System.out.println(random);
        String computer = "";
        if (random == 0) {
            computer = "가위";
        } else if (random == 1) {
            computer = "바위";
        } else {
            computer = "보";
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("가위 바위 보 선택 : ");
        String player = scan.next();

        switch (player) {
            case "보" -> {
                switch (computer) {
                    case "보" -> System.out.printf("result) %s%n", "무승부");
                    case "가위" -> System.out.printf("result) %s%n", "com 승리");
                    case "바위" -> System.out.printf("result) %s%n", "player 승리");
                }
            }
            case "가위" -> {
                switch (computer) {
                    case "보" -> System.out.printf("result) %s%n", "player 승리");
                    case "가위" -> System.out.printf("result) %s%n", "무승부");
                    case "바위" -> System.out.printf("result) %s%n", "com 승리");
                }
            }
            case "바위" -> {
                switch (computer) {
                    case "보" -> System.out.printf("result) %s%n", "com 승리");
                    case "가위" -> System.out.printf("result) %s%n", "player 승리");
                    case "바위" -> System.out.printf("result) %s%n", "무승부");
                }
            }
            default -> System.out.printf("result) %s%n", "잘못된 입력");
        }
    }
}
