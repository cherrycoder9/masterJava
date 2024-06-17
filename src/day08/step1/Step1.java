package day08.step1;

import java.util.Arrays;

public class Step1 {
    public static void main(String[] args) {
        // 1. int형 10개를 저장할 수 있는 배열 선언과 동시에 초기화
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Arrays.toString(): 현재 배열 내 요소들을 출력
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(new int[10]));
        int sum = 0;
        for (int i = 0; i <= num.length; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 문자 여러개를 저장하는 문자 배열 만들기 ===> 문자열 만들기
        // String 클래스 이해에 도움
        char[] alphabets = new char[26];
        char ch = 'A';
        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }
        System.out.println(alphabets);
        for (char alphabet : alphabets) {
            System.out.println(alphabet + "," + (int) alphabet);
        }
    }
}
