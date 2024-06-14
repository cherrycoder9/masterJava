package 과제.level1;

public class Step5 {
    public static void main(String[] args) {
        /*
        [문제] 그림과 같이 기본자료형을 이용하여 변수 5개 선언되어 있습니다. 그림과 같이 자동 형변환을 하여 출력하시오.
	    [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        2. 자동 형변환 만 사용하여 그림과 같이 출력합니다.
        */
        byte b1 = 100;
        short xx_b1 = b1;

        short short1 = 30000;
        int xx_sh1 = short1;

        int int1 = 2000000000;
        long xx_int1 = int1;

        long long1 = 40000000000L;
        float xx_long1 = long1;

        float float1 = 3.1231231689453125f;
        double xx_fl1 = float1;

        System.out.println("float -> short : " + xx_b1);
        System.out.println("short -> int : " + xx_sh1);
        System.out.println("int -> long : " + xx_int1);
        System.out.println("long -> float : " + xx_long1);
        System.out.println("float -> double : " + xx_fl1);
    }
}
