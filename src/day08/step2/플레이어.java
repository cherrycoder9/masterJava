package day08.step2;

/*
축구선수 설계
-  main 함수가 있는 클래스내 main 함수 안에서
    - 각각 서로 다른 매개변수의 생성자를 이용해 6명의 선수 객체 생성
    - 생성자에 대입하지 않는 매개변수값은 setter 이용해 값을 대입
    - 6명의 선수 객체의 멤버변수를 각각 모두 getter 이용해 출력

데이터 샘플
    고유식별번호,이름,나이,선호포지션,소속팀
    1,"유재석",40,"공격수",인천
    2,"박지성",38,"미드필더",인천
    3,"손흥민",31,"공격수",도트넘
    4,"이강인",25,"미드필더",파리
    5,"김민재",28,"수비수",독일
    6,"서장훈",21,"공격수",서울
* */
public class 플레이어 {

    private int 고유식별번호;
    private String 이름;
    private int 나이;
    private String 선호포지션;
    private String 소속팀;

    플레이어() {
    }

    플레이어(int 고유식별번호) {
        this.고유식별번호 = 고유식별번호;
    }

    플레이어(int 고유식별번호, String 이름) {
        this.고유식별번호 = 고유식별번호;
        this.이름 = 이름;
    }

    플레이어(int 고유식별번호, String 이름, int 나이) {
        this.고유식별번호 = 고유식별번호;
        this.이름 = 이름;
        this.나이 = 나이;
    }

    플레이어(int 고유식별번호, String 이름, int 나이, String 선호포지션) {
        this.고유식별번호 = 고유식별번호;
        this.이름 = 이름;
        this.나이 = 나이;
        this.선호포지션 = 선호포지션;
    }

    플레이어(int 고유식별번호, String 이름, int 나이, String 선호포지션, String 소속팀) {
        this.고유식별번호 = 고유식별번호;
        this.이름 = 이름;
        this.나이 = 나이;
        this.선호포지션 = 선호포지션;
        this.소속팀 = 소속팀;
    }

    public int get고유식별번호() {
        return 고유식별번호;
    }

    public void set고유식별번호(int 고유식별번호) {
        this.고유식별번호 = 고유식별번호;
    }

    private String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    private int get나이() {
        return 나이;
    }

    public void set나이(int 나이) {
        this.나이 = 나이;
    }

    private String get선호포지션() {
        return 선호포지션;
    }

    public void set선호포지션(String 선호포지션) {
        this.선호포지션 = 선호포지션;
    }

    private String get소속팀() {
        return 소속팀;
    }

    public void set소속팀(String 소속팀) {
        this.소속팀 = 소속팀;
    }

    public void printPlayerInfo() {
        System.out.printf("%d,\"%s\",%d,", get고유식별번호(), get이름(), get나이());
        System.out.printf("\"%s\",%s\n", get선호포지션(), get소속팀());
    }
}
