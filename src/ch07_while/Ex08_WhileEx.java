package ch07_while;

import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {


        boolean run = true;
        int totalIns = 0; //잔고

        Scanner scn = new Scanner(System.in);

        while (run) {

            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고  | 4.종료  ");
            System.out.println("----------------------------------");

            System.out.print("선택>");
            int num = scn.nextInt();

            if (num == 1) {
                System.out.print("예금액>");
                int insert = scn.nextInt();
                totalIns += insert;
                System.out.println("현재 잔액은 " + totalIns + "원입니다.");
            } else if (num == 2) {
                System.out.print("출금액>");
                int withdraw = scn.nextInt();
                     if (withdraw > totalIns) {
                        System.out.println("잔고가 부족합니다.");
                     } else {
                        totalIns -= withdraw;
                     }
                System.out.println("현재 잔액은 " + totalIns + "원입니다.");
            } else if (num == 3) {
                System.out.println("현재 잔액은 " + totalIns + "원입니다.");
            } else if (num == 4) {
                System.out.println("종료합니다.");
                run = false;
            }
        }
    }
}
