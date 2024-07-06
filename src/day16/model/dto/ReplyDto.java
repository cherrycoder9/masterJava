package day16.model.dto;

public class ReplyDto {
    // 멤버변수
    private int rno;
    private String rcontent;
    private String rdate;
    private int mno;
    private int bno;
    private String mid;

    // 생성자
    public ReplyDto() {
    }

    // 풀 생성자
    public ReplyDto(int rno, String rcontent, String rdate, int mno, int bno, String mid) {
        this.rno = rno;
        this.rcontent = rcontent;
        this.rdate = rdate;
        this.mno = mno;
        this.bno = bno;
        this.mid = mid;
    }

    // 메서드
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "ReplyDto{" +
                "rno=" + rno +
                ", rcontent='" + rcontent + '\'' +
                ", mid='" + mid + '\'' +
                ", rdate='" + rdate + '\'' +
                ", mno=" + mno +
                ", bno=" + bno +
                '}';
    }
}
