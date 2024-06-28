package day16.view;

import day16.controller.MemberController;
import day16.model.dto.MemberDto;

import java.util.Scanner;


public class BoardView {
    // 0.
    public static BoardView bView = new BoardView();
    public Scanner scanner = new Scanner(System.in);

    // 0. 로그인 성공시 초기화면
    public void index2() {
        while (true) {
            System.out.print(">> 1.로그아웃 2.회원수정 3.회원탈퇴 4.게시판: ");
            int ch = scanner.nextInt();
            if (ch == 1) {
                logout();
                return;
            } else if (ch == 2) {
                mUpdate();
            } else if (ch == 3) {
                if (mDelete()) {
                    logout();
                    return;
                }
            } else if (ch == 4) {
                bprint();
            } else {

            } // if end
        } // while end
    } // main end


    // 1. 로그아웃 함수
    public void logout() {
        // 회원 컨트롤러에 로그아웃 메소드 호출
        MemberController.mControl.logout();
        System.out.println(">> 로그아웃 성공 (초기메뉴로)");
    }

    // 2. 회원수정 함수
    // 로그인된 회원이름과 회원연락처를 수정 구현
    public boolean mUpdate() {
        System.out.println("새로운 이름을 입력해주세요.");
        System.out.print("새이름: ");
        String newMname = scanner.next();
        System.out.println("새로운 연락처를 입력해주세요.");
        System.out.print("새 연락처: ");
        String newMphone = scanner.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setMname(newMname);
        memberDto.setMphone(newMphone);
        boolean result = MemberController.mControl.mUpdate(memberDto);
        if (result) {
            System.out.println("변경완료");
            return true;
        } else {
            System.out.println("변경실패");
            return false;
        }
    }

    // 3. 회원탈퇴 함수
    public boolean mDelete() {
        System.out.println("정말 탈퇴할까요?");
        System.out.print("확인 비밀번호: ");
        String confirmPwd = scanner.next();

        boolean result = MemberController.mControl.mDelete(confirmPwd);
        if (result) {
            System.out.println("탈퇴 성공");
            return true;
        }
        return false;
    }

    // 4. 게시판(게시물전체출력) 함수
    public void bprint() {

    }
} // class end