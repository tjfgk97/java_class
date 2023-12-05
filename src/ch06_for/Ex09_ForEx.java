package ch06_for;

public class Ex09_ForEx {
    public static void main(String[] args) {
        /*
         * 4x + 5y = 60 을 만족하는 x, y값을 출력
         * x,y는 1이상 10 이하인 정수
         *
         * 출력(정답)
         * 5, 8, 10, 4
         * */


        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int ans = ((4 * x) + (5 * y));
                if (ans == 60) {
                    System.out.print("x = " + x);
                    System.out.println("," + ". y = " + y);
                }
            }
        }
    }
}
