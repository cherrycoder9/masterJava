package day12.step2;

public class Step2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp(); // 함수 호출
        car.speedUp();
        System.out.println("car speed: " + car.speed);

        SportCar sportCar = new SportCar();
        sportCar.speedUp();
        System.out.println("sportCar speed: " + sportCar.speed);
        System.out.println("sportCar power: " + sportCar.power);

        Car car2 = new Car();
        car2.speedUp();
        System.out.println("car2 speed: " + car2.speed);
    }
}
