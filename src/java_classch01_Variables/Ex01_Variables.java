package java_classch01_Variables;

public class Ex01_Variables {

	public static void main(String[] args) {
		// 본인의 이름 나이 키 주소 전화번호를 입력할 수 있는 변수를 각각 선언해봅시다.
		String name = "문설하";
		int age = 27;
		double height = 156.0;
		String address = "인천 부평구";
		String mobile = "010-7530-8408";

		// 변수값 출력
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(address);
		System.out.println(mobile);

		System.out.println("제 이름은 " + name);
		System.out.println("제 이름은 " + name + "입니다.");

	}
}
