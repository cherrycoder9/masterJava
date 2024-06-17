package day08.step2;

import java.util.Scanner;

public class AddPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 축구선수를 최대 100명 저장할 수 있는 배열 선언
        플레이어[] 축구선수들 = new 플레이어[100];
        int cnt = 0;
        while (true) {
            System.out.print("1. 선수등록 2. 선수명단 3. 선수삭제   선택: ");
            int ch = scan.nextInt();
            if (ch == 1) {
                // 선수등록
                // 1번 입력시 선수의 속성값(고유식별번호(자동), 이름, 나이, 선호포지션, 소속팀)을 입력받음
                System.out.print("이름을 입력하세요: ");
                String name = scan.next();
                System.out.print("나이를 입력하세요: ");
                int age = scan.nextInt();
                System.out.print("포지션을 입력하세요: ");
                String position = scan.next();
                System.out.print("소속팀을 입력하세요: ");
                String team = scan.next();
                축구선수들[cnt] = new 플레이어(++cnt, name, age, position, team);
            } else if (ch == 2) {
                // 선수명단 출력
                for (int i = 0; i < 축구선수들.length; i++) {
                    if (축구선수들[i] == null || 축구선수들[i].get고유식별번호() == -1) {
                        continue;
                    }
                    축구선수들[i].printPlayerInfo();
                }
            } else if (ch == 3) {
                // 선수명단 삭제
                System.out.print("삭제할 회원번호: ");
                int removeNum = scan.nextInt();
                for (int i = 0; i < 축구선수들.length; i++) {
//                    if (축구선수들[i].get고유식별번호() == removeNum) {
//                        축구선수들[removeNum] = 축구선수들[removeNum + 1];
//                        축구선수들[removeNum + 1] = new 플레이어();
//                        continue;
//                    }
                    if (축구선수들[i] == null || 축구선수들[i].get고유식별번호() == -1) {
                        continue;
                    }
                    if (축구선수들[i].get고유식별번호() == removeNum) {
                        System.out.println("회원이 삭제되었습니다.");
                        축구선수들[i].set고유식별번호(-1);
                    }
                }
            } else {
                System.out.println("종료");
                break;
            }
        }
        // 1번 입력시 선수의 속성값(고유식별번호, 이름, 나이, 선호포지션, 소속팀)을 입력받아 객체 생성후 배열에 저장
        // - 고유식별번호는 자동할당 또는 입력

        // 2번 입력시 현재 배열내 모든 객체를 출력 (단, null이면 출력하지 마세요)
        // - 만약에 2명의 축구선수가 배열내 존재 했을때 아래와 같이 출력
        // 고유식별번호, 이름, 나이, 선호포지션, 소속팀


    }
}
