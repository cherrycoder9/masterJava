package day10.step1;

import java.util.ArrayList;
import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        // * 입력 객체
        Scanner scan = new Scanner(System.in);

        // 1. 배열 구성
        ArrayList<Product> productList = new ArrayList<>();

        // 2. 무한루프
        while (true) {
            System.out.println("리스트 상태확인: " + productList);
            System.out.println("1.등록 2.출력 3.수정 4.삭제 5.종료");
            System.out.print("선택: ");
            int ch = scan.nextInt(); // 선택받은 데이터로 메뉴를 선택
            if (ch == 1) {
                // 1. 입력받고
                System.out.print(">> 제품코드: ");
                String code = scan.next();
                System.out.print(">> 제품명: ");
                String name = scan.next();
                System.out.print(">> 제품가격: ");
                int price = scan.nextInt();

                // 2. 가공 (유효성검사 혹은 객체화)
                Product p = new Product(code, name, price);

                // 3. 배열에 저장, JS처럼 push 함수 없음, 직접 찾아서 대입
                productList.add(p);
            } else if (ch == 2) {

            } else if (ch == 3) {

            } else if (ch == 4) {
                // 1. 삭제할 제품코드 입력받기
                System.out.print(">> 삭제할 제품코드: ");
                String deleteCode = scan.next();

                // 2. 삭제할 제품코드를 찾는다.
                for (int i = 0; i < productList.size(); i++) {
                    // i번째 제품의 코드가 입력받은 코드와 같으면
                    if (productList.get(i).getCode().equals(deleteCode)) {
                        productList.remove(i);
                        break;
                    }
                }
            } else if (ch == 5) {

            } // if end

        } // while end


        // 제품 CRUD 객체와 가변길이 배열 버전
        // [메모리 설계]
        // 1. 객체의 추상적인 구성(특성, 행위)을 클래스로 구현해서 선언
        // 2. 구성한 개념을 클래스로 구현하기
        // 3. 해당 클래스 타입의 객체를 여러개 저장하기 위해 배열 선정
        // - 배열 선언방법 : 타입[] 배열변수명 = new 타입[길이];
        // [화면 구현 설계]
        // 1. 콘솔에 출력할 내용들을 구성
        // 2.
    }
}
