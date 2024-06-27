package day16.view;

import day16.controller.MemberController;
import day16.model.dto.MemberDto;

import java.util.InputMismatchException;
import java.util.Scanner;

// 회원 관련 사용자 인터페이스 클래스
public class MemberView {
    // 다른 클래스에서 호출 가능한 정적 MemberView 객체
    public static MemberView mView = new MemberView();

    // 사용자 입력을 위한 Scanner 객체
    Scanner scan = new Scanner(System.in);

    // 초기 화면 표시 및 사용자 입력 처리 메서드
    public void index() {
        while (true) {
            System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기: ");
            try {
                int ch = scan.nextInt();
                if (ch == 1) {
                    signup();
                } else if (ch == 2) {
                    login();
                } else if (ch == 3) {
                    findId();
                } else if (ch == 4) {
                    findPwd();
                } else {
                    System.out.println("없는 번호입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력이 있습니다.");
                scan = new Scanner(System.in);
            }
        }
    }

    // 회원가입 프로세스 처리 메서드
    public void signup() {
        System.out.print("아이디: ");
        String mid = scan.next();
        System.out.print("비밀번호: ");
        String mpwd = scan.next();
        System.out.print("이름: ");
        String mname = scan.next();
        System.out.print("연락처: ");
        String mphone = scan.next();

        MemberDto memberDto = new MemberDto(mid, mpwd, mname, mphone);

        boolean result = MemberController.mControl.signup(memberDto);
        if (result) {
            System.out.println("회원가입 성공");
        }
    }

    // 로그인 처리 메서드
    public void login() {
        // 미구현 상태
    }

    // 아이디 찾기 처리 메서드
    public void findId() {
        // 미구현 상태
    }

    // 비밀번호 찾기 처리 메서드
    public void findPwd() {
        // 미구현 상태
    }
}