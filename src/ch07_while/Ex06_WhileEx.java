package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
        int count = 0;
        double sum = 0;
        boolean run = true;
        Scanner scn = new Scanner(System.in);
        while (run) {

            int num = scn.nextInt();
            sum += num;
            if (num == 0) {
                System.out.println("입력한 숫자는 " + count + "개입니다.");
                double avg = sum / count;
                System.out.println("평균은 " + avg + "입니다.");
                run = false;
            }
            count += 1;

        }
    }
}
