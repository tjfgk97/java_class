package ch07_while;

public class Ex02_WhileEx {
    public static void main(String[] args) {
        /**
         * while 문으로 1부터 10까지의 합계 출력
         * 출력
         * 1+2+3+4+5+6+7+8+9+10=55
         */

//        내가 작성한 코드
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("1+2+3+4+5+6+7+8+9+10=" + sum);


//        선생님이 작성한 코드
//        while (i <= 10) {
//            System.out.print(i);
//            sum = sum + i;
//            if(i <10){
//                System.out.print("+");
//            }else{
//                System.out.print("=");
//            }
//            i++;
//        }
//        System.out.println(sum);
    }
}
