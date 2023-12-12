package ch10_class.ex7;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        /**
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
         * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드를 호출하여 결과를 수행함
         */

        boolean run = true;

        Calculator calculator = new Calculator();
        Scanner scn = new Scanner(System.in);

        while (run) {
            System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
            System.out.print("선택>");
            int cal = scn.nextInt();

            if (cal == 1) {
                System.out.print("첫 번째 숫자>");
                int num1 = scn.nextInt();
                System.out.print("두 번째 숫자>");
                int num2 = scn.nextInt();
                calculator.sum(num1, num2);
            } else if (cal == 2) {
                System.out.print("첫 번째 숫자>");
                int num1 = scn.nextInt();
                System.out.print("두 번째 숫자>");
                int num2 = scn.nextInt();
                calculator.sub(num1, num2);
            } else if (cal == 3) {
                System.out.print("첫 번째 숫자>");
                int num1 = scn.nextInt();
                System.out.print("두 번째 숫자>");
                int num2 = scn.nextInt();
                int result = calculator.mul(num1, num2);
                System.out.println("결과 : "+result);
            } else if (cal == 4) {
                 int result = calculator.div();
                System.out.println("결과 : "+result);
            } else {
                System.out.println("보기에 없는 번호입니다.\n실행을 종료합니다.");
                run = false;
            }
        }
    }
}
