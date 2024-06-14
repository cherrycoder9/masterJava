package 과제.level4;

import java.time.LocalDate;

/*
    주제 : '제품' 을 설계하고 만들기
    [ 클래스 생성 ]
    멤버변수/필드 : 제품코드 , 제품명 , 가격 , 등록일
    - 위 필드을 적절한 자료형을 선택하여 설계하시오.
    [ 객체 생성 ]
    임의의 데이터를 입력하여 2개의 객체를 생성하고 출력하는 코드를 작성하시오.
*/
public class Product {
    // 멤버변수
    private static int cnt;
    private int num;
    private String name;
    private int price;
    private String regDate;

    // 생성자
    Product() {
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
        cnt++;
        num = cnt;
        LocalDate today = LocalDate.now();
        regDate = today.toString();
    }

    // 메소드
    public void printProductInfo() {
        System.out.println("제품명: " + name);
        System.out.println("제품코드: " + num);
        System.out.println("가격: " + price);
        System.out.println("등록일: " + regDate);
    }

}
