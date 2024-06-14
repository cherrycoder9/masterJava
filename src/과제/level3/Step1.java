package 과제.level3;

public class Step1 {
    public static void main(String[] args) {
        /*
        [문제]
        위와 같이 [ '안녕하세요1' ~ 10 ] 출력하는 코드를
        그림과 같이 반복문[for] 으로 변형하여 출력하시오.
	    [조건]
        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
        */
        System.out.println("안녕하세요1");
        System.out.println("안녕하세요2");
        System.out.println("안녕하세요3");
        System.out.println("안녕하세요4");
        System.out.println("안녕하세요5");
        System.out.println("안녕하세요6");
        System.out.println("안녕하세요7");
        System.out.println("안녕하세요8");
        System.out.println("안녕하세요9");
        System.out.println("안녕하세요10");
        System.out.println("-------- for으로 출력 --------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("안녕하세요" + i);
        }
    }
}
