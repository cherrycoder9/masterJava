package day14.step5;

interface Tire { // 2개 구현
    void roll(); // 2개 구현
}

class Car {
    Tire tire;

    public void run() {
        this.tire.roll();
    }
}

class HankookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("한국 타이어가 회전합니다.");
    }
}

class KumhoTire implements Tire {
    @Override
    public void roll() {
        System.out.println("금호 타이어가 회전합니다.");
    }
}

public class Step5 {
    public static void main(String[] args) {
        Car myCar = new Car();
        // myCar.run(); // 바퀴가 안달려서 못감
        Car yourCar = new Car();
        // yourCar.tire = new Tire(); // Tire는 인터페이스라 안됨
        // yourCar.run(); // 타이어가 안달려서 안됨

        // myCar.tire = Tire(); // 인터페이스라 안됨
        // myCar.run(); // 바퀴가 안달려서 못감

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
        // yourCar.run();

        System.out.println(myCar.tire instanceof KumhoTire);
        if (myCar.tire instanceof Tire) {
            myCar.tire = new HankookTire();
        }
        myCar.run();
    }
}
