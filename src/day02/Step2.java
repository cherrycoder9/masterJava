package day02;

public class Step2 {
    public static void main(String[] args) {
        // 형변환: 자료형 변경

        // 1. 묵시적/자동 형 변환:
        // 메모리 크기가 작은것부터 큰 순으로
        // 데이터 손실 없다.
        // byte -> short -> int -> long -> float -> double

        // 2. 명시적/강제 형 변환
        // 메모리 크기가 큰것부터 작은 순으로 변환
        // 데이터 손실이 있을수 있다.
        // byte <- short <- int <- long <- float <- double

        byte byteValue = 10; // byte(1바이트) 상자에 'byteValue' 이라는 이름으로 변수에 10 대입
        int intValue = byteValue;
        System.out.println("intValue = " + intValue);

        char charValue = '가'; // char(2바이트) 상자에 'charValue'라는 이름으로 변수에 '가' 대입
        intValue = charValue;
        System.out.println("Value = " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue = " + longValue);

        longValue = 100;
        float floatValue = longValue;
        // 묵시적 형 변환 (부동소수점의 표현 단위 더 크기 때문)
        System.out.println("floatValue = " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue; // 묵시적 형변환
        System.out.println("doubleValue = " + doubleValue);

        // 연산중에 묵시적 형변환
        // 1. byte, short 계산하면 int 됨 
        // 2. long, int 계산하면 long 됨 
        // 3. double, float 계산하면 double 

        byte b1 = 10;
        byte b2 = 20;
        int result1 = b1 + b2;
        System.out.println("result1 = " + result1);

        byte b3 = 30;
        long l1 = 100;
        System.out.println((b3 + l1));

        char c1 = 'A';
        char c2 = 'B';
        int result3 = c1 + c2;

        int i1 = 10;
        double d1 = 4.0;
        double result4 = i1 + d1;

        int intValue2 = 10;
        byte byteValue2 = (byte) intValue2;
        System.out.println("byteValue = " + byteValue2);

        long longValue2 = 300;
        int intValue3 = (int) longValue2;
        // 값 크기에 따라 데이터 손실이 있을 수 있음
        System.out.println("intValue3 = " + intValue3);

        int intValue4 = 65;
        char charValue2 = (char) intValue4;
        System.out.println("charValue2 = " + charValue2);

        double doubleValue2 = 3.14;
        int intValue5 = (int) doubleValue2;
        System.out.println("intValue5 = " + intValue5);

        int ch2 = 67;
        char charValue3 = (char) ch2; // 강제 형변환 
        System.out.println("charValue3 = " + charValue3);

        float a1 = 3.14f;
        int aa2 = (int) a1;
        System.out.println("aa2 = " + aa2);

        int value123 = 10;
        double value345 = 2.0;
        int result123 = (int) (value123 + value345);

        System.out.println("result123 = " + result123);
        char char11 = '글';
        int char22 = (int) char11;
        System.out.println("char22 = " + char22);
    }
}
