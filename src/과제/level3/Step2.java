package 과제.level3;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        /*
        [문제]
        그림과 같이 무한적으로 문자열을 입력 받다가 end 입력시
        입력받은 횟수와 문구를 출력후 종료되는 반복문을 구현하시오.
	    [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        */
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (true) {
            ++count;
            System.out.printf("%d회 입력 : ", count);
            String str = scan.next();
            if (str.equals("end")) {
                System.out.printf("안내) 프로그램 종료 합니다. [총 %d회 입력]", count);
                break;
            }
        }
    }
}
