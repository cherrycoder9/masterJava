package 과제.level1;

import java.util.Scanner;

public class Step8 {
    public static void main(String[] args) {
        /*
        [문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	    [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        2. 문자열클래스를 이용하여 그림과 같이 제목과 내용을 입력받습니다. [ 내용만 띄어쓰기가 가능하도록 입력받습니다 ]
        3. *반복문을 사용하지 않고 총 5개의 방문록이 작성 되도록 작성하시오.
        4. 방문록 1번 작성할때마다 방문록을 목록을 보여줍니다.
        5. 기존에 미리 작성된 변수를 최대한 활용합니다. 변수를 추가하지 않습니다.
        */

        Scanner scan = new Scanner(System.in);

        int count = 0;


        System.out.printf("[%d]작성자 : ", ++count);
        String writer1 = scan.next();
        scan.nextLine();
        System.out.printf("[%d]방문록 : ", count);
        String content1 = scan.nextLine();
        System.out.println("============= 방문록 =============");
        System.out.printf("%-3s %-7s %-17s\n", "번호", "작성자", "방문록");
        System.out.printf("%-4d %-7s %-17s\n", count, writer1, content1);

        System.out.printf("[%d]작성자 : ", ++count);
        String writer2 = scan.next();
        scan.nextLine();
        System.out.printf("[%d]방문록 : ", count);
        String content2 = scan.nextLine();
        System.out.println("============= 방문록 =============");
        System.out.printf("%-3s %-7s %-17s\n", "번호", "작성자", "방문록");
        System.out.printf("%-4d %-7s %-17s\n", 1, writer1, content1);
        System.out.printf("%-4d %-7s %-17s\n", count, writer2, content2);

        System.out.printf("[%d]작성자 : ", ++count);
        String writer3 = scan.next();
        scan.nextLine();
        System.out.printf("[%d]방문록 : ", count);
        String content3 = scan.nextLine();
        System.out.println("============= 방문록 =============");
        System.out.printf("%-3s %-7s %-17s\n", "번호", "작성자", "방문록");
        System.out.printf("%-4d %-7s %-17s\n", 1, writer1, content1);
        System.out.printf("%-4d %-7s %-17s\n", 2, writer2, content2);
        System.out.printf("%-4d %-7s %-17s\n", count, writer3, content3);

        System.out.printf("[%d]작성자 : ", ++count);
        String writer4 = scan.next();
        scan.nextLine();
        System.out.printf("[%d]방문록 : ", count);
        String content4 = scan.nextLine();
        System.out.println("============= 방문록 =============");
        System.out.printf("%-3s %-7s %-17s\n", "번호", "작성자", "방문록");
        System.out.printf("%-4d %-7s %-17s\n", 1, writer1, content1);
        System.out.printf("%-4d %-7s %-17s\n", 2, writer2, content2);
        System.out.printf("%-4d %-7s %-17s\n", 3, writer3, content3);
        System.out.printf("%-4d %-7s %-17s\n", count, writer4, content4);

        System.out.printf("[%d]작성자 : ", ++count);
        String writer5 = scan.next();
        scan.nextLine();
        System.out.printf("[%d]방문록 : ", count);
        String content5 = scan.nextLine();
        System.out.println("============= 방문록 =============");
        System.out.printf("%-3s %-7s %-17s\n", "번호", "작성자", "방문록");
        System.out.printf("%-4d %-7s %-17s\n", 1, writer1, content1);
        System.out.printf("%-4d %-7s %-17s\n", 2, writer2, content2);
        System.out.printf("%-4d %-7s %-17s\n", 3, writer3, content3);
        System.out.printf("%-4d %-7s %-17s\n", 4, writer4, content4);
        System.out.printf("%-4d %-7s %-17s\n", count, writer5, content5);
    }
}
