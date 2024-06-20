package day11.step1;

public class 주문상세 {
    // 멤버변수
    private int 주문상세코드;
    private int 제품코드;
    private int 수량;
    private int 주문코드;

    // 생성자

    public 주문상세(int 주문상세코드, int 제품코드, int 수량, int 주문코드) {
        this.주문상세코드 = 주문상세코드;
        this.수량 = 수량;
    }


    // 메서드

    public int get주문상세코드() {
        return 주문상세코드;
    }

    public void set주문상세코드(int 주문상세코드) {
        this.주문상세코드 = 주문상세코드;
    }


    public int get수량() {
        return 수량;
    }

    public void set수량(int 수량) {
        this.수량 = 수량;
    }


}
