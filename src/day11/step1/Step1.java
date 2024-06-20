package day11.step1;

import java.util.ArrayList;
import java.util.Scanner;

public class Step1 {
    static ArrayList<카테고리> 카테고리 = new ArrayList<>();
    static ArrayList<제품> 제품 = new ArrayList<>();
    static ArrayList<주문상세> 주문상세 = new ArrayList<>();
    static ArrayList<카트> 카트리스트 = new ArrayList<>();

    public static void main(String[] args) {
        // 자바 메모리 설계
        // 데이터베이스 설계 기반으로 자바 클래스를 구현 및 선언
        // day11 -> step1 클래스에
        // 선언한 클래스를 이용해 샘플코드 기반으로 객체 생성 (각 클래스별 객체 3개 이상 생성)
        // 동일한 타입의 객체들을 각 ArrayList 선언해서 저장 하고 출력
        Scanner scan = new Scanner(System.in);

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

        /*주문 주문번호1 = new 주문(1, "06-20");
        주문.add(주문번호1);
        주문 주문번호2 = new 주문(2, "06-21");
        주문.add(주문번호2);
        주문 주문번호3 = new 주문(3, "06-21");
        주문.add(주문번호3);*/

        /*주문상세 주문상세1 = new 주문상세(1, 1, 2, 1);
        주문상세.add(주문상세1);
        주문상세 주문상세2 = new 주문상세(2, 2, 3, 2);
        주문상세.add(주문상세2);
        주문상세 주문상세3 = new 주문상세(3, 3, 5, 3);
        주문상세.add(주문상세3);*/


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
                // Category Add
                // 카테고리명을 입력받아 카테고리 목록에 등록
                // 카테고리명을 입력받는다
                System.out.print("카테고리명을 입력하세요: ");
                String category = scan.next();
                int code = 카테고리.get(카테고리.size() - 1).get카테고리코드() + 1;
                카테고리 카테고리명 = new 카테고리(code, category);
                // 카테고리 객체를 카테고리 리스트에 추가한다.
                카테고리.add(카테고리명);

            } else if (ch == 2) {
                // Category List
                // 카테고리 목록에서 모든 카테고리의 카테고리 코드와 카테고리명 출력
                System.out.println(" ==카테고리목록==");
                for (int i = 0; i < 카테고리.size(); i++) {
                    if (카테고리.get(i).get카테고리코드() != 0)
                        System.out.println(카테고리.get(i).get카테고리코드() + "     " + 카테고리.get(i).get카테고리명());
                }
                System.out.println(" ================");

            } else if (ch == 3) {
                // Product Add
                // 카테고리 번호, 제품명, 제품가격 입력받아 제품목록에 등록
                // 단, 없는 카테고리 번호 입력받으면 등록 불가능
                System.out.println("카테고리 코드를 입력하세요");
                int cateCode = scan.nextInt();
                System.out.println("제품명을 입력하세요");
                String name = scan.next();
                System.out.println("제품가격을 입력하세요");
                int price = scan.nextInt();
                제품 새제품 = new 제품(Step1.제품.get(Step1.제품.size() - 1).get제품코드() + 1, name, price, cateCode);
                if (새제품.get가격() != 0) {
                    제품.add(새제품);
                }
                // i가 0일때(제품목록인덱스) 제품목록의 제품코드가 1이면 출력
            } else if (ch == 4) {
                for (int i = 0; i < 카테고리.size(); i++) {
                    for (int j = 0; j < 제품.size(); j++) {
                        if (카테고리.get(i).get카테고리코드() == 제품.get(j).get카테고리코드()) {
                            System.out.println("제품명:" + 제품.get(j).get제품명() + " 가격:" + 제품.get(j).get가격() + " 제품코드" + 제품.get(j).get제품코드());
                        }
                    }
                }
            } else if (ch == 5) {
                // Cart Add
                // 제품번호와 주문수량 입력받아 카트목록에 등록 (단, 없는 제품번호 입력받으면 등록 불가능)
                System.out.println("제품 코드 입력 : ");
                int jc = scan.nextInt();
                System.out.println("주문 수량 입력 : ");
                int js = scan.nextInt();

                카트 c = new 카트(jc, js);

                if (c.get제품코드() != 0) {
                    카트리스트.add(c);
                }
            } else if (ch == 6) {
                // Cart List
                // 카트목록에 등록된 제품번호와 주문수량을 모두 출력
                for (int i = 0; i < 카트리스트.size(); i++) {
                    System.out.println("제품코드 : " + 카트리스트.get(i).get제품코드() + "\t주문수량 : " + 카트리스트.get(i).get주문수량());
                }
            } else if (ch == 7) {
                // Order Add
                // 주문날짜를 입력받아 카트목록에 등록된 모든 제품번호와
                // 주문수량을 활용해 주문 목록과 주문 상세 목록에 등록
                System.out.print("주문 날짜입력 ex)240530: ");
                String 주문날짜 = scan.next();
                // 주문객체(1개), 주문상세객체(카트리스트 길이만큼)
                // 주문 목록에 등록(주문코드, 주문날짜)
                주문 새로운주문 = new 주문(주문날짜);
                // 주문 상세 목록에 등록(주문상세코드,  제품코드, 수량, 주문코드)
                // 카트리스트를 순회하면서 주문목록과 주문 상세 목록에 등록한다.
                for (int i = 0; i < 카트리스트.size(); i++) {
                    int 제품코드 = 카트리스트.get(i).get제품코드();
                    int 수량 = 카트리스트.get(i).get주문수량();
                    주문상세 새로운주문상세 = new 주문상세(제품코드, 수량, 새로운주문.get주문코드());
                    주문상세.add(새로운주문상세);
                }
                카트리스트.clear();
            } else if (ch == 8) {
                System.out.println(카트리스트);
                // Order List
                // 주문목록별 구분해 주문상세의 제품명, 수량을 모두 출력
                System.out.printf("제품명\t\t 주문수량\n");
                String 제품명 = "";
                for (int i = 0; i < 주문상세.size(); i++) {
                    // 제품명을 찾기 위해 제품코드 입력받는다.
                    int 제품코드 = 주문상세.get(i).get제품코드();
                    int 주문수량 = 주문상세.get(i).get수량();
                    // 제품명을 찾는다
                    for (int j = 0; j < 제품.size(); j++) {
                        if (제품코드 == 제품.get(j).get제품코드()) {
                            제품명 = 제품.get(j).get제품명();
                            break;
                        }
                    }
                    System.out.printf("%s\t\t %d\n", 제품명, 주문수량);
                }
            } else {
                System.out.println("잘못 입력했습니다.");
            }
        } // w end

    }
}
