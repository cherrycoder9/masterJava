package 과제.level3;

public class Step3 {
    public static void main(String[] args) {
        /*
        [문제]
        다음과 같이 july1,july2,july3,july4 변수는 7월의 1주차,2주차,3주차,4주차 의 매출액이 저장된 변수 입니다.
        1. 주차별로 100만원당 도형 '■' 출력하시오.
        2. 도형 뒤로는 그림과 같이 만원대 까지만 출력하시오.
	    [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        */
        int july1 = 353;
        int july2 = 912;
        int july3 = 518;
        int july4 = 1173;

        System.out.println("----------- 7월 매출액 -----------");
        System.out.print("1주차 : ");
        for (int i = july1; i > 100; i -= 100) {
            System.out.print("■");
        }
        System.out.printf(" %d만원\n", july1);

        System.out.print("2주차 : ");
        for (int i = july2; i > 100; i -= 100) {
            System.out.print("■");
        }
        System.out.printf(" %d만원\n", july2);

        System.out.print("3주차 : ");
        for (int i = july3; i > 100; i -= 100) {
            System.out.print("■");
        }
        System.out.printf(" %d만원\n", july3);

        System.out.print("4주차 : ");
        for (int i = july4; i > 100; i -= 100) {
            System.out.print("■");
        }
        System.out.printf(" %d만원\n", july4);
    }
}
