// 메소드 영역: 인터페이스 정보 저장
package day14.step3;

public interface StepInterface {
    // 메소드 영역: static final 상수
    public static final int value = 10;
    int value2 = 20; // 인터페이스 안에서는 변수 생성시 무조건 상수

    // 메소드 영역: static 메소드
    static void method5(int a) {
        System.out.println("StepInterface.method5");
    }

    static int method6(String a) {
        System.out.println("StepInterface.method6");
        return 3;
    }

    // 메소드 영역: private static 메소드
    private static void method9(int a) {
        System.out.println("StepInterface.method9");
    }

    private static int method10(String a) {
        System.out.println("StepInterface.method10");
        return 3;
    }

    // 메소드 영역: 추상메소드 선언
    abstract void method1(int a);

    int method2(String a);

    // 메소드 영역: 디폴트메소드
    default void method3(int a) {
        System.out.println("StepInterface.method2");
    }

    default int method4(String a) {
        System.out.println("StepInterface.method3");
        return 3;
    }

    // 메소드 영역: private 메소드
    private void method7(int a) {
        System.out.println("StepInterface.method7");
    }

    private int method8(String a) {
        System.out.println("StepInterface.method8");
        return 3;
    }
}