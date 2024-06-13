package day06.step7;

public class Step7 {

    public static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        // 함수 호출
        int sum = add(num1, num2);
        System.out.println("sum = " + sum);
    }
}
