package 과제.level3;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        /*
        [문제] 그림과 같이 계속입력한 수에 따라 누적으로 저장되어 저장된 수 만큼 '■' 를 출력하시오.
	    [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        2. 만약에 누적값이 0 보다 작으면 종료됩니다.
        */

        Scanner scan = new Scanner(System.in);
        int count = 0;

        while (count >= 0) {
            System.out.print("input : ");
            count += scan.nextInt();
            for (int i = count; i > 0; i--) {
                System.out.print("■ ");
            }
            System.out.println();
        }
    }
}
