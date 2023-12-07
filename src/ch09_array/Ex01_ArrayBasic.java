package ch09_array;

public class Ex01_ArrayBasic {
    public static void main(String[] args) {
        // 크기가 5인 정수형 배열 numbers1
        int[] numbers1 = new int[5];
        System.out.println("numbers1[0] = " + numbers1[0]);
        numbers1[0] = 100;
        System.out.println("numbers1[0] = " + numbers1[0]);
        // 배열의 크기 확인
        System.out.println(numbers1.length);

        // 크기가 3인 String 배열 strings1
        String[] String1 = new String[3];
        System.out.println("String1[1] = "+String1[1]);

        //크기가 10인 실수형 배열 doubles1
        double[] doubles1 = new double[10];
        System.out.println("doubles1[0] = " + doubles1[0]);

        //정수형 배열 number2 이름만 선언하고 다 줄에 크기 8을 지정하여 배열 선언
        int[] numbers2 = null;
        numbers2 = new int[8];
        System.out.println("numbers2[0] = " + numbers2[0]);

        //10, 20, 30, 40이 들어있는 numbers3 배열 선언
        int[] numbers3 = {10, 20, 30, 40};

        // "가", '나, "다", "라"가 들어있는 strings2 배열 선언
        String[] strings2 = {"가","나","다","라"};
    }
}
