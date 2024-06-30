package ConveniReview;

import java.util.ArrayList;

public class ConvenienceStore {
    // 멤버 변수
    protected String name;
    protected ArrayList<Review> reviews;

    // 생성자
    public ConvenienceStore(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    // 메서드
    public void addReview(Review review) {
        // 리뷰를 목록에 추가
        reviews.add(review);
    }

    public void viewReviews() {
        // 모든 리뷰를 출력
        for (Review review : reviews) {
            System.out.println(review.getComment());
        }
    }

    public double calculateAverageRating() {
        // 리뷰의 평균 평점을 계산해 반환
        int sum = 0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return ((double) sum / reviews.size());
    }

}
