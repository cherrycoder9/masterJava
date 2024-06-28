package day11.step1;

public class 카트 {
    // 멤버변수
    private int 제품코드;
    private int 주문수량;

    // 생성자
    public 카트(int 제품코드, int 주문수량) {
        boolean found = false;
        // 제품 코드 검색한다
        for (int i = 0; i < Step1.제품.size(); i++) {
            if (제품코드 == Step1.제품.get(i).get제품코드()) {
                this.제품코드 = 제품코드;
                this.주문수량 = 주문수량;
                // 제품코드가 있다
                found = true;
            }
        }
        // 찾지 못했으면
        if (found == false) {
            System.out.println("없는 제품코드 입니다.");
        }
    }

    // 메서드


    public int get제품코드() {
        return 제품코드;
    }

    public void set제품코드(int 제품코드) {
        this.제품코드 = 제품코드;
    }

    public int get주문수량() {
        return 주문수량;
    }

    public void set주문수량(int 주문수량) {
        this.주문수량 = 주문수량;
    }

    @Override
    public String toString() {
        return "카트{" +
                "제품코드=" + 제품코드 +
                ", 주문수량=" + 주문수량 +
                '}';
    }
}
