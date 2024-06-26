package day15.step3_MVC;

import java.util.ArrayList;

public class Controller {
    // 정적 필드로 Controller 인스턴스를 생성
    static Controller controller = new Controller();

    // 회원 등록을 처리하는 메서드
    // 매개변수: 등록할 회원 이름
    // 반환값: 등록 성공 여부
    public boolean signupC(String name) {
        System.out.println("Controller.signupC");
        boolean result = Dao.dao.signupC(name);
        return result;
    }

    // 모든 회원 목록을 조회하는 메서드
    // 매개변수: 없음
    // 반환값: 회원 이름 목록
    public ArrayList<String> printC() {
        System.out.println("Controller.printC");
        ArrayList<String> result = Dao.dao.printC();
        return result;
    }

    // 회원 정보를 수정하는 메서드
    // 매개변수: 기존 이름, 새로운 이름
    // 반환값: 수정 성공 여부
    public boolean updateC(String oldName, String newName) {
        System.out.println("Controller.updateC");
        boolean result = Dao.dao.updateC(oldName, newName);
        return result;
    }

    // 회원을 삭제하는 메서드
    // 매개변수: 삭제할 회원 이름
    // 반환값: 삭제 성공 여부
    public boolean deleteC(String name) {
        System.out.println("Controller.deleteC");
        boolean result = Dao.dao.deleteC(name);
        return result;
    }
}