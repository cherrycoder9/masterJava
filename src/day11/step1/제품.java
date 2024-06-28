package day11.step1;

public class 제품 {
    // 멤버변수
    private int 제품코드;
    private String 제품명;
    private int 가격;
    private int 카테고리코드;

    // 생성자
    public 제품(int 제품코드, String 제품명, int 가격, int 카테고리코드) {
        boolean f = false;
        for (int i = 0; i < Step1.카테고리.size(); i++) {
            if (카테고리코드 == Step1.카테고리.get(i).get카테고리코드()) {
                this.제품코드 = 제품코드;
                this.제품명 = 제품명;
                this.가격 = 가격;
                this.카테고리코드 = 카테고리코드;
                f = true;
            }
        }
        if (f == false) {
            System.out.println("없는 카테고리코드 입니다.");
        }

    }


    // 메서드

    public int get제품코드() {
        return 제품코드;
    }

    public void set제품코드(int 제품코드) {
        this.제품코드 = 제품코드;
    }

    public String get제품명() {
        return 제품명;
    }

    public void set제품명(String 제품명) {
        this.제품명 = 제품명;
    }

    public int get가격() {
        return 가격;
    }

    public void set가격(int 가격) {
        this.가격 = 가격;
    }

    public int get카테고리코드() {
        return 카테고리코드;
    }

    public void set카테고리코드(int 카테고리코드) {
        this.카테고리코드 = 카테고리코드;
    }

    @Override
    public String toString() {
        return "제품{" +
                "제품코드=" + 제품코드 +
                ", 제품명='" + 제품명 + '\'' +
                ", 가격=" + 가격 +
                ", 카테고리코드=" + 카테고리코드 +
                '}';
    }
}