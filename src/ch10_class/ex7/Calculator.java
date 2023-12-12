package ch10_class.ex7;

import java.util.Scanner;

public class Calculator {
    /**
     * 덧셈 메서드
     * method name: sum
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 합을 출력
     */

    Scanner scn = new Scanner(System.in);

    public void sum(int param1, int param2) {
        int sum = param1 + param2;
        System.out.println("결과 : " + sum);
    }

    /**
     * 뺄셈 메서드
     * method name: sub
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 차를 출력
     */
    public void sub(int param1, int param2) {
        int sub = param1 - param2;
        System.out.println("결과 : " + sub);
    }

    /**
     * 곱셈 메서드
     * method name: mul
     * parameter: int 타입 2개
     * return: int 타입
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 곱 결과를 리턴
     */
    public int mul(int param1, int param2) {
        int mul = param1 * param2;
        return mul;
    }

    /**
     * 나눗셈 메서드
     * method name: div
     * parameter: 없음
     * return: int 타입
     * 실행내용
     * - 스캐너로 나눗셈에 필요한 정수 2개를 입력받음
     * - 나눗셈 결과를 리턴
     */

    public int div() {
        System.out.print("첫 번째 숫자>");
        int num1 = scn.nextInt();
        System.out.print("두 번째 숫자>");
        int num2 = scn.nextInt();
        int div = num1 / num2;
        return div;
    }
}
