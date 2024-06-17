package day08.step1;

public class 제품 {
    // 1. 멤버변수
    private int 제품번호;
    private String 제품명;

    // 2. 생성자


    // 3. 메서드/함수
    void 구매함수() {
        System.out.println("제품 구매 완료");
    }

    // int, void 등등 반환타입
    int 환불함수(String 제품명) {
        //매개변수란, 함수 내에서 사용할 변수
        //반환타입이란, 함수 내에서 결과를 호출했던 곳으로 전달할 자료형
        return 3;
    }

    public int get제품번호() {
        return 제품번호;
    }

    public void set제품번호(int 제품번호) {
        this.제품번호 = 제품번호;
    }

    public String get제품명() {
        return 제품명;
    }

    public void set제품명(String 제품명) {
        this.제품명 = 제품명;
    }
}
