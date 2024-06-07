package day02;

public class Step3 {
    public static void main(String[] args) {
        // 기본 연산자
        // 연산자: 연산에 사용되는 기호
        // 항: 연산에 사용하는 값, 단항, 이항, 삼항
        // 부호 연산자: +값은 양수, -값을 넣으면 음수

        // 1. 산술연산자: +, -, *, /, %(나머지)
        int x = 10;
        int y = -3;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        // 2. 연결 연산자: +연결연산자
        System.out.println("x + y = " + (x + y));

        // 3. 비교연산자: == 같다, != 같지 않다, > 초과, >= 이상, < 미만, <= 이하
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x > y); // true
        System.out.println(x >= y); // true
        System.out.println(x < y); // false
        System.out.println(x <= y); // false

        // int x = 10;
        // int y = -3;
        // 4. 논리연산자: && 이면서 || 이거나 ! 부정
        System.out.println(x > 5 && x <= 20); // true
        System.out.println(y == -5 || y < 0); // true
        System.out.println(!(x > 20)); // true

        // 복합 대입 연산자
        // = 대입 연산자: 오른쪽 값을 왼쪽에 대입한다
        int z = 30;
        z += 1; // 오른쪽 값을 왼쪽에 연산후 결과를 왼쪽에 대입
        z = z + 1;
        System.out.println(z);

        // 6. 증감연산자
        // ++변수: 전위증가, 출력전에 증가
        // 변수++: 후위증가, 출력후에 증가

        // 7. 삼항연산자
        // 조건 ? 참 : 거짓, 조건1 ? 참1 : 조건2 ? 참2 : 거짓
        System.out.println(x < y ? y : x > z ? x : z);

        // 산술연산자
        // + - * / %
        // 연결연산자
        // + 연결연산자임, 문자/열이 행에 포함될 경우
        // 비교연산자
        // ==같다 != 같지않다 > 초과 <미만 >=이상 <=이하
        // 논리연산자
        // && || !
        // 복합대입연산자
        // += -= *= /= %=
        // 증감연산자
        // ++변수명, 변수명++, --변수명, 변수명++
        // 삼항연산자
        // 조건? 참:거짓
        // 조건1? 참1: 조건2? 참2: 거짓
        // 조건1? 참1: 조건2? 참2: 조건3? 참3: 거짓
    }
}
