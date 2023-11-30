package ch02_operator;

public class Ex01_ArithmeticOperator {

	public static void main(String[] args) {
		// 산술 연산자
		/*
		 * num1, num2 두 개의 정수형 변수를 선언하고 값은 마음대로 두 변수의 +, -, *, /, % 연산 결과를 print()를 활용하여
		 * 출력하기 출력방법 System.out.println(num1 + num2);
		 */

		// 데이터 타입이 같은 경우
		// int num1 = 9, num2 = 7;
		// 이런 식으로도 가능하다

		int num1 = 9;
		int num2 = 7;

		// 연산식 중에 문자열이 하나라도 포함되면 모든 변수를 문자열로 인식한다.

		System.out.println("덧셈 결과 : " + num1 + num2);
		System.out.println("덧셈 결과 : " + (num1 + num2));
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2); // 몫을 출력
		System.out.println(num1 % num2); // 나머지를 출력

		// 계산 결과를 담을 변수 활용
		int result = 0;
		result = num1 + num2;
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);
		result = num1 * num2;
		System.out.println(result);
		result = num1 / num2;
		System.out.println(result);
		result = num1 % num2;
		System.out.println(result);

		// 계산 결과 변수를 따로 선언
		int sumResult = num1 + num2;
		System.out.println(sumResult);
		int subResult = num1 - num2;
		System.out.println(subResult);
		int mulResult = num1 * num2;
		System.out.println(mulResult);
		int divResult = num1 / num2;
		System.out.println(divResult);
		int remainResult = num1 % num2;
		System.out.println(remainResult);

	}
}
