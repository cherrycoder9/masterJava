package day07.step2;

public class 아파트설계도 {
    // 멤버변수/필드
    private String 냉장고;
    private String 패스워드;

    // 생성자
    아파트설계도(String 초기음식) {
        if (초기음식.equals("쓰레기")) {

        } else {
            냉장고 = 초기음식;
        }
    }

    // 메소드
    public String 음식꺼내기(String 입력된패스워드) {
        if (입력된패스워드 == 패스워드) {
            return 냉장고;
        } else {
            return "";
        }
    }

    public void 음식저장(String 음식) {
        냉장고 = 음식;
    }

    public void 암호저장(String 암호) {
        패스워드 = 암호;
    }
}
