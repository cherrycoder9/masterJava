package day14.step2;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    static int total(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        myStaticMethod();
        return total;
    }

    private static void myStaticMethod() {
        System.out.println("private static 메서드입니다.");
    }

    int add(int num1, int num2);

    int subtract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    private void myMethod() {
        System.out.println("private 메서드입니다");
    }
}
