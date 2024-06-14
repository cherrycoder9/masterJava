package 과제.level4;

public class Step4 {
    public static void main(String[] args) {
        /*
        주제 : '제품' 을 설계하고 만들기
        [ 클래스 생성 ]
        멤버변수/필드 : 제품코드 , 제품명 , 가격 , 등록일
        - 위 필드을 적절한 자료형을 선택하여 설계하시오.
	    [ 객체 생성 ]
        임의의 데이터를 입력하여 2개의 객체를 생성하고 출력하는 코드를 작성하시오.
        */
        Product book1 = new Product("죽을 때까지 코딩하며 사는 법", 16000);
        Product book2 = new Product("하루 5분 UX", 30000);
        book1.printProductInfo();
        book2.printProductInfo();
    }
}
