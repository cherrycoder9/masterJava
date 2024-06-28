package day16.controller;

import day16.model.dao.MemberDao;
import day16.model.dto.MemberDto;

// 회원 관련 로직 처리 컨트롤러
public class MemberController {

    // 공유 MemberController 인스턴스
    public static MemberController mControl = new MemberController();
    public int loginMno = 0;

    // 2-1. 로그인 성공한 회원의 번호 저장하는 멤버변수
    // 왜 필요한가? 글쓰기나 댓글쓰기 할때, 현재 로그인된 회원을 식별하기 위해서
    // 초기값0은 비로그인 상태, 1이상이면 로그인된 회원번호

    // 회원가입 처리 메서드
    public boolean signup(MemberDto memberDto) {
        // 아이디 중복검사
        boolean result = MemberDao.mDao.signup(memberDto);
        return result;
    }

    // 2-2. 로그아웃 함수
    public void logout() {
        loginMno = 0;
    }

    // 2. 회원수정 함수
    // 로그인된 회원이름과 회원연락처를 수정 구현
    public boolean mUpdate(String newName, String newPhone) {
        return MemberDao.mDao.mUpdate(newName, newPhone, loginMno);
    }

    // 로그인 처리 메서드
    public boolean login(MemberDto memberDto) {
        loginMno = MemberDao.mDao.login(memberDto);
        System.out.println(loginMno);
        return loginMno == 0 ? false : true;
    }

    // 아이디 찾기 처리 메서드
    public String findId(MemberDto memberDto) {
        return MemberDao.mDao.findId(memberDto);
    }

    // 비밀번호 찾기 처리 메서드
    public String findPwd(MemberDto memberDto) {
        return MemberDao.mDao.findPwd(memberDto);
    }

    // 회원 탈퇴
    public boolean mDelete(String confirmPwd) {
        // view로부터 받은 확인비밀번호와 로그인된 회원번호를 Dao에게 전달
        return MemberDao.mDao.mDelete(confirmPwd, loginMno);
    }
}