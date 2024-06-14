package day07.step1;

// 클래스의 사용처
// 1. 객체의 설계도
// 2. main 함수 가지고 있는 클래스


// 사람 객체의 설계도
public class Person {
    // 1. 멤버변수/필드
    String name;
    float height;
    float weight;

    // 2. 생성자
    // 생성자명은 클래스명과 동일
    // 반환/return 이 없으므로 반환타입 생략한다.
    // 디폴트/기본 생성자는 컴파일/실행시 자동으로 생성된다.
    // 클래스내 생성자가 한개도 없을때만 자동으로 생성
    Person() {
    }

    Person(String pname) {
        name = pname;
    }

    Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }

    // 3. 메소드/함수
    void person_() {
    }


}
