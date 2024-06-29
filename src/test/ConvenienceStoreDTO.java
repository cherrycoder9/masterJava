package test;

public class ConvenienceStoreDTO {
    private String name;
    private int cleanliness;
    private int friendliness;
    private int price;
    private int area;

    public ConvenienceStoreDTO(String name, int cleanliness, int friendliness, int price, int area) {
        if (cleanliness < 0 || cleanliness > 100) {
            throw new IllegalArgumentException("청결도는 0과 100 사이여야 합니다.");
        }
        if (friendliness < 0 || friendliness > 100) {
            throw new IllegalArgumentException("친절도는 0과 100 사이여야 합니다.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }
        if (area < 0) {
            throw new IllegalArgumentException("면적은 0 이상이어야 합니다.");
        }

        this.name = name;
        this.cleanliness = cleanliness;
        this.friendliness = friendliness;
        this.price = price;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public int getFriendliness() {
        return friendliness;
    }

    public int getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "ConvenienceStoreDTO{" +
                "name='" + getName() + '\'' +
                ", cleanliness=" + getCleanliness() +
                ", friendliness=" + getFriendliness() +
                ", price=" + getPrice() +
                ", area=" + getArea() +
                '}';
    }
}
