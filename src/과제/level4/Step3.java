package 과제.level4;

public class Step3 {
    public static void main(String[] args) {
        /*
        주제 : '회원' 을 설계하고 만들기
        [ 클래스 생성 ]
        멤버변수/필드 : 회원번호 , 아이디 , 비밀번호 , 이름
        - 위 필드을 적절한 자료형을 선택하여 설계하시오.
	    [ 객체 생성 ]
        임의의 데이터를 입력하여 2개의 객체를 생성하고 출력하는 코드를 작성하시오.
        */
        Member 철수 = new Member("parkcs314", "dk0014w", "이철수");
        Member 민지 = new Member("min9911ss", "WjdalsWl00", "정민지");
        철수.printMemberInfo();
        민지.printMemberInfo();
        철수.changePassword();
        민지.changePassword();
    }
}
