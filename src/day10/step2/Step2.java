package day10.step2;

import java.util.ArrayList;

public class Step2 {
    public static void main(String[] args) {
        // 문자열 10개 저장, 배열은 고정길이, 길이보다 커지거나 작아지면 복잡해진다
        String[] strArray = new String[10];
        strArray[0] = "자바";
        strArray[1] = "파이썬";

        // 문자열 N개 저장, 가변길이,
        // ArrayList<타입> 리스트변수명 = new ArrayList<>();
        // <String> <Integer> <Double> 래퍼 클래스
        // 기본자료형은 리터럴만 다루기 때문에 추가적인 기능/속성을 다루기 위해 클래스화
        // 사용자 정의 타입 클래스: Array<Member> 리스트변수명 = new ArrayList<>();
        // 사용자 정의 타입: 내가 만든 클래스
        // 제네릭
        // 리스트 내 요소 추가
        // 리스트변수명.add(객체); // 해당 객체를 리스트내 추가
        // 리스트내 요소 호출
        // 리스트변수명.get(인덱스); // 해당 인덱스의 요소(객체) 반환
        // 리스트 내 요소 삭제
        // 리스트변수명.remove(인덱스); // 해당 인덱스의 요소(객체) 삭제
        // 리스트 내 요소 전체 삭제
        // 리스트변수명.clear();
        // 삭제된 후 한칸씩 당겨짐
        // 리스트 내 요소 총개수
        // 리스트변수명.size(); // 리스트 내 요소 총 개수 반환
        // 리스트 내 요소 찾기
        // strList.indexOf(값 또는 객체); // 리스트 내 또는 객체가 존재하면 찾은 인덱스 반환 없으면 -1
        // strList.contains(); // 리스트내 값 또는 객체가 존재하면 true 없으면 false
        // 리스트 내 비어있는지 확인
        // 리스트변수명.isEmpty(); // 리스트내 요소가 하나도 없으면 true, 한개라도 있으면 false 반환
        
        ArrayList<String> strList = new ArrayList<>(); // 기본길이는 10개
        strList.add("자바");
        strList.add("파이썬");

        // 224페이지 코드
        ArrayList<Book> library = new ArrayList<>();
        Book b1 = new Book("태백산맥", "조정래");
        library.add(b1);

        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("어떻게 살 것인가", "유시민"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생텍쥐페리"));

        // 리스트 순회하는 방법1
        // for (int 반복변수명 = 0; i < 리스트.size(); i++) { }
        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            System.out.println(book);
        }

        // 리스트 순회하는 방법2 (향상된 for문)
        for (Book book : library) { // for(타입 반복명 : 리스트) { }
            // 리스트내 요소를 하나씩 변수에 대입하면서 반복
            System.out.println(book);
        }

        // 리스트 순회하는 방법3 (forEach 함수 - 스트림 함수)
        // 리스트명.forEach(반복변수명=>실행문);
        library.forEach(book -> System.out.println(book));

        // 리스트 순회하는 방법4
        library.forEach(System.out::println);


    }
}
