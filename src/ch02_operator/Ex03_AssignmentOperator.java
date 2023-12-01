package ch02_operator;

public class Ex03_AssignmentOperator {
	public static void main(String[] args) {
		int num1 = 10, num2 = 7;
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		// 대입 연산자 활용
		num1 += num2; //num1에 num2를 계속 더한다.(num2는 변동 없음)
		System.out.println("num1 :" + num1 + " num2 : " + num2);// 17 , 7
		num1 += num2;
		System.out.println("num1 :" + num1 + " num2 : " + num2);// 24 , 7
		num1 -= num2;
		System.out.println("num1 :" + num1 + " num2 : " + num2);// 17 , 7
		num1 *= num2;
		System.out.println("num1 :" + num1 + " num2 : " + num2);// 119 , 7
		num1 /= num2;
		System.out.println("num1 :" + num1 + " num2 : " + num2);// 17 , 7
		
		//num1은 계속 값이 바뀌며 새로 선언되기 때문에 위와 같은 결과가 나온다.
	}
}
