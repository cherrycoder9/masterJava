package day11.step1;

import java.util.ArrayList;
import java.util.Scanner;

public class Step1 {

    static ArrayList<제품> 제품 = new ArrayList<>();

    public static void main(String[] args) {
        // 자바 메모리 설계
        // 데이터베이스 설계 기반으로 자바 클래스를 구현 및 선언
        // day11 -> step1 클래스에
        // 선언한 클래스를 이용해 샘플코드 기반으로 객체 생성 (각 클래스별 객체 3개 이상 생성)
        // 동일한 타입의 객체들을 각 ArrayList 선언해서 저장 하고 출력
        Scanner scan = new Scanner(System.in);

        ArrayList<카테고리> 카테고리 = new ArrayList<>();
        카테고리 커피류 = new 카테고리(1, "커피류");
        카테고리.add(커피류);

        카테고리 스무디 = new 카테고리(2, "스무디");
        카테고리.add(스무디);

        카테고리 에이드 = new 카테고리(3, "에이드");
        카테고리.add(에이드);

        // System.out.println(스무디.toString());

        제품 아메리카노 = new 제품(1, "아메리카노", 2000, 1);
        제품.add(아메리카노);
        제품 딸기스무디 = new 제품(2, "딸기스무디", 3000, 2);
        제품.add(딸기스무디);
        제품 청포도에이드 = new 제품(3, "청포도에이드", 2000, 3);
        제품.add(청포도에이드);

        ArrayList<주문> 주문 = new ArrayList<>();
        주문 주문번호1 = new 주문(1, "06-20");
        주문.add(주문번호1);
        주문 주문번호2 = new 주문(2, "06-21");
        주문.add(주문번호2);
        주문 주문번호3 = new 주문(3, "06-21");
        주문.add(주문번호3);

        ArrayList<주문상세> 주문상세 = new ArrayList<>();
        주문상세 주문상세1 = new 주문상세(1, 1, 2, 1);
        주문상세.add(주문상세1);
        주문상세 주문상세2 = new 주문상세(2, 2, 3, 2);
        주문상세.add(주문상세2);
        주문상세 주문상세3 = new 주문상세(3, 3, 5, 3);
        주문상세.add(주문상세3);

        ArrayList<카트> 카트리스트 = new ArrayList<>();

        while (true) {
            System.out.println(" ===== ADMIN MENU ===== ");
            System.out.println("1.Category Add");
            System.out.println("2.Category List");
            System.out.println("3.Product Add");
            System.out.println("4.Product List");
            System.out.println("5.Cart Add");
            System.out.println("6.Cart List");
            System.out.println("7.Order Add");
            System.out.println("8.Order List");
            System.out.print("Menu choose : ");
            int ch = scan.nextInt();
            if (ch == 1) {
            } else if (ch == 2) {
            } else if (ch == 3) {
            } else if (ch == 4) {
            } else if (ch == 5) {
            } else if (ch == 6) {
            } else if (ch == 7) {
            } else if (ch == 8) {
            } else {
            }
        } // w end

    }
}
