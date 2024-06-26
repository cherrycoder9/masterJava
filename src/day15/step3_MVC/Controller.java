package day15.step3_MVC;

import java.util.ArrayList;

public class Controller {
    // 외부 클래스로부터 내부 메소드를 사용할 수 있도록 만든 스태틱 변수
    static Controller controller = new Controller();

    // 2. 등록 제어 함수, 매개변수: 저장할 값 String, 리턴: 등록성공여부 boolean
    public boolean signupC(String name) {
        System.out.println("Controller.signupC");
        return false;
    }

    // 3. 출력 제어 함수, 매개변수: 없음, 리턴: 회원목록 ArrayList
    public ArrayList<String> printC() {
        System.out.println("Controller.printC");
        return null;
    }

    // 4. 수정 제어 함수, 매개변수: 기존이름 String, 새로운이름 String, 리턴: 수정 성공여부 boolean
    public boolean updateC(String oldName, String newName) {
        System.out.println("Controller.updateC");
        return false;
    }

    // 5. 삭제 제어 함수, 삭제할 이름 String, 리턴: 삭제성공여부 boolean
    public boolean deleteC(String name) {
        System.out.println("Controller.deleteC");
        return false;
    }
}
