package ch16_exception;

public class Ex02_Exception {
    public static void main(String[] args) {
        // 아래 코드 실행 시 발생하는 예외를 확인하고 예외 발생 시 0으로 나눌 수 없습니다 가 출력되도록

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace(); // 어떤 예외가 떴는지 확인 가능
        }
    }
}
