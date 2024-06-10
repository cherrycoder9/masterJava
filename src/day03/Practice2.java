package day03;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급',
        70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
        */
        //문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
        System.out.print("점수 : ");
        int 점수 = scanner.nextInt();

        if (점수 >= 90) {
            System.out.print("A등급");
        } else if (점수 >= 80) {
            System.out.print("B등급");
        } else if (점수 >= 70) {
            System.out.print("C등급");
        } else {
            System.out.println("재시험");
        }

        /*
        문제5 : 가위바위보 게임 구현하기.
        - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
        - 승리자 판단과 무승부 경우의수를 출력하시오.
        [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
        [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 '
        무승부 이면 '무승부' 출력 하시오.
        */
        System.out.println("가위: 0, 바위: 1, 보: 2");
        System.out.print("플레이어1 입력: ");
        int player1 = scanner.nextInt();
        System.out.print("플레이어2 입력: ");
        int player2 = scanner.nextInt();
        int result = player1 - player2;
        if (result == 0) {
            System.out.println("무승부");
        } else if (result == 1 || result == -2) {
            System.out.println("플레이어1 승리");
        } else {
            System.out.println("플레이어2 승리");
        }

        /*
        문제8 : 로그인 처리
        [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
        [처리출력 조건]
        1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
        2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
        3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
        */
         /*        문제8 : 로그인 처리
   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
   [처리출력 조건]
        1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
        2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
        3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'*/

        System.out.print("ID : ");
        String id = scanner.next();
        System.out.print("PW : ");
        String pw = scanner.next();

        if (id.equals("admin")) {
            if (pw.equals("1234")) {
                System.out.println("로그인성공");
            } else {
                System.out.println("비밀번호 정보가 일치하지 않습니다.");
            }
        } else {
            System.out.println("아이디 정보가 일치하지 않습니다.");
        }


//        /*System.out.print(">> ID: ");
//        String inputId = scanner.next();
//        System.out.print(">> PW: ");
//        String inputPw = scanner.next();
//        boolean correctId = inputId.equals("admin");
//        boolean correctPw = inputPw.equals("1234");
//
//        if (correctId && correctPw) {
//            System.out.println("로그인 성공");
//        } else if (correctId) {
//
//        }*/
    }

}
