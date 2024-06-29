package ConveniTest;

public class Main {
    public static void main(String[] args) {
        Product mychew = new Product("마이츄", 2, 1400);
        ConvenienceStore gs25 = new ConvenienceStore("happy");
        gs25.addProduct(mychew);
        gs25.viewProduct();
        gs25.updateProductQuantity("마이츄", 9);
        gs25.viewProduct();

        while (true) {
            // 메뉴 출력
            System.out.println("1. 제품 추가");
            System.out.println("2. 재고 조회");
            System.out.println("3. 재고 업데이트");
            System.out.println("4. 종료");
            System.out.print("선택: ");
        }
    }
}
