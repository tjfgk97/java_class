package ch08_string;

import java.util.Scanner;

public class Ex02_String {
    public static void main(String[] args) {


        boolean run = true;
        String end = "종료";
        Scanner scn = new Scanner(System.in);
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");

        while (run) {

            System.out.print(">");
            String str = scn.nextLine();
            System.out.println(str);

            if (str.equals(end)) {
                run = false;
            }
        }

    }
}
