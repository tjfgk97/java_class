package ch10_class.ex04;

public class StudentMain {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.studentName = "학생1";
        student1.studentNumber = "111111111";
        student1.studentMajor = "통계학";
        System.out.println("student1.studentName = " + student1.studentName);

        // 매개변수 있는 생성자로 student2 객체 생성
        Student student2 = new Student("학생2", "231211", "컴공");
        System.out.println("student2.studentName = " + student2.studentName);
    }
}