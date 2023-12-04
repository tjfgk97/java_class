package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		/*
		 * 정수 하나를 입력받아서 양수, 음수, 0인지를 출력하라*/
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scn.nextInt();
		
		if(num > 0) {
			System.out.println("입력한 숫자는 양수입니다.");
		}else if(num <0) {
			System.out.println("입력한 숫자는 음수입니다.");
		}else {
			System.out.println("입력한 숫자는 0입니다.");
		}
		
		
	}

}
