package ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		/*
		 * 서로 같은 정수 3개를 입력받아서 가장 큰 정수 출력하기 (같은 숫자는 입력하지 않는다고 가정) 입력 예 첫 번째 숫자: 두 번째 숫자:
		 * 세 번째 숫자:
		 * 
		 * 출력 예 가장 큰 숫자는 00입니다.
		 */

		Scanner scn = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = scn.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = scn.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		int num3 = scn.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + "이 가장 크다.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + "이 가장 크다.");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + "이 가장 크다.");
		}

		int max = 0;
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			}
		} else {
			if (num2 > num3) {
				max = num3;
			} else {
				max = num3;
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		System.out.println("추가된 부분입니다.");
		System.out.println("추가된 부분입니다.2");
	}
}
