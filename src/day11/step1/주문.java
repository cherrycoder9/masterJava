package day11.step1;

public class 주문 {
    // 멤머변수
    private int 주문코드;
    private String 주문날짜;

    // 생성자

    public 주문(int 주문코드, String 주문날짜) {
        this.주문코드 = 주문코드;
        this.주문날짜 = 주문날짜;
    }

    // 메서드
    public int get주문코드() {
        return 주문코드;
    }

    public void set주문코드(int 주문코드) {
        this.주문코드 = 주문코드;
    }

    public String get주문날짜() {
        return 주문날짜;
    }

    public void set주문날짜(String 주문날짜) {
        this.주문날짜 = 주문날짜;
    }
}
