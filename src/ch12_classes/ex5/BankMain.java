package ch12_classes.ex5;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        boolean run = true;
        int select = 0;

        BankService bankService = new BankService();

        while (run) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("1.고객등록 | 2.잔액조회 | 3.입금 | 4.출금 | 5.거래내역확인 | 6.계좌이체 | 0.종료");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("번호를 선택하세요.");
            System.out.print("입력>");
            select = scn.nextInt();

            if (select == 1) {
                bankService.save();
            } else if (select == 2) {
                bankService.inquiry();
            } else if (select == 3) {
                bankService.deposit();
            } else if (select == 4) {

            } else if (select == 5) {

            } else if (select == 6) {

            } else if (select == 0) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }
        }
    }
}