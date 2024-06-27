package day16.controller;

import day16.model.dao.MemberDao;
import day16.model.dto.MemberDto;

// 회원 관련 비즈니스 로직 처리 컨트롤러
public class MemberController {

    // 공유 MemberController 인스턴스
    public static MemberController mControl = new MemberController();

    // 회원가입 처리 메서드
    public boolean signup(MemberDto memberDto) {
        // 아이디 중복검사
        boolean result = MemberDao.mDao.signup(memberDto);
        return result;
    }

    // 로그인 처리 메서드
    public boolean login(MemberDto memberDto) {
        return MemberDao.mDao.login(memberDto);
    }

    // 아이디 찾기 처리 메서드
    public String findId(MemberDto memberDto) {
        return MemberDao.mDao.findId(memberDto);
    }

    // 비밀번호 찾기 처리 메서드
    public String findPwd(MemberDto memberDto) {
        return MemberDao.mDao.findPwd(memberDto);
    }
}