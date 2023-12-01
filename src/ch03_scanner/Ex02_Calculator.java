package ch03_scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {

		/*
		 * 정수 2개를 각각 스캐너로 num1, num2에 입력받아서 입력받은 수의 합을 출력하세요.
		 */

		Scanner scn = new Scanner(System.in);

		System.out.println("2개의 숫자를 입력하세요");
		System.out.print("첫 번째 숫자 : ");
		int num1 = scn.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = scn.nextInt();
		System.out.println("입력한 숫자의 합은 "+(num1 + num2)+"입니다.");

	}

}
