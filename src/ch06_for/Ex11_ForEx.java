package ch06_for;

public class Ex11_ForEx {
    public static void main(String[] args) {
        /**
         * 별찍기
         * 출력
         */

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}
