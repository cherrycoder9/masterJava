package day16.model.dto;

// 회원 정보 데이터 전송 객체(DTO)
public class MemberDto {
    // 회원 정보 필드
    private String mid;    // 회원 아이디
    private String mpwd;   // 회원 비밀번호
    private String mname;  // 회원 이름
    private String mphone; // 회원 전화번호
    private String mdate;  // 가입 날짜
    private int mno;       // 회원 번호

    // 기본 생성자
    public MemberDto() {
    }

    // 모든 필드를 초기화하는 생성자
    public MemberDto(String mid, String mpwd, String mname, String mphone, String mdate, int mno) {
        this.mid = mid;
        this.mpwd = mpwd;
        this.mname = mname;
        this.mphone = mphone;
        this.mdate = mdate;
        this.mno = mno;
    }

    // 회원가입용 생성자
    public MemberDto(String mid, String mpwd, String mname, String mphone) {
        this.mid = mid;
        this.mpwd = mpwd;
        this.mname = mname;
        this.mphone = mphone;
    }

    public MemberDto(String mid) {
        this.mid = mid;
    }

    // Getter 및 Setter 메서드
    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpwd() {
        return mpwd;
    }

    public void setMpwd(String mpwd) {
        this.mpwd = mpwd;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    // 객체 정보를 문자열로 반환하는 메서드
    @Override
    public String toString() {
        return "MemberDto{" +
                "mid='" + mid + '\'' +
                ", mpwd='" + mpwd + '\'' +
                ", mname='" + mname + '\'' +
                ", mphone='" + mphone + '\'' +
                ", mdate='" + mdate + '\'' +
                ", mno=" + mno +
                '}';
    }
}