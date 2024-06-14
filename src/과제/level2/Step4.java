package 과제.level2;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        /*
        [문제] 가위바위보 게임을 진행합니다.
	    [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        2. 가위 바위 보 입력은 문자로 입력받습니다. [ player 변수 사용 ]
        3. 그림과 같이 컴퓨터가 낸 수를 출력합니다. [ com 변수 사용 ]
        4. 승리자를 출력합니다.
        */

        String computer = "보";
        Scanner scan = new Scanner(System.in);
        System.out.print("가위 바위 보 선택 : ");
        String player = scan.next();
        if (player.equals("보")) {
            System.out.printf("result) %s", "무승부");
        } else if (player.equals("가위")) {
            System.out.printf("result) %s", "player 승리");
        } else if (player.equals("바위")) {
            System.out.printf("result) %s", "com 승리");
        }
    }
}
