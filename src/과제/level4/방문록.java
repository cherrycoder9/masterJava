package 과제.level4;

/*
    주제 : '방문록' 을 설계하고 만들기
    [ 클래스 생성 ]
    멤버변수/필드 : 방문록번호 , 내용 , 작성일 , 작성자
    - 위 필드을 적절한 자료형을 선택하여 설계하시오.
    [ 객체 생성 ]
    임의의 데이터를 입력하여 2개의 객체를 생성하고 출력하는 코드를 작성하시오.
*/

import java.time.LocalDate;

public class 방문록 {
    // 멤버변수
    static int cnt;
    private int 방문록번호;
    private String 내용;
    private String 작성일;
    private String 작성자;

    // 생성자
    방문록() {
        cnt++;
        방문록번호 = cnt;
        LocalDate today = LocalDate.now();
        작성일 = today.toString();
    }

    방문록(String 내용, String 작성자) {
        this.내용 = 내용;
        this.작성자 = 작성자;
        cnt++;
        방문록번호 = cnt;
        LocalDate today = LocalDate.now();
        작성일 = today.toString();
    }

    // 메소드
    public void 방문록출력() {
        System.out.println("방문록번호: " + 방문록번호);
        System.out.println("내용: " + 내용);
        System.out.println("작성일: " + 작성일);
        System.out.println("작성자: " + 작성자);
    }
}
