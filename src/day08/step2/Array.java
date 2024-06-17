package day08.step2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 30;
        //array1[1] = "유재석"; // 타입이 다르므로 오류 
        array1[1] = 'A'; // 자동 타입 변환
        array1[2] = (int) 3.14; // 강제 타입 변환
        // array1[3] = 'B'; // 존재하지 않는 인덱스 오류
        System.out.println(Arrays.toString(array1));


    }
}
