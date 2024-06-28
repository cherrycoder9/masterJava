package day10.step1;

public class Taxi {
    // 필드
    private static int taxiNum = 1000;
    private int income;

    // 생성자
    public Taxi() {

    }

    // 메서드
    public void take(int income) {
        this.income += income;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "income=" + income +
                '}';
    }
}
