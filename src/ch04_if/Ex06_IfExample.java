package ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		/*
		 * 정수 하나를 입력받아서 3의 배수인지 5의 배수인지 또는 3과 5의 공배수인지 아무것도 아닌지를 출력하라
		 */

		Scanner scn = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int num = scn.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("입력한 숫자는 3과 5의 공배수입니다.");
		} else if (num % 5 == 0) {
			System.out.println("입력한 숫자는 5의 배수입니다.");
		} else if (num % 3 == 0) {
			System.out.println("입력한 숫자는 3의 배수입니다.");
		} else {
			System.out.println("입력한 숫자는 어느 것에도 속하지 않습니다.");
		}
	}
}
