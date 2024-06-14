package 과제.level2;

public class Step3 {
    public static void main(String[] args) {
        /*
        [문제] 국어,영어,수학 3개의 점수가 선언되어 있습니다. 그림과 같이 출력하시오.
        [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        2.
        합계 : 3개의 점수를 모두 더한 값
        평균 : 합계 / 과목수 		[소수 첫째자리 까지 출력 ]
        3배수 : 합계 값이 3의 배수이면 true 아니면 false
        7배수 : 합계 값이 7의 배수이면 true 아니면 false
        홀짝 : 합계 값이 홀수이면 홀수출력 아니면 짝수 출력
        결과 : 합계가 65점이상이면 합계 아니면 탈락 출력
        3. *(중요) 풀이코드에서 printf는 한번만 사용합니다.
        */

        int kScore = 55;
        int eScore = 36;
        int mScore = 61;
        int sum = kScore + eScore + mScore;
        double avr = (double) sum / 3;
        boolean is3x = sum % 3 == 0;
        boolean is7x = sum % 7 == 0;
        String even = sum % 2 == 0 ? "짝수" : "홀수";
        String result = avr > 65.0 ? "합격" : "탈락";

        System.out.println("-------------------------------------------------------");
        System.out.println("국어  영어  수학  합계  평균    3배수    7배수   홀짝   결과");
        System.out.printf(" %-4d %-4d %-4d %-4d %-4.1f %7b %7b %4s %4s", kScore, eScore, mScore, sum, avr, is3x, is7x, even, result);
    }
}
