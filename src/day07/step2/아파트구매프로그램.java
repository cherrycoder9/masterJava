package day07.step2;

public class 아파트구매프로그램 {
    public static void main(String[] args) {
        아파트설계도 유재석집 = new 아파트설계도("초코파이");
        아파트설계도 강호동집 = new 아파트설계도("쓰레기");
        유재석집.암호저장("1234");
        강호동집.암호저장("1234");
        System.out.println("유재석집.음식꺼내기() = " + 유재석집.음식꺼내기("1234"));
        System.out.println("강호동집.음식꺼내기() = " + 강호동집.음식꺼내기("1234"));
    }
}
