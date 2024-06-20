package day11.step1;

public class 카테고리 {
    // 멤버변수
    private int 카테고리코드;
    private String 카테고리명;

    // 생성자
    public 카테고리(int 카테고리코드, String 카테고리명) {
        this.카테고리코드 = 카테고리코드;
        this.카테고리명 = 카테고리명;
    }

    // 메서드
    public int get카테고리코드() {
        return 카테고리코드;
    }

    public void set카테고리코드(int 카테고리코드) {
        this.카테고리코드 = 카테고리코드;
    }

    public String get카테고리명() {
        return 카테고리명;
    }

    public void set카테고리명(String 카테고리명) {
        this.카테고리명 = 카테고리명;
    }

    @Override
    public String toString() {
        return "카테고리{" +
                "카테고리코드=" + 카테고리코드 +
                ", 카테고리명='" + 카테고리명 + '\'' +
                '}';
    }
}
