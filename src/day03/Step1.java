package day03;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        // System.out : 시스템 출력, 콘솔 출력창
        // System.in : 시스템 입력, 키보드
        // [1] 입력 함수
        // 입력 객체 만들기
        // 1. new Scanner(); Scanner 클래스: 입력에 관련된 객체 생성
        // 2. new Scanner(System.in); System.in : 입력 장치는 키보드
        // 3. Scanner 타입으로 생성된 입력객체를 변수에 저장한다.
        // 4. 입력객체의 메소드를 이용한 입력값 가져오기
        Scanner scan = new Scanner(System.in);

        // 1.
        // scan.next(); // 1. 입력
        System.out.println("str1 입력: scan.next()");
        String str1 = scan.next(); // 2. 저장
        // System.out.println("scan = " + scan);
        // System.out.println("scan.next() = " + scan.next());
        System.out.println("str1 = " + str1); // 3. 출력

        // 2. nextLine() : next()와 동일하지만 띄어쓰기까지 포함해 입력받을 수 있음. 엔터기준으로 마침 처리하다보니 위에것이 주석 안되어 있으면 바로 넘어감
        scan.nextLine(); // 그래서 의미없는 넥스트라인을 한번더 추가하면 str2 입력 가능함
        System.out.println("str2 입력: scan.nextLine()");
        String str2 = scan.nextLine();
        System.out.println("str2 = " + str2);

        // 3. 논리 입력, 허용범위 외 입력시 오류
        System.out.println("불리언 입력: scan.nextBoolean()");
        boolean b1 = scan.nextBoolean();
        System.out.println("b1 = " + b1);

        // 4. 바이트: 허용범위 내 입력, 허용범위 외 입력시 오류
        System.out.println("바이트 입력: scan.nextByte()");
        byte by1 = scan.nextByte();
        System.out.println("by1 = " + by1);

        // 5. short
        System.out.println("short 입력: scan.nextShort()");
        short sh1 = scan.nextShort();
        System.out.println("sh1 = " + sh1);

        // 6. int
        System.out.println("int 입력: scan.nextInt()");
        int int1 = scan.nextInt();
        System.out.println("int1 = " + int1);

        // 7. long
        System.out.println("long 입력: scan.nextLong()");
        long long1 = scan.nextLong();
        System.out.println("long1 = " + long1);

        // 8. float
        System.out.println("float 입력: scan.nextFloat()");
        float float1 = scan.nextFloat();
        System.out.println("float1 = " + float1);

        // 9. double 
        System.out.println("double 입력: scan.nextDouble()");
        double double1 = scan.nextDouble();
        System.out.println("double1 = " + double1);

    }
}
