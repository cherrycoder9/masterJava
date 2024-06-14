package 과제.level1;

import java.util.Scanner;

public class Step8 {
    public static void main(String[] args) {
        /*
        [문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	    [조건]
        1. 문자열클래스를 이용하여 그림과 같이 제목과 내용을 입력받습니다. [ 내용만 띄어쓰기가 가능하도록 입력받습니다 ]
        2. *반복문을 사용하지 않고 총 5개의 방문록이 작성 되도록 작성하시오.
        3. 방문록 1번 작성할때마다 방문록을 목록을 보여줍니다.
        4. 기존에 미리 작성된 변수를 최대한 활용합니다. 변수를 추가하지 않습니다.
	    [샘플]

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            String header = "\n============방문록===============\n번호\t 작성자 \t 방문록\n";
            String boardlist = "";
            String footer = "================================\n";
            String output = "";
         */


        Scanner scan = new Scanner(System.in);
        String header = "\n===============방문록===============\n번호\t 작성자 \t 방문록\n";
        String boardlist = "";
        String footer = "==================================\n";
        String output = "";
        int count = 0;

        System.out.printf("[%d]작성자 : ", ++count);
        boardlist += count + " \t ";
        boardlist += scan.next() + " \t ";
        System.out.printf("[%d]방문록 : ", count);
        scan.nextLine();
        boardlist += scan.nextLine() + "\n";
        System.out.printf(header);
        System.out.printf(boardlist);
        System.out.printf(footer);

        System.out.printf("[%d]작성자 : ", ++count);
        boardlist += count + " \t ";
        boardlist += scan.next() + " \t ";
        System.out.printf("[%d]방문록 : ", count);
        scan.nextLine();
        boardlist += scan.nextLine() + "\n";
        System.out.printf(header);
        System.out.printf(boardlist);
        System.out.printf(footer);

        System.out.printf("[%d]작성자 : ", ++count);
        boardlist += count + " \t ";
        boardlist += scan.next() + " \t ";
        System.out.printf("[%d]방문록 : ", count);
        scan.nextLine();
        boardlist += scan.nextLine() + "\n";
        System.out.printf(header);
        System.out.printf(boardlist);
        System.out.printf(footer);

        System.out.printf("[%d]작성자 : ", ++count);
        boardlist += count + " \t ";
        boardlist += scan.next() + " \t ";
        System.out.printf("[%d]방문록 : ", count);
        scan.nextLine();
        boardlist += scan.nextLine() + "\n";
        System.out.printf(header);
        System.out.printf(boardlist);
        System.out.printf(footer);

        System.out.printf("[%d]작성자 : ", ++count);
        boardlist += count + " \t ";
        boardlist += scan.next() + " \t ";
        System.out.printf("[%d]방문록 : ", count);
        scan.nextLine();
        boardlist += scan.nextLine() + "\n";
        System.out.printf(header);
        System.out.printf(boardlist);
        System.out.printf(footer);
    }
}
