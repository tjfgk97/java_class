package ch09_array;

import java.util.Scanner;

public class Ex03_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행했을 때 스캐너로 정수값을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합, 평균 계산
         */

        int sum = 0;
        int[] num = new int[3];
        Scanner scn = new Scanner(System.in);
        System.out.println("정수 값을 입력하세요.");

        for (int i = 0; i < num.length; i++) {
            int num1 = scn.nextInt();
            num[i] = num1;
            sum += num1;
        }
        System.out.println("총합 = " + sum);
        System.out.println("평균 = " + sum / num.length);

    }
}
