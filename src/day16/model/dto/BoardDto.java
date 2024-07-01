package day16.model.dto;

public class BoardDto {
    // 1. 멤버변수
    private String btitle; // 게시물 제목
    private String bcontent; // 게시물 내용
    private String bdate; // 게시물 작성 날짜
    private int bview; // 게시물 조회수
    private int mno; // 작성자 회원번호
    private int bno; // 게시물 번호

    // 2. 기본 생성자
    public BoardDto() {
    }

    // 모든 필드를 초기화하는 생성자
    public BoardDto(String btitle, String bcontent, String bdate, int bview, int mno, int bno) {
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.bdate = bdate;
        this.bview = bview;
        this.mno = mno;
        this.bno = bno;
    }

    // 3. 메소드
    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public int getBview() {
        return bview;
    }

    public void setBview(int bview) {
        this.bview = bview;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "btitle='" + btitle + '\'' +
                ", bcontent='" + bcontent + '\'' +
                ", bdate='" + bdate + '\'' +
                ", bview=" + bview +
                ", mno=" + mno +
                ", bno=" + bno +
                '}';
    }
}
