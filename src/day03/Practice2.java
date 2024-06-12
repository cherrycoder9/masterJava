package day03;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//* [ 반복문 없이 풀이하는 입출력과 조건문 문제 ]
//문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
//
        System.out.println("점수를 입력하세요");
        int score = scanner.nextInt();
        System.out.println(score >= 90 ? "합격" : "불합격");

//문제2 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
//
       /* System.out.println("점수를 입력하세요:");
        int score = scanner.nextInt();
        if (score > 90) {
            System.out.println("A등급");
        } else if (score > 80) {
            System.out.println("B등급");
        } else if (score > 70) {
            System.out.println("C등급");
        } else {
            System.out.println("재시험");
        }*/


//문제3 : 각 3개의 정수형으로 수를 입력받아 가장 큰 수를 출력 하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
//
        System.out.println("정수1 입력: ");
        int num1 = scanner.nextInt();
        System.out.println("정수2 입력: ");
        int num2 = scanner.nextInt();
        System.out.println("정수3 입력: ");
        int num3 = scanner.nextInt();

        int maxNum = (num1 > num2) ? (num1 > num3 ? num1 : num3)
                : (num2 > num3 ? num2 : num3);
        System.out.println(maxNum);


//문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
//
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


//문제6 : 윤년/평년 판단하기
//   [ 입력조건 ] 하나의 연도를 입력 받습니다.
//   [ 윤년/평년 조건 ]
//   -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
//   -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
//   -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
//   [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.printf("입력한 %d년은 윤년입니다.\n", year);
        } else if (year % 4 == 0 && year % 100 == 0) {
            System.out.printf("입력한 %d년은 평년입니다.\n", year);
        } else if (year % 4 == 0) {
            System.out.printf("입력한 %d년은 윤년입니다.\n", year);
        }
//
//문제7 : 주차 사용요금 계산하기
//   [ 선언 변수 조건 ] 입차시간이 9시30분 입니다.
//      - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
//   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오.
//   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
//      - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오.
//
        int in_hour = 9;
        int in_minute = 30;
        int out_hour = scanner.nextInt();
        int out_minute = scanner.nextInt();
        int fee = 0;

        if (out_hour - in_hour < 0) {
            System.out.println("출차시간 오류");
        } else if (out_hour - in_hour == 0 && out_minute - in_minute < 0) {
            System.out.println("출차시간 오류");
        } else {
            fee = (out_hour * 60 + out_minute) - (in_hour * 60 + in_minute);
        }

        System.out.printf("사용요금은 %d원 입니다.", fee * 1000);




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


//
//문제9 : 당첨번호 개수  찾기
//   [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9; 이와 같이 변수를 먼저 선언해주세요.
//   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
//   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.
      /*  int 공1 = 14;
        int 공2 = 21;
        int 공3 = 9;
        int sameCount = 0;
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 == 공1 || num1 == 공2 || num1 == 공3) {
            sameCount++;
        }
        if (num2 == 공1 || num1 == 공2 || num1 == 공3) {
            sameCount++;
        }
        if (num3 == 공1 || num1 == 공2 || num1 == 공3) {
            sameCount++;
        }
        System.out.printf("동일한 번호는 %d개 입니다.", sameCount);
*/
//*
//*


    }

}
