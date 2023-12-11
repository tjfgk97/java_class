package ch10_class.ex04;

public class Student {
    // 이름(studentName), 학번(studentNumber), 학과(studentMajor) 필드

    String studentName;
    String studentNumber;
    String studentMajor;

    // 기본생성자
    public Student() {
        System.out.println("기본 생성자");
    }

    //이름, 학번, 학과를 매개변수로 하는 생성자
    public Student(String studentName, String studentNumber, String studentMajor) {
//        System.out.println("studentName = " + studentName + ", studentNumber = " + studentNumber + ", studentMajor = " + studentMajor);

        //전달받은 매개변수 값을 필드에 담기
        this.studentName = studentName; // this가 붙으면 필드를 가리킨다고 생각하면 된다.
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
    }
}
