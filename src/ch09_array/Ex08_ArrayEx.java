package ch09_array;

import java.util.Scanner;

public class Ex08_ArrayEx {
    public static void main(String[] args) {
        /**
         * 스캐너로 입력받은 숫자의 크기를 갖는 배열을 만들어 봅시다.
         * 예를 들어 5를 입력하면
         * 크기가 5인 배열이 만들어져야 한다.
         */

        //나의 풀이
        int[] arr = null;
        Scanner scn = new Scanner(System.in);

        System.out.println("배열의 크기를 입력하세요.");
        int size = scn.nextInt();

        arr = new int[size];

        System.out.println("배열의 크기는 " + arr.length + "입니다.");

        //선생님 풀이
//        int[] arr = null;
//        Scanner scn = new Scanner(System.in);
//        System.out.println("배열의 크기 : ");
//        int size = scn.nextInt();
//        if(size > 0){
//            arr = new int[size];
//            System.out.println("numbers = "+arr.length);
//        }else{
//            arr=null;
//            System.out.println("배열이 선언되지 않았습니다.");
//        }


    }
}
