package day15.step2;

public class Step2 {
    public static void main(String[] args) {
        // 1. static 메소드 호출하는 방법
        try {
            method1();
        } catch (ClassNotFoundException e) {
            System.out.println("함수에서 클래스네임 예외발생");
        }
        // static 함수가 아니라서??
        // main 함수가 static 이므로 우선할당 되어서 실행되는데
        // 그때 method1 메소드 메소드를 부른다.
        // main이 스태틱이 아니면 상관없음

        // 2. 스태틱 메소드가 아닌 메소드를 호출하는 방법
        // Step2 step2 = new Step2(); // 힙영역에 주소를 지역변수에 저장하고
        // step2.method1(); // 지역변수에 있는 힙영역에 접근해서 메소드 호출

        // 3. new Step2().method1(); // 지역변수가 없이 바로 힙영역으로부터 메소드 호출

    }

    static void method1() throws ClassNotFoundException {
        // 해당 함수를 호출했던 곳으로) 던지기/떠넘기기
        Class.forName("java.lang.String");
        Class.forName("java.lang.String2");
        // 1. 직접처리: try-catch
        // 2. 떠넘기기: throws
    }
}
