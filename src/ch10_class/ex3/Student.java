package ch10_class.ex3;

public class Student {
    //필드 선언
    String studentName;
    String studentMajor;
    String studentMobile;

    //기본 생성자
    public Student() {
        System.out.println("Student 기본 생성자");
    }

    // 매개변수가 있는 생성자
    public Student(String studentName) {
        System.out.println("name을 매개변수로 하는 생성자");
        System.out.println("studentName = " + studentName);
    }

    // 매개변수가 2개 있는 생성자
    public Student(String studentName, String studentMajor) {
        System.out.println("studentName = " + studentName + ", studentMajor = " + studentMajor);
    }

    // 매개변수가 3개 있는 생성자
    public Student(String studentName, String studentMajor, String studentMobile) {
        System.out.println("studentName = " + studentName + ", studentMajor = " + studentMajor + ", studentMobile = " + studentMobile);
    }
}
