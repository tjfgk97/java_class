package ch12_classes.ex1;

public class StudentRepository {

    public void method1() {
        System.out.println("StudentRepository.method1");
    }

    /**
     * method name : method2
     * parameter : String
     * return : x
     * 실행 내용 : 전달받은 매개변수 값 출력
     */
    public void method2(String str1) {
        System.out.println("str1 = " + str1);
    }

    /**
     *
     */
    public void method3() {
        System.out.println("StudentRepository.method3");
        System.out.println("키보드에 물 뭐야ㅕ 이거");
    }
}
