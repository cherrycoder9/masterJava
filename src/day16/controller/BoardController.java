package day16.controller;

import day16.model.dao.BoardDao;
import day16.model.dto.BoardDto;
import day16.model.dto.ReplyDto;

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
    } // bPrint 함수 종료

    // 5. 게시물 쓰기 함수
    public boolean bWrite(String title, String content) {
        // 현재 로그인된 회원의 회원 번호를 가져옴
        int loginMno = MemberController.mControl.loginMno;
        // BoardDto 객체 생성 및 데이터 설정
        BoardDto boardDto = new BoardDto();
        boardDto.setBtitle(title); // 게시물 제목 설정
        boardDto.setBcontent(content); // 게시물 내용 설정
        boardDto.setMno(loginMno); // 작성자 회원 번호 설정
        // BoardDto를 DAO에게 전달 후 결과 받기
        return BoardDao.getInstance().bWrite(boardDto);
    } // bWrite 함수 종료

    // 6. 게시물 개별 조회 함수
    public BoardDto bView(int bno) {
        // 게시물 번호(bno)를 사용하여 DAO에게 게시물 조회 요청
        return BoardDao.getInstance().bView(bno);
    } // bView 함수 종료

    // 게시물 삭제
    public boolean bDelete(int bno) {
        // 현재 로그인된 회원의 회원 번호를 가져옴
        int mno = MemberController.mControl.loginMno;
        // 게시물 번호(bno)와 회원 번호(mno)를 사용하여 DAO에게 게시물 삭제 요청
        boolean result = BoardDao.getInstance().bDelete(bno, mno);
        // 삭제 결과 반환
        return result;
    } // bDelete 함수 종료

    // 게시물 수정
    public boolean bUpdate(int bno, String title, String content) {
        // 현재 로그인된 회원의 회원 번호를 가져옴
        int mno = MemberController.mControl.loginMno;
        BoardDto boardDto = new BoardDto();
        boardDto.setBtitle(title); // 게시물 제목 설정
        boardDto.setBcontent(content); // 게시물 내용 설정
        boardDto.setMno(mno); // 작성자 회원 번호 설정
        boardDto.setBno(bno); // 게시물 번호 설정
        // BoardDto를 DAO에게 전달 후 결과 받기
        return BoardDao.getInstance().bUpdate(boardDto);
    } // bUpdate 함수 종료

    // 9. 댓글 출력 함수
    public ArrayList<ReplyDto> rPrint(int bno) {
        return BoardDao.getInstance().rPrint(bno);
    }

    // 10. 댓글 쓰기 함수
    public boolean rWrite(String rcontent, int bno) {
        int loginMno = MemberController.mControl.loginMno;
        ReplyDto reply = new ReplyDto();
        reply.setRcontent(rcontent);
        reply.setBno(bno);
        reply.setMno(loginMno);
        return BoardDao.getInstance().rWrite(reply);
    }

    // 12. 게시물 검색 함수
    public ArrayList<BoardDto> search(String keyword) {
        return BoardDao.getInstance().search(keyword);
    }


} // BoardController 클래스 종료
