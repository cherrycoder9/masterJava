package day07.step2;

public class MyDate {
    // 멤버변수 / 필드
    private int day;
    private int month;
    private int year;

    // 생성자 : 객체 생성시 객체의 멤버변수 초기화 할 때 사용
    // 객체내 멤버변수와 생성자의 매개변수명이 동일할 때
    // 1. 다르게 변수명을 사용하자. 만일 다르면 코드 작성시 가독성이 떨어짐
    // 2. 가독성을 위해 변수명 동일할때 this 키워드를 이용해 구분하자
    // this.멤버변수 : 현재 객체의 멤버변수 가리킨다.
    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // 1. 멤버변수의 저장할 데이터와 자료형 생각
    // 2. 멤버변수의 접근 제한

    // 메소드
    // 해당 날짜가 유효한지 유효성검사 함수
    public boolean isValid() {
        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > 31) {
            return false;
        }

        if (month == 2) {
            if (isLeapYear()) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }

        return true;
    }

    private boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
