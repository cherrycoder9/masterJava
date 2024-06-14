package day07.step1;

// 실행 클래스
public class Step1 {
    public static void main(String[] args) {
        // 객체 만들기
        // 1. 타입/클래스명(설계도선택) 작성한다
        // Person

        // 2. 객체를 담을 임의의 변수명 작성한다
        // Person personLee;

        // 3. 객체/인스턴스를 생성해서 변수에 담는다.
        // new 생성자명();
        Person personLee = new Person();
        Person personKim = new Person("hello");
        System.out.println(personLee.name);
        System.out.println(personKim.name);
        Person personOh = new Person("hello", 3.14f, 45.98f);
        System.out.println("personOh = " + personOh.weight);
    }
}
