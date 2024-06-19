package day10.step1;

public class Person {
    // 필드
    private int money;
    private boolean canMove;

    // 생성자
    public Person(int money, boolean canMove) {
        this.money = money;
        this.canMove = canMove;
    }

    // 메서드
    public void takeTaxi(Taxi taxi) {
        if (canMove) {
            System.out.println("택시에 탑승했습니다.");
            taxi.take(2000);
            this.money -= 2000;
        } else {
            System.out.println("택시에 탑승할 수 없는 상태입니다.");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "money=" + money +
                '}';
    }
}
