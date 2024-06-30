package ConveniReview;

public class Review {
    // 멤버 변수
    protected String customerName;
    protected int rating;
    protected String comment;

    // 생성자
    public Review(String customerName, int rating, String comment) {
        this.customerName = customerName;
        this.rating = rating;
        this.comment = comment;
    }

    // 메서드
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // toString
    @Override
    public String toString() {
        return "Review{" +
                "customerName='" + customerName + '\'' +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
