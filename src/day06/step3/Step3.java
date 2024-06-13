package day06.step3;

public class Step3 {
    public static void main(String[] args) {
        // 1. 첫번째 객체 생성
        Phone p1 = new Phone();
        // 1. 클래스명
        // 2. 변수명
        // 3. = 대입
        // 4. new 연산자
        // 5. 생성자명()

        // 1. 두번째 객체 생성
        Phone p2 = new Phone();

        // 2. 객체의 멤버(필드/메소드) 접근/참조 하기
        p1.name = "갤럭시23";
        System.out.println(p1.name);

        p1.전화걸기();

        p2.name = "갤럭시24";
        System.out.println(p2.name);

        p2.전화걸기();

        // 2개 이상의 객체 생성
        // 각 멤버변수/필드에 값 대입하고 멤버변수/필드의 값 호출
        // 각 멤버함수를 호출하는 코드

        // 첫번째 객체 생성
        경제효율성 아일랜드 = new 경제효율성();
        아일랜드.최저임금 = 10;
        아일랜드.관세 = 3.5;
        아일랜드.규제 = "low";
        아일랜드.세금 = 7;
        아일랜드.보유자원 = "은";
        아일랜드.노동시간 = 35;
        아일랜드.법안수정();
        아일랜드.무역협정();
        아일랜드.자원탐사();
        System.out.println("아일랜드.보유자원 = " + 아일랜드.보유자원);

        // 두번째 객체 생성
        경제효율성 스리랑카 = new 경제효율성();
        스리랑카.최저임금 = 9;
        스리랑카.관세 = 13;
        스리랑카.규제 = "medium";
        스리랑카.세금 = 9;
        스리랑카.보유자원 = "텅스텐";
        스리랑카.노동시간 = 40;
        스리랑카.법안수정();
        스리랑카.무역협정();
        스리랑카.자원탐사();
        System.out.println("스리랑카.규제 = " + 스리랑카.규제);

    }
}
