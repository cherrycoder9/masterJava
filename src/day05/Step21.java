package day05;

public class Step21 {
    public static void main(String[] args) {
        /*int total = 0;
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                continue;
            }
            total += num;
        }
        System.out.println(total);

        // 예제: 1부터 1씩 증가하면서 누적 합계가 100이상이면 중지
        int sum2 = 0;
        for (int num2 = 0; num2 < 100; num2++) {
            if (sum2 >= 100) {
                break;
            }
            sum2 += num2;
        }
        System.out.println(sum2);

        // 예제: 1부터 1씩 증가하면서 누적 합계가 100이면 중지
        int sum3 = 0;
        for (int num3 = 0; num3 < 100; num3++) {
            if (sum2 >= 100) {
                break;
            }
            sum3 += num3;
        }
        System.out.println(sum3);*/


        // 문제1
        int num1 = 10;
        int num2 = 2;
        char operator = '+';

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("연산수행 불가능");
        }

        // 문제2: 짝수단만 구구단 출력
        for (int dan = 2; dan <= 9; dan++) {
            if (dan % 2 == 1) {
                continue;
            }
            System.out.printf("===== %d단 =====\n", dan);
            for (int times = 1; times <= 9; times++) {
                System.out.printf("%d * %d = %d\n", dan, times, dan * times);
            }
        }

        // 문제3: 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력
        for (int dan = 2; dan <= 9; dan++) {
            System.out.printf("===== %d단 =====\n", dan);
            for (int times = 1; times <= 9; times++) {
                if (dan < times) {
                    break;
                }
                System.out.printf("%d * %d = %d\n", dan, times, dan * times);
            }
        }

        // 문제4: 반복문 별 출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
