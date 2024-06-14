package day07.step3;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account myAccount = new Account("32829-012454", 10000);

        while (true) {
            System.out.println("==============================");
            System.out.print("1.예금 2.출금 3.잔고 4.종료 : ");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    deposit(scanner, myAccount);
                    break;
                case 2:
                    withdraw(scanner, myAccount);
                    break;
                case 3:
                    checkBalance(myAccount);
                    break;
                case 4:
                    System.out.println("종료");
                    return;
                default:
                    System.out.println("알수없는 번호 입니다.");
            }
        }
    }

    private static void deposit(Scanner scanner, Account account) {
        System.out.println("예금처리");
        System.out.print("예금할 금액 입력 : ");
        long amount = scanner.nextLong();
        account.deposit(amount);
    }

    private static void withdraw(Scanner scanner, Account account) {
        System.out.println("출금처리");
        System.out.print("출금할 금액 입력 : ");
        long amount = scanner.nextLong();
        if (account.withdraw(amount)) {
            System.out.println("출금 완료");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    private static void checkBalance(Account account) {
        System.out.println("잔고확인처리");
        System.out.println("현재 잔고: " + account.getBalance());
    }
}
