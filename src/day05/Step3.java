package day05;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        // 입력: 입력객체
        Scanner scanner = new Scanner(System.in);

        // 입력받은 수 만큼 별 출력
        // 1. 키보드로부터 정수형으로 입력받아 정수 변수에 저장
        /*System.out.print("별을 몇개 출력할지 입력하세요: ");
        int star1 = scanner.nextInt();
        System.out.println("star1 = " + star1);
        for (int i = 1; i <= star1; i++) {
            System.out.printf("*");
        }
        System.out.println();*/

        // 입력받은 수만큼 별 출력하고 3의 배수마다 줄바꿈 처리
        /*System.out.print("별을 몇개 출력할지 입력하세요: ");
        int star2 = scanner.nextInt();
        System.out.println();
        for (int i = 1; i <= star2; i++) {
            System.out.printf("*");
            if (i % 3 == 0) {
                System.out.println();
            }
        }*/

        // 입력받은 수 만큼 별을 하나의 변수에 하나씩 추가후 해당 변수 출력
        /*int star3 = scanner.nextInt();
        String starSum = "";
        for (int i = 1; i <= star3; i++) {
            starSum += "*";
        }
        System.out.println(starSum);*/

        // 만일 5를 입력했으면 5줄 모양의 별 출력
        // *
        // **
        // ***
        // ****
        // *****
        /*int star = scanner.nextInt();
        String starSum = "";
        for (int i = 1; i <= star; i++) {
            starSum += "*";
            System.out.printf("%s\n", starSum);
        }*/

        //     *
        //    **
        //   ***
        //  ****
        // *****
        int star = scanner.nextInt();
        String starSum = "";
        for (int i = 1; i <= star; i++) {
            starSum += "*";
            System.out.printf("%" + star + "s\n", starSum);
        }

        // *****
        // ****
        // ***
        // **
        // *

        // *****
        //  ****
        //   ***
        //    **
        //     *

        // 입력받은 줄수만큼
        //    *
        //   ***
        //  *****
        // *******

        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *

        // *   *
        //  * *
        //   *
        //  * *
        // *   *


    }
}
