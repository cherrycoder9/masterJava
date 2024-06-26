package day15.step3_MVC;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    // 정적 필드로 View 인스턴스를 생성
    static View view = new View();
    // 사용자 입력을 받기 위한 Scanner 객체
    Scanner scan = new Scanner(System.in);

    // 메인 메뉴를 표시하고 사용자 입력을 처리하는 메서드
    public void mainView() {
        System.out.println("=== 메인화면 ===");
        while (true) {
            try {
                System.out.print("1.등록 2.출력 3.수정 4.삭제: ");
                int ch = scan.nextInt();
                if (ch == 1) {
                    signupView();
                } else if (ch == 2) {
                    printView();
                } else if (ch == 3) {
                    updateView();
                } else if (ch == 4) {
                    deleteView();
                } else {
                    System.out.println("없는 기능 번호입니다.");
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력: " + e);
                scan = new Scanner(System.in);
            }
        }
    }

    // 회원 등록 화면을 처리하는 메서드
    public void signupView() {
        System.out.println(">> 등록페이지 <<");
        String name = scan.next();
        boolean result = Controller.controller.signupC(name);
        if (result) {
            System.out.println(">> 등록 성공");
        } else {
            System.out.println(">> 등록 실패");
        }
    }

    // 회원 목록 출력 화면을 처리하는 메서드
    public void printView() {
        System.out.println(">> 출력페이지 <<");
        ArrayList<String> result = Controller.controller.printC();
        System.out.println("===== 이름 명단 =====");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        if (result != null) {
            for (String name : result) {
                System.out.println(name);
            }
        } else {
            System.out.println(">> 출력 실패");
        }
    }

    // 회원 정보 수정 화면을 처리하는 메서드
    public void updateView() {
        System.out.println(">> 수정페이지 <<");
        System.out.print(">>[수정U] 기존이름: ");
        String oldName = scan.next();
        System.out.print(">>[수정U] 새로운이름: ");
        String newName = scan.next();
        boolean result = Controller.controller.updateC(oldName, newName);
        if (result) {
            System.out.println(">> 수정 성공");
        } else {
            System.out.println(">> 수정 실패");
        }
    }

    // 회원 삭제 화면을 처리하는 메서드
    public void deleteView() {
        System.out.println(">> 삭제페이지 <<");
        String name = scan.next();
        boolean result = Controller.controller.deleteC(name);
        if (result) {
            System.out.println(">> 삭제 성공");
        } else {
            System.out.println(">> 삭제 실패");
        }
    }
}