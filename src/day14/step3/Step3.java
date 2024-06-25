package day14.step3;

public class Step3 {
    public static void main(String[] args) {
        // 인터페이스 타입의 변수 선언
        StepInterface si;
        // 인터페이스는 스스로 객체를 생성 불가능
        // 구현 안한 메소드가 있으니까 --> 추상메소드
        // 구현을 해줄 클래스가 필요하다ㅏ
        // implements 한 클래스로 객체 생성한다 --> 구현(객)체
        new ImplementClass(); // (인스턴스 구현된 클래스의) 객체
        si = new ImplementClass();
        si.method1(3);
        si.method2("3");
        si.method3(3);
        si.method4("3");
        // si.method5(5); // static 객체 없이 사용하는 멤버들
        // si.method6("3"); // static 객체 없이 사용하는 멤버들
        StepInterface.method5(5);
        StepInterface.method6("5");
        // 인터페이스 안에서 내부적으로 사용할때 private 사용해야함
        // si.method7(3); // private이므로 외부에서 사용 불가능
        // si.method8("hi"); // private이므로 외부에서 사용 불가능
        // si.method9(3); // private
        // si.method10("3"); // private
    }
}
