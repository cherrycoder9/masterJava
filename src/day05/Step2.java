package day05;

public class Step2 {
    public static void main(String[] args) { // main s
        // 반복문 왜? 동일한 작업을 반복

        // 조건문 왜? 판단의 흐름 제어

        // 1.
        int num = 1;
        num = num + 2;
        num = num + 3;
        num = num + 4;
        num = num + 5;
        num = num + 6;
        num = num + 7;
        num = num + 8;
        num = num + 9;
        num = num + 10;
        System.out.println(num);

        int num2 = 1;
        for (int i = 2; i <= 10; i++) {
            num2 += i;
        }
        System.out.println(num2);

        // 2.
        /*
         * 초기값               연수구
         * while(조건문) {      while(부평구) {
         *   실행문;                걷기;
         *   증감식;                걸음수++;
         * }
         * */
        int num3 = 1;
        int i = 2;
        while (i <= 10) {
            num3 = num3 + i;
            i++;
        }
        System.out.println(num3);

        // 무한반복: 24시간 서비스를 제공해야 할때
        // while (true) System.out.println(">>loop<<");
        /*for (; ; ) {
            System.out.println(">>loop<<");
        }*/

        int num4 = 1;
        int sum2 = 0;
        do {
            sum2 += num4;
            num4++;
        } while (num4 <= 10);
        System.out.println(sum2);

        int sum3 = 0;
        for (int num5 = 1; num5 <= 10; num5++) {
            sum3 += num5;
            System.out.println(sum2);
        }

        // 관례
        // while: 무한루프 구현할때 while(true)
        // do-while: 반드시 한번 이상 수행해야 할때.
        // for: 일반적이다.

        // 구구단 외부 for문
        for (int dan = 2; dan <= 9; dan++) {
            System.out.printf("===== %d단 =====\n", dan);
            for (int times = 1; times <= 9; times++) {
                System.out.printf("%d * %d = %2d\n", dan, times, dan * times);
            }
        }


    } // main e
}
