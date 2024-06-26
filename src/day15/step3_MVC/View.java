package day15.step3_MVC;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    // 외부 클래스로부터 내부 메소드를 사용할 수 있도록 만든 스태틱 멤버변수
    static View view = new View();
    // 입력객체
    Scanner scan = new Scanner(System.in);

    // 1. 메인페이지 함수
    public void mainView() {
        System.out.println("=== 메인화면 ==="); // 메인함수 아님
        while (true) {
            try {
                System.out.print("1.등록 2.출력 3.수정 4.삭제: ");
                int ch = scan.nextInt(); // 사용자로부터 메뉴 선택 입력 받기
                if (ch == 1) {
                    signupView();
                } else if (ch == 2) {
                    printView();
                } else if (ch == 3) {
                    updateView();
                } else if (ch == 4) {
                    deleteView();
                } else {
                    System.out.println("없는 기능 번호입니다."); // 잘못된 메뉴 선택 시 메시지 출력
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력" + e); // 입력 형식이 잘못된 경우 예외 처리
                // 잘못 입력된 값을 가지고 있는 객체를 초기화
                scan = new Scanner(System.in);
            } // catch end
        } // while end
    } // main end

    // 2. 등록 페이지 함수
    public void signupView() {
        System.out.println(">> 등록페이지 <<");
        String name = scan.next(); // 사용자로부터 이름 입력 받기
        boolean result = Controller.controller.signupC(name);
        if (result) {
            System.out.println(">> 등록 성공");
        } else {
            System.out.println(">> 등록 실패");
        }
    }

    // 3. 출력 페이지 함수
    public void printView() {
        System.out.println(">> 출력페이지 <<");
        ArrayList<String> result = Controller.controller.printC();
    }

    // 4. 수정 페이지 함수
    public void updateView() {
        System.out.println(">> 수정페이지 <<");
        System.out.print(">>[수정U] 기존이름: ");
        String oldName = scan.next(); // 수정할 기존 이름 입력 받기
        System.out.print(">>[수정U] 새로운이름: ");
        String newName = scan.next(); // 새로운 이름 입력 받기
        boolean result = Controller.controller.updateC(oldName, newName);
        if (result) {
            System.out.println(">> 수정 성공");
        } else {
            System.out.println(">> 수정 실패");
        }
    }

    // 5. 삭제 페이지 함수
    public void deleteView() {
        System.out.println(">> 삭제페이지 <<");
        String name = scan.next(); // 삭제할 이름 입력 받기
        boolean result = Controller.controller.deleteC(name);
        if (result) {
            System.out.println(">> 삭제 성공");
        } else {
            System.out.println(">> 삭제 실패");
        }
    }
} // class end
