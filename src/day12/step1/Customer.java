package day12.step1;

public class Customer { // 클래스 --------------
    // 1. 멤버변수 : 객체 내 속성 값을 저장할 변수, 접근제한자 (static) 타입 변수명
    // 접근제한자
    // private : 다른 클래스로부터 접근 제한, 현재 클래스에서만 호출이 가능하다.
    // public : 다른 클래스로부터 접근 가능, 현재 외 다른 클래스에서도 호출이 가능
    // 정적 변수
    // static : 메소드 영역에 저장되는 변수로서 객체가 없어도 사용이 가능하다.
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected double bonusRatio;
    protected int bonusPoint;

    // 2. 생성자 : 객체 생성시 사용되는 특별한 메서드, 반환타입이 없다.
    // 오버로딩: 같은 이름의 메서드나 함수를 여러 개 정의하는 것.
    // 매개변수의 개수나 타입이 달라야 함.
    // 클래스내 생성자가 1개도 없으면 기본(default) 생성자 자동으로 생성되지만
    // 생성자가 1개 이상 존재하면 기본 생성자는 자동으로 생성되지 않는다.
    // 주로 객체 생성시 멤버변수의 초기화 또는 유효성검사 진행할때 씀
    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public Customer(int customerID) {

    }

    // 3. 메소드 : 함수, 객체의 방법/행위/행동
    // 접근제한자 static 반환타입 함수명(타입 매개변수1, 타입 매개변수2) {실행문; return 값;}
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        // this란? 매개변수와 멤버변수 구분하기 위해, 해당 함수를 실행한 객체를 식별용
        return price; // 값은 메소드 반환타입과 일치해야함, 반환값이 없으면 void 타입
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade +
                "이며, 보너스 포인트는" + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
} // 클래스 ------------------------------------
