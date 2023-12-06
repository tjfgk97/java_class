package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번 만에 맞췄는지를 출력해줌
         */

//        System.out.println(((int) (Math.random() * 100) + 1));

        int number = ((int) (Math.random() * 100) + 1);
        int times = 0;
        System.out.println("Up & Down");
        while (true) {
            times += 1;
            Scanner scn = new Scanner(System.in);
            System.out.println("숫자를 입력하세요.");
            int num1 = scn.nextInt();
            if (num1 < number) {
                System.out.println("UP");
            } else if (num1 > number) {
                System.out.println("DOWN");
            } else {
                System.out.println("정답입니다.");
                System.out.println("시도횟수는 " + times +"회입니다.");
                break;
            }

        }
    }
}
