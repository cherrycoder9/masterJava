package day07.step2;

// public: 다른 클래스로부터 공개
// public class 클래스명() {}

// private: 다른 클래스로부터 비공개
// public/private 멤버변수
// public/private 반환타입 함수명() {}

// default (생략) 같은 패키지/폴더 내 클래스끼리 공개용


public class Student {
    // 1. 멤버변수/필드
    int studentID;
    int grade;
    String address;
    private String studentName;


    // 2. 생성자
    // x
    // 3. 메소드
    String getStudentName() {
        return studentName;
    }

    void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
