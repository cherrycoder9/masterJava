package day13.step5;

class Car {
    Tire tire;

    public void run() {
        this.tire.roll();
    }
}

class Tire {
    public void roll() {
        System.out.println("일반타이어가 회전합니다.");
    }
}

class HankookTire extends Tire {
    @Override
    public void roll() {
        System.out.println("한국타이어가 회전합니다.");
    }
}

class KumhoTire extends Tire {
    @Override
    public void roll() {
        System.out.println("금호타이어가 회전합니다.");
    }
}


public class Step5 {
    public static void main(String[] args) {
        Car myCar = new Car();
        // myCar.run();
        Car yourCar = new Car();
        yourCar.tire = new Tire();
        yourCar.run(); // 일반 타이어가 회전합니다.

        myCar.tire = new Tire();
        myCar.run(); // 일반 타이어가 회전합니다.

        myCar.tire = new KumhoTire();
        myCar.run(); // 금호 타이어가 회전합니다.
        yourCar.run(); // 일반 타이어가 회전합니다.

        System.out.println(myCar.tire instanceof KumhoTire); // true
        if (myCar.tire instanceof Tire) {
            myCar.tire = new HankookTire();
        }
        myCar.run(); // 한국 타이어가 회전합니다.
    }
}
