package day13.step3;

class 상위클래스 {
    // 필드
    protected int value1;

    // 생성자
    public 상위클래스() {
        value1 = 100;
    }

    // 메서드
    public void showSuperValue() {
        System.out.println("[상위]value1: " + value1);
    }
}

class 하위클래스 extends 상위클래스 {
    protected int value1;
    protected int value2;

    public 하위클래스() {
        super();
        value1 = 1000;
        value2 = 2000;
    }

    public void showSubValue() {
        // this: 매개변수와 멤버변수간의 이름이 동일할때
        // super: 상위 멤버변수와 하위 멤버변수간의 이름이 동일할때 식별하기 위해
        System.out.println("[하위]value1: " + value1);
        System.out.println("[하위]this.value1: " + this.value1);
        System.out.println("[하위]super.value1: " + super.value1);
        super.showSuperValue();
        showSuperValue();

    }
}

public class Step3 {
    public static void main(String[] args) {
        하위클래스 하위객체 = new 하위클래스();
        하위객체.showSuperValue();
        하위객체.showSubValue();
    }
}
