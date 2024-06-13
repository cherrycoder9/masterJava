// 살펴보기
// 객체(object)
// 학생정보, 게시판, 제품, 회원정보 등등
// 속성/필드/멤버변수 = 고유성질과 함수/메서드 = 행위

// ex) 학생 객체 정의/만들기 => 클래스를 만든다.
// 1. (설계) 학생 객체의 성질과 행위 고민해보자
// 2. 자바에서는 객체 생성하려면 클래스가 무조건 필요하다.
// - 자바스크립트는 크랠스가 없어도 객체(json) {} 형식 사용가능
// 3. (객체를 설계하는 행위) 클래스 만들어보자.

package day06.step1;

// public: 공개용
// class: class 선언할때 사용되는 예약어/키워드
// 'Student': class명 (임의)

public class Student {
    // 필드, 멤버변수
    int studentID;
    String studentName;
    int grade;
    String address;
}
