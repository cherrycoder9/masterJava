package day06.step5;

public class Car {
    int speed = 0; // 속도변수 선언하고 0으로 초기화
    String color;
    String carNumber;

    public void increase() {
        speed++;
        System.out.println("속도 증가 : " + speed + "km/s");
    }

    public void decrease() {
        speed--;
        System.out.println("속도 감소 : " + speed + "km/s");
    }

    public void stop() {
        speed = 0;
        System.out.println("정지함 : " + speed + "km/s");
    }
}
