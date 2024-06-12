package day05;

public class Step1 {
    public static void main(String[] args) {
        int age = 9;
        int charge;
        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동입니다.");
        } else if (age < 14) {
            charge = 1500;
            System.out.println("초등학생입니다.");
        } else if (age < 20) {
            charge = 2000;
            System.out.println("중고등학생입니다.");
        } else {
            charge = 2500;
            System.out.println("성인입니다.");
        }
        System.out.printf("입장료는 %d원 입니다.\n", charge);

        int ranking = 1;
        char medalColor;

        switch (ranking) { // switch (검사대상)
            case 1: // case 검사결과: 실행문;
                medalColor = 'G';
                break;
            case 2: // case 검사결과: 실행문;
                medalColor = 'S';
                break;
            case 3: // case 검사결과: 실행문;
                medalColor = 'B';
                break;
            default: // 그외 실행문
                medalColor = 'A';
        }
        System.out.println("medalColor = " + medalColor);

        if (ranking == 1) {
            medalColor = 'G';
        } else if (ranking == 2) {
            medalColor = 'S';
        } else if (ranking == 3) {
            medalColor = 'B';
        } else {
            medalColor = 'A';
        }
        System.out.println("medalColor = " + medalColor);

        String myMedal = "Gold";
        switch (myMedal) {
            case "Gold":
                System.out.println("금메달입니다.");
                break;
            case "Silver":
                System.out.println("은메달입니다.");
                break;
            case "Bronze":
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("메달이 없습니다.");
        }
    }
}