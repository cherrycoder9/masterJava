package day16.view;

// MemberController와 MemberDto 클래스를 사용하기 위해 import
// Scanner: 사용자 입력을 받기 위해 사용되는 클래스

import day16.controller.BoardController;
import day16.controller.MemberController;
import day16.model.dto.BoardDto;
import day16.model.dto.MemberDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // 정적 BoardView 인스턴스 생성
    public static BoardView bView = new BoardView();
    // 사용자 입력을 위한 Scanner 객체
    public Scanner scanner = new Scanner(System.in);

    // 0. 로그인 성공 시 초기화면을 표시하는 메서드
    public void index2() {
        while (true) {
            // 메뉴 출력
            System.out.print(">> 1.로그아웃 2.회원수정 3.회원탈퇴 4.게시판: ");

            // 사용자 입력 받기
            int ch = scanner.nextInt();

            // 사용자 입력에 따른 처리
            if (ch == 1) {
                // 로그아웃 처리
                logout();
                return;
            } else if (ch == 2) {
                // 회원수정 처리
                mUpdate();
            } else if (ch == 3) {
                // 회원탈퇴 처리
                if (mDelete()) {
                    // 탈퇴 성공 시 로그아웃 처리
                    logout();
                    return; // 로그아웃 후 메서드 종료
                }
            } else if (ch == 4) {
                // 게시판 출력
                bprint();
            } else {
                // 잘못된 입력 처리
                System.out.println("잘못 입력했습니다.");
            } // if end
        } // while end
    } // index2 end


    // 1. 로그아웃 함수
    public void logout() {
        // 회원 컨트롤러에 로그아웃 메소드 호출
        MemberController.mControl.logout();

        // 로그아웃 성공 메시지 출력
        System.out.println(">> 로그아웃 성공 (초기메뉴로)");

    } // logout 함수 종료

    // 2. 회원수정 함수
    // 로그인된 회원의 이름과 연락처를 수정하는 기능 구현
    public boolean mUpdate() {
        // 사용자에게 새로운 이름 입력 요청
        System.out.println("새로운 이름을 입력해주세요.");
        System.out.print("새이름: ");
        String newMname = scanner.next();

        // 사용자에게 새로운 연락처 입력 요청
        System.out.println("새로운 연락처를 입력해주세요.");
        System.out.print("새 연락처: ");
        String newMphone = scanner.next();

        // 입력받은 새로운 이름과 연락처를 MemberDto 객체에 설정
        MemberDto memberDto = new MemberDto();
        memberDto.setMname(newMname);
        memberDto.setMphone(newMphone);

        // MemberController를 통해 회원정보 수정 처리
        boolean result = MemberController.mControl.mUpdate(memberDto);

        // 수정 결과 출력 및 반환
        if (result) {
            System.out.println("변경완료");
            return true; // 변경 성공
        } else {
            System.out.println("변경실패");
            return false; // 변경 실패
        }
    } // mUpdate 함수 종료

    // 3. 회원탈퇴 함수
    public boolean mDelete() {
        // 사용자에게 탈퇴 확인 메시지 출력
        System.out.println("정말 탈퇴할까요?");

        // 사용자에게 확인 비밀번호 입력 요청
        System.out.print("확인 비밀번호: ");
        String confirmPwd = scanner.next();

        // MemberController를 통해 회원탈퇴 처리
        boolean result = MemberController.mControl.mDelete(confirmPwd);

        // 탈퇴 결과 출력 및 반환
        if (result) {
            System.out.println("탈퇴 성공");
            return true; // 탈퇴 성공 시 true 반환
        } // if 종료
        return false; // 탈퇴 실패 시 false 반환
    } // mDelete 함수 종료

    // 4. 게시판(게시물전체출력) 함수
    public void bprint() {
        // 컨트롤에게 전체 게시물 조회 요청
        ArrayList<BoardDto> result = BoardController.getInstance().bPrint();
        System.out.println("번호\t조회수\t\t작성일\t\t\t제목");
        // 리스트객체명.forEach(반복변수 -> {실행문;}); // 리스트내 전체 dto를 하나씩 반복변수에 대입 반복
        result.forEach(boardDto -> {
            System.out.printf("%2d\t%2d\t\t%10s\t%s \n", boardDto.getBno(), boardDto.getBview(), boardDto.getBdate(), boardDto.getBtitle());
        });
        System.out.println("0:글쓰기 1~:개별글조회");
        
        int ch = scanner.nextInt();
        if (ch == 0) {
            bWrite();
        } else if (ch >= 1) {
            bView(ch);
        }
    }

    // 5. 게시물 쓰기 함수
    public void bWrite() {

    }

    // 6. 게시물 개별조회 함수
    public void bView(int bno) {
        System.out.println("게시물 번호를 입력하세요");
        BoardDto result = BoardController.getInstance().bView(bno);
        if (result == null) {
            System.out.println("존재하지 않는 게시물입니다.");
            return;
        }
        System.out.println("제목: " + result.getBtitle());
        System.out.print("작성자: " + result.getMno());
        System.out.println("\t조회수: " + result.getBview());
        System.out.println("작성일: " + result.getBdate());
        System.out.println("내용: " + result.getBcontent());
    }

    // 7. 게시물 삭제 함수


    // 8. 게시물 수정 함수


} // class end