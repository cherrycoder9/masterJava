// 메소드 영역: 클래스 정보 저장
package day14.step3;

public class ImplementClass implements StepInterface {
    // 메소드 영역: 오버라이드된 메소드
    @Override
    public void method1(int a) {
        System.out.println("ImplementClass.method1");
    }

    @Override
    public int method2(String a) {
        System.out.println("ImplementClass.method2");
        return 5;
    }
}