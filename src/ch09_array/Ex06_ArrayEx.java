package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */

        int[] arr = new int[5];
        int max = arr[0];

        Scanner scn = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");

        for (int i = 0; i < arr.length; i++) {

            int arr1 = scn.nextInt();
            if (arr1 > max) {
                arr[i] = arr1;
                max = arr1;
            }
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
    }
    
//      선생님 풀이(선언한 max의 값이 다르다.)
//    int max = 0;
//    for(int i =0; i<arr.length; i++){
//        arr[i] = scn.nextInt();
//        if(max < arr[i]){
//         max = arr[i];
//        }
//    }
}
