package day12.step2;

public class Car {
    // 1. 멤버변수
    public int speed;

    // 2. 생성자
    public void speedUp() {
        this.speed++;
    }

    public void stop() {
        this.speed = 0;
    }
    // 3. 메소드
}

class SportCar extends Car {
    public int power;
    // 상속 이유
    // 빠른 개발 : 기존에 있던 설계도/클래스를 물려받아서 커스텀해서 새로운 설계도/클래스 제작
    //
}