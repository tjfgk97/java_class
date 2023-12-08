package ch09_array;

import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {
        /**
         * 거스름돈 계산하기
         * 필요한 거스름돈을 입력했을 때 각 동전별로 몇 개가 필요한지 계산
         * 예)
         * 170이라고 입력하면
         * 100원 1개
         * 50원 1개
         * 10원 2개
         *
         * 780이라고 입력하면
         * 500원 1개
         * 100원 2개
         * 50원 1개
         * 10원 5개
         */

        int[] coin = {500, 100, 50, 10};
        Scanner scn = new Scanner(System.in);

        System.out.println("거스름돈을 입력하세요.");
        int money = scn.nextInt();
        int count = 0;
        //거스름돈/동전 = 몫(개수)
        for (int i = 0; i < coin.length; i++) {
            count = money / coin[i];
            System.out.println(coin[i] + "원 동전 : " + count + "개");
            // 나머지를 다음 번 계산에 활용
            money = money % coin[i];
        }


//        for (int i = 0; i < coin.length; i++) {
//            int share = money / coin[i];
//             int remain = money % coin[i];
//            if (share != 0) {
//                System.out.println(share + "개");
////                (share * coin[i]);
//                money = money - coin[i];
//                System.out.println((money - coin[i]));
//            }
//        }
    }
}
