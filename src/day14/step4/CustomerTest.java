package day14.step4;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        // 자동 타입 변환
        Buy buyer = customer;
        buyer.buy(); // 구매하기
        buyer.order(); // 고객 판매 주문
        // 자동 타입 변환
        Sell seller = customer;
        seller.sell(); // 판매하기
        seller.order(); // 고객 판매 주문

        if (seller instanceof Customer) {
            Customer customer2 = (Customer) seller;
            customer2.buy(); // 구매하기
            customer2.sell(); // 판매하기
            customer2.order(); // 고객 판매 주문
        }
        customer.order(); // 고객 판매 주문
    }
}
