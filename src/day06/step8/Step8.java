package day06.step8;

public class Step8 {
    public static void main(String[] args) {
        // 1. 객체 생성
        계산기 c = new 계산기(); // 1. 객체 생성
        // 2. 객체내 함수호출
        int result1 = c.sumMethod1(3, 5); // 2. 객체 내 함수 호출
        System.out.println("c.sumMethod1 = " + result1);
        int result2 = c.sumMethod2();
        System.out.println("c.sumMethod2 = " + result2);
        c.sumMethod3();
        c.sumMethod4(3, 5);
    }
}
