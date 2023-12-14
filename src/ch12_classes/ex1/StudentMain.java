package ch12_classes.ex1;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        boolean run = true;
        int selectNo = 0;

        while (run) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1..method1 호출 | 2.method2 호출 | 3.method3 호출 | 4.종료");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택>");
            selectNo = scn.nextInt();

            if (selectNo == 1) {

            } else if (selectNo == 2) {

            } else if (selectNo == 3) {

            } else if (selectNo == 4){
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }
        }

    }
}
