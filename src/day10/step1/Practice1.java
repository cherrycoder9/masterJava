package day10.step1;

public class Practice1 {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi();
        Person person1 = new Person(30000, true);
        person1.takeTaxi(taxi1);
        System.out.println(taxi1);
        System.out.println(person1);
        // 주민등록증 발급절차
        // 동사무소로 간다
        // 서류를 작성한다
        // 번호표를 뽑는다.
        // 작성 서류와 주민등록증을 제출한다
        // 공무원의 추가 요청이 있다면 따른다.
        // 결제해야 한다면 결제 한다
        // 집으로 간다.
    }
}
