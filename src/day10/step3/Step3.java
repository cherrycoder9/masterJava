package day10.step3;

import java.util.ArrayList;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        // 229페이지 코드 주석처리ㅏ
        Scanner scanner = new Scanner(System.in);

        // 학생목록 리스트 생성
        ArrayList<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("1.학생등록 2.점수등록 3.점수확인 4.학생삭제");
            System.out.print("메뉴 선택: ");

            int ch = scanner.nextInt();
            if (ch == 1) {
                // 학생등록
                // 학번을 입력받는다
                System.out.print("학번을 입력하세요: ");
                int studentID = scanner.nextInt();
                // 이름을 입력받는다
                System.out.print("이름을 입력하세요: ");
                String studentName = scanner.next();
                // 학번과 이름으로 학생 객체를 생성한다.
                Student newStudent = new Student(studentID, studentName);
                // 학생 객체를 학생 리스트에 추가한다.
                studentList.add(newStudent);
                // studentList.get(0).showStudentInfo();
            }
            if (ch == 2) {
                // 점수등록
                // 학번을 입력받는다
                System.out.print("학번을 입력하세요: ");
                int studentID = scanner.nextInt();
                boolean found = false;
                // 동일한 학번을 학생리스트에서 찾는다
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).studentID == studentID) {
                        // 찾았으면 과목명과 점수를 입력받는다.
                        System.out.print("과목명을 입력하세요: ");
                        String subjectName = scanner.next();
                        System.out.print("점수를 입력하세요: ");
                        int scorePoint = scanner.nextInt();
                        // 해당하는 학생의 addSubject 메서드를 실행한다
                        studentList.get(i).addSubject(subjectName, scorePoint);
                        found = true;
                        break;
                    }
                }
                // 찾지 못했으면 안내메시지를 띄운다.
                if (!found) {
                    System.out.println("입력하신 학번이 없습니다.");
                }
            }
            if (ch == 3) {
                // 점수확인

            }
            if (ch == 4) {
                // 학생삭제

            }

        }

        /*
         *   [학생등록]
         *       1. 학번과 이름을 입력받아 학생객체 생성후 학생목록 리스트에 저장하기
         *       - 학생목록 리스트를 만들어주세요.
         *   [점수등록]
         *       1. 학번을 입력받아 동일한 학번이 있을경우
         *       2. 과목명과 점수를 입력받아 해당 학번 학생의 (subject)점수리스트 점수 추가하기
         *   [점수확인]
         *       1. 학번을 입력받아 동일한 학번이 있을 경우
         *       2. 해당 학번의 학생의 모든 점수리스트를 출력
         * */

        /*
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        studentLee.showStudentInfo();
        System.out.println("===================================");
        studentKim.showStudentInfo();
        */
    }
}
