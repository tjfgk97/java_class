package ch07_while;

public class Ex07_WhileEx {
    public static void main(String[] args) {
        /*
         * 1 + (-2) + 3 + (-4) + 5 + (-6)처럼
         * 계산을 했을 때 합계가 100이 됐을 때의 숫자를 출력
         * 정답 : 199*/


//      break가 반드시 필요한 걸 같이 써야하는 경우
//      break가 겹쳐서 실행이 되지 않을 수 있기 때문에
//      무한반복 while문을 쓸 때는 boolean 타입 변수 사용하는 것에 익숙해질 것!
        int i = 0;
        int sum = 0;
        boolean run = true;
        while (run) {
            if (sum != 100) {
                i++;
                if (i % 2 == 0) {
                    sum = sum - i;
                } else {
                    sum = sum + i;
                }
            } else {
                run = false;
            }
        }
        System.out.println(i);
    }
}
