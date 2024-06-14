package 과제.level1;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        /*
        [문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	    [조건]
        1. 모든 기본자료형 8개 사용
        2. print() 메소드 사용
        3. scanner 객체 사용하여 입력받기
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("input boolean : ");
        boolean b1 = scan.nextBoolean();
        System.out.print("input byte : ");
        byte byte1 = scan.nextByte();
        System.out.print("input char : ");
        char char1 = scan.next().charAt(0);
        System.out.print("input short : ");
        short short1 = scan.nextShort();
        System.out.print("input int : ");
        int int1 = scan.nextInt();
        System.out.print("input long : ");
        long long1 = scan.nextLong();
        System.out.print("input float : ");
        float float1 = scan.nextFloat();
        System.out.print("input double : ");
        double double1 = scan.nextDouble();

        System.out.println("output boolean: " + b1);
        System.out.println("output byte: " + byte1);
        System.out.println("output char: " + char1);
        System.out.println("output short: " + short1);
        System.out.println("output int: " + int1);
        System.out.println("output long: " + long1);
        System.out.println("output float: " + float1);
        System.out.println("output double: " + double1);
    }
}
