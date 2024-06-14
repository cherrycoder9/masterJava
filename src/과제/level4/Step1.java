package 과제.level4;

public class Step1 {
    public static void main(String[] args) {
        /*
        주제 : 용어 정의하기
        1. 객체 란 ?
        2. 클래스 란 ?
        3. 멤버변수/필드/속성/특성 이란?
        4. 지역변수 와 멤버변수의 차이점을 서술하시오.
        */

        String 객체란 = "데이터와 그 데이터를 처리하는 메서드들을 하나로 묶어 놓은 구성요소";
        String 클래스란 = "객체를 정의하기 위한 설계도나 청사진. 객체가 가져야 할 속성과 행동을 정의함";
        String 멤버변수_필드_속성_특성이란 =
                "클래스 내부에 정의된 변수" +
                        "클래스의 인스턴스가 생성될 때마다 멤버변수가 메모리에 할당됨";
        String 지역변수_멤버변수_차이점_서술 = "";
        /*
         * [지역변수]
         * 메서드, 생성자, 블록 내에서 선언된 변수
         * 선언된 블록 내에서만 유효함
         * 메서드가 종료되면 소멸
         * 초기화하지 않으면 사용불가
         *
         * [멤버변수]
         * 클래스 내부에서 선언된 변수
         * 클래스의 인스턴스가 생성될 때 함께 생성
         * 객체가 소멸하기 전까지 계속 존재
         * 클래스의 모든 메서드에서 접근 가능
         * 기본값으로 초기화될 수 있음 (int:0,String:null)
         * */

    }
}
