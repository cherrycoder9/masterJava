package ConveniReview;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvenienceStore store;
        store = new ConvenienceStore("GS25");
        while (true) {
            System.out.println("=== 메뉴 ===");
            System.out.println("1. 리뷰 추가");
            System.out.println("2. 리뷰 조회");
            System.out.println("3. 평균 평점");
            System.out.print("번호 입력: ");
            switch (scanner.nextInt()) {
                case 1 -> {
                    // 리뷰 추가 메뉴
                    scanner.nextLine();
                    System.out.print("고객이름: ");
                    String name = scanner.nextLine();
                    System.out.print("평점(1~5점): ");
                    int rating = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("코멘트: ");
                    String comment = scanner.nextLine();
                    store.addReview(new Review(name, rating, comment));
                }
                case 2 -> {
                    // 리뷰 조회 메뉴
                    store.viewReviews();
                }
                case 3 -> {
                    // 평균 평점 메뉴
                    double rating = store.calculateAverageRating();
                    System.out.printf("평점: %.2f\n", rating);
                }
                default -> {
                    System.out.println("잘못 입력했습니다.");
                }
            } // switch 종료
        } // while 종료
    } // main 함수 종료
} // Main 클래스 종료
