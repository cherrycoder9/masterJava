package day10.step1;

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        // * 입력 객체
        Scanner scan = new Scanner(System.in);

        // 1. 배열 구성
        int count = 0;
        Product[] productArray = new Product[count];

        // 2. 무한루프
        while (true) {
            System.out.println("배열상태 확인함수: " + Arrays.toString(productArray));
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
                // 제품 총개수 증가
                count++;
                // 새로운 배열 생성
                Product[] newProductArray = new Product[count];
                // 기존 배열 내 값을 새로운 배열로 이동/복사
                for (int i = 0; i < productArray.length; i++) {
                    newProductArray[i] = productArray[i];
                }
                // 새로운 배열내 추가된 마지막 인덱스의 저장할 제품 객체를 등록
                newProductArray[newProductArray.length - 1] = p;
                // 새로운 배열을 기존 배열에 대입
                productArray = newProductArray;
            } else if (ch == 2) {

            } else if (ch == 3) {

            } else if (ch == 4) {
                // 1. 삭제할 제품코드 입력받기
                System.out.print(">> 삭제할 제품코드: ");
                String deleteCode = scan.next();

                // 2. 삭제할 제품코드를 찾는다.
                for (int i = 0; i < productArray.length; i++) {
                    // i번째 제품의 코드가 입력받은 코드와 같으면
                    if (productArray[i].getCode().equals(deleteCode)) {
                        // 삭제할 인덱스 뒤로 한칸씩 당기기
                        for (int j = i; j < productArray.length - 1; j++) {
                            productArray[j] = productArray[j + 1];
                        }
                    }
                }
                // 마지막 인덱스를 제외한 배열 복사
                // 1개가 차감된 새로운 배열 생성
                count--; // 제품 총 개수 1 차감
                Product[] newProductArray = new Product[count];
                // 기존 배열내 마지막 인덱스를 빼고 새로운 배열에 복사
                for (int i = 0; i < newProductArray.length; i++) {
                    newProductArray[i] = productArray[i];
                }
                productArray = newProductArray;
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
