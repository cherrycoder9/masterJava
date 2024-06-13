package day06.step6;

// 요구사항
// 1. 기능이 무한적으로 반복되도록 구현
// - 단 종료 버튼/입력 선택시 종료
// 2. 기능 : 예금, 출금, 잔고확인, 종료
// - 예금 : 입력받은 금액을 예금액에 더한다.
// - 출금 : 입력받은 금액을 예금액에서 빼기
// - 잔고확인 : 현재 예금액을 확인
// - 종료 : 1234 입력되면 무한루프 종료
// 3. 메뉴 : 1. 예금 2. 출금 3. 잔고확인 4. 종료
// 4. 설계 :
//      Account 클래스 정의
//          - balance (예금액)
//          - number (계좌번호)
//      Step6 클래스
//          - main 함수

public class Account {
    long balance;
    String number;

    public void 예금(long 입금액) {
        balance += 입금액;
    }

    public void 출금(long 출금액) {
        balance -= 출금액;
    }

    public void 잔고확인() {
        System.out.printf("잔고는 %d원 입니다.\n", balance);
    }
}
