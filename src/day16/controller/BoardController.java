package day16.controller;

import day16.model.dao.BoardDao;
import day16.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    // ======== 싱글톤 만들기 ==========
    // 싱글톤: 프로그램내 해당 클래스의 하나의 객체만 갖는 패턴
    // 1. 스태틱 변수에 해당 클래스의 객체 생성해서 대입, private
    private static BoardController bControl = new BoardController();

    // 2. 해당 클래스의 생성자를 private 한다. 다른 클래스에서 new 사용하지 못하게 차단
    private BoardController() {

    }

    // 3. 해당 객체(싱글톤)를 외부로부터 접근할 수 있도록 간접(추후 유효성 검사) 호출 메소드 생성
    public static BoardController getInstance() {
        return bControl;
    }

    // 4. 게시판 (게시물 전체 출력) 함수
    public ArrayList<BoardDto> bPrint() {
        // DAO 에게 전체 게시물 조회 요청
        return BoardDao.getInstance().bPrint();
    }

    // 5. 게시물 쓰기 함수
    public boolean bWrite(String title, String content) {
        int loginMno = MemberController.mControl.loginMno;
        BoardDto boardDto = new BoardDto();
        boardDto.setBtitle(title);
        boardDto.setBcontent(content);
        boardDto.setMno(loginMno);
        // BoardDto를 다오에게 전달후 결과 받기
        return BoardDao.getInstance().bWrite(boardDto);
    }

    // 6. 게시물 개별 조회 함수
    public BoardDto bView(int bno) {
        return BoardDao.getInstance().bView(bno);
    }
}
