package 과제.level1;

public class Step2 {
    public static void main(String[] args) {
        /*
        [문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	    [조건]
        1. 모든 기본자료형 8개 사용
        2. printf() 메소드 사용
        */
        boolean bo1 = true;
        byte by1 = 100;
        char ch1 = 'A';
        short sh1 = 30000;
        int in1 = 200000000;
        long lo1 = 400000000000000L;
        float fl1 = 3.1212121f;
        double do1 = 3.12121212121212;

        System.out.printf("%b\n", bo1);
        System.out.printf("%d\n", by1);
        System.out.printf("%c\n", ch1);
        System.out.printf("%d\n", sh1);
        System.out.printf("%d\n", in1);
        System.out.printf("%d\n", lo1);
        System.out.printf("%f\n", fl1);
        System.out.printf("%.15f\n", do1);
    }
}
