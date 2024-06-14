package 과제.level4;

import java.util.Scanner;

/*
    주제 : '회원' 을 설계하고 만들기
    [ 클래스 생성 ]
    멤버변수/필드 : 회원번호 , 아이디 , 비밀번호 , 이름
    - 위 필드을 적절한 자료형을 선택하여 설계하시오.
    [ 객체 생성 ]
    임의의 데이터를 입력하여 2개의 객체를 생성하고 출력하는 코드를 작성하시오.
*/
public class Member {
    // 멤버변수
    private static int cnt;
    private int num;
    private String id;
    private String pw;
    private String name;

    // 생성자
    Member() {
    }

    Member(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        cnt++;
        this.num = cnt;
    }

    // 메소드
    public void printMemberInfo() {
        System.out.println("아이디: " + id);
        System.out.println("회원번호: " + num);
        System.out.println("이름: " + name);
    }

    public void changePassword() {
        System.out.printf("%s님의 현재 비밀번호를 입력하세요: ", name);
        Scanner scan = new Scanner(System.in);
        String pw = scan.next();
        if (this.pw.equals(pw)) {
            System.out.print("새로 변경할 비밀번호를 입력해주세요.");
            this.pw = scan.next();
            System.out.printf("\"%s\"로 변경되었습니다.", this.pw);
        } else {
            System.out.println("현재 비밀번호를 잘못 입력했습니다.");
        }
    }
}
