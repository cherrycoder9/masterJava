package ConveniTest;

import java.util.ArrayList;

public class ConvenienceStore {
    // 멤버변수
    private final String name;
    private final ArrayList<Product> products;

    // 생성자
    public ConvenienceStore(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // 메서드
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " 제품이 추가되었습니다.");
    }

    public void viewProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void updateProductQuantity(String productName, int newQuantity) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("해당 상품명이 없습니다.");
    }

    public void findProduct(String productName) {

    }
}
