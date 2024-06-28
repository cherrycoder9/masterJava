// 메소드 영역: 클래스 정보 저장
package day14.step3;

public class Step3 {
    // 메소드 영역: main 메소드 바이트코드 저장
    public static void main(String[] args) {
        // 스택 영역: 지역 변수 si 선언
        StepInterface si;

        // 힙 영역: ImplementClass 객체 생성
        new ImplementClass();
        // 스택 영역: si에 객체 참조 저장
        si = new ImplementClass();

        // 스택 영역: 메소드 호출 시 스택 프레임 생성
        si.method1(3);
        si.method2("3");
        si.method3(3);
        si.method4("3");

        // 메소드 영역의 static 메소드 호출
        StepInterface.method5(5);
        StepInterface.method6("5");

        // private 메소드는 외부에서 접근 불가
        // si.method7(3);
        // si.method8("hi");
        // si.method9(3);
        // si.method10("3");
    }
}