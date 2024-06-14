package 과제.level1;

public class Step6 {
    public static void main(String[] args) {
        /*
        [문제] 그림과 같이 기본자료형을 이용하여 변수 5개 선언되어 있습니다. 그림과 같이 강제 형변환을 하여 출력하시오.
	    [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        2. 강제 형변환 만 사용하여 그림과 같이 출력합니다.
        */
        short sh1 = 48;
        int in1 = -27648;
        long lo1 = 1345294336;
        float fl1 = 3.0f;
        double do1 = 3.12312321231;

        System.out.println("byte <- short : " + (byte) sh1);
        System.out.println("short <- int : " + (short) in1);
        System.out.println("int <- long : " + (int) lo1);
        System.out.println("long <- float : " + (long) fl1);
        System.out.println("float <- double : " + (float) do1);
    }
}
