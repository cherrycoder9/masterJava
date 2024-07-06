package day16.view;

// MemberController와 MemberDto 클래스를 사용하기 위해 import
// InputMismatchException: 잘못된 유형의 입력이 들어왔을 때 발생하는 예외를 처리하기 위해 사용되는 클래스
// Scanner: 사용자 입력을 받기 위해 사용되는 클래스

import day16.controller.MemberController;
import day16.model.dto.MemberDto;

import java.util.InputMismatchException;
import java.util.Scanner;

// 회원 관련 사용자 인터페이스 클래스
public class MemberView {
    // 다른 클래스에서 호출 가능한 정적 MemberView 객체
    // 메소드를 실행하기 위해서는 객체 필요, static 메소드가 아닌 이상
    // 스태틱 선언시점: 프로그램 시작시, 스태틱 사라지는 시점: 프로그램 종료시
    // 객체 1개, n개여도 됨
    // 멤버변수는 객체 마다 할당, 메소드는 객체마다 실행되지만 코드는 공유됨
    // 모든곳에서 공유가능한 객체 1개 생성
    public static MemberView mView = new MemberView();

    // 사용자 입력을 위한 Scanner 객체
    Scanner scan = new Scanner(System.in);

    // 0. 초기 화면 표시 및 사용자 입력 처리 메서드
    public void index() {
        while (true) {
            // 초기 화면 메뉴 출력
            System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기: ");
            try {
                // 사용자 입력을 정수형으로 받음
                int ch = scan.nextInt();
                // 입력된 값에 따라 해당 메서드를 호출
                if (ch == 1) {
                    signup();
                } else if (ch == 2) {
                    login();
                } else if (ch == 3) {
                    findId();
                } else if (ch == 4) {
                    findPwd();
                } else {
                    // 잘못된 번호 입력 시 메시지 출력
                    System.out.println("없는 번호입니다.");
                }
            } catch (InputMismatchException e) {
                // 잘못된 입력 시 예외 처리
                System.out.println("잘못된 입력이 있습니다.");
                scan = new Scanner(System.in); // 스캐너를 다시 초기화
            } // while 종료
        } // while 종료
    } // index 함수 종료

    // 1. 회원가입 프로세스 처리 메서드
    public void signup() {
        // 사용자로부터 아이디 입력 받기
        System.out.print("아이디: ");
        String mid = scan.next();

        // 사용자로부터 비밀번호 입력 받기
        System.out.print("비밀번호: ");
        String mpwd = scan.next();

        // 사용자로부터 이름 입력 받기
        System.out.print("이름: ");
        String mname = scan.next();

        // 사용자로부터 연락처 입력 받기
        System.out.print("연락처: ");
        String mphone = scan.next();

        // 입력받은 정보를 MemberDto 객체로 생성
        MemberDto memberDto = new MemberDto(mid, mpwd, mname, mphone);

        // MemberController를 통해 회원가입 처리
        boolean result = MemberController.mControl.signup(memberDto);

        // 회원가입 결과 출력
        if (result) {
            System.out.println("회원가입 성공");
        }
    } // signup 함수 종료

    // 2. 로그인 처리 메서드
    public void login() {
        // 사용자로부터 아이디 입력 받기
        System.out.print("아이디: ");
        String mid = scan.next();

        // 사용자로부터 비밀번호 입력 받기
        System.out.print("비밀번호: ");
        String mpwd = scan.next();

        // 입력받은 아이디와 비밀번호를 MemberDto 객체에 설정
        MemberDto memberDto = new MemberDto();
        memberDto.setMid(mid);
        memberDto.setMpwd(mpwd);

        // MemberController를 통해 로그인 처리
        boolean result = MemberController.mControl.login(memberDto);

        // 로그인 결과 출력
        if (result) {
            System.out.println("로그인 성공");
            // 로그인 성공시 로그인된 메뉴로 이동
            BoardView.bView.index2();
        } else {
            System.out.println("로그인 실패");
        }
    } // login 함수 종료

    // 3. 아이디 찾기 처리 메서드
    public void findId() {
        // 사용자로부터 이름 입력 받기
        System.out.print("이름: ");
        String mname = scan.next();

        // 사용자로부터 연락처 입력 받기
        System.out.print("연락처: ");
        String mphone = scan.next();

        // 입력받은 이름과 연락처를 MemberDto 객체에 설정
        MemberDto memberDto = new MemberDto();
        memberDto.setMname(mname);
        memberDto.setMphone(mphone);

        // MemberController를 통해 아이디 찾기 처리
        String result = MemberController.mControl.findId(memberDto);

        // 아이디 찾기 결과 출력
        if (result != null) {
            System.out.println("아이디: " + result);
        } else {
            System.out.println("아이디를 찾지 못했습니다.");
        }
    } // findId 함수 종료

    // 4. 비밀번호 찾기 처리 메서드
    public void findPwd() {
        // 사용자로부터 아이디 입력 받기
        System.out.print("아이디: ");
        String mid = scan.next();

        // 사용자로부터 연락처 입력 받기
        System.out.print("연락처: ");
        String mphone = scan.next();

        // 입력받은 아이디와 연락처를 MemberDto 객체에 설정
        MemberDto memberDto = new MemberDto();
        memberDto.setMid(mid);
        memberDto.setMphone(mphone);

        // MemberController를 통해 비밀번호 찾기 처리
        String result = MemberController.mControl.findPwd(memberDto);

        // 비밀번호 찾기 결과 출력
        if (result != null) {
            System.out.println("비밀번호: " + result);
        } else {
            System.out.println("비밀번호를 찾지 못했습니다.");
        } // if 종료
    } // findPwd 함수 종료
} // index 함수 종료