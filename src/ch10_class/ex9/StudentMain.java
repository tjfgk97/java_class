package ch10_class.ex9;

public class StudentMain {
    public static void main(String[] args) {

        // 기본생성자로 Student 클래스 객체 만들고 setter를 이용하여 필드값 채우기
        Student student = new Student();
        student.setStudentName("학생1");
        student.setStudentNumber("231212");
        student.setStudentMajor("컴퓨터공학");
        student.setStudentMobile("010-1111-1111");

//        System.out.println(student.getStudentName());
//        System.out.println(student.getStudentNumber());
//        System.out.println(student.getStudentMajor());
//        System.out.println(student.getStudentMobile());

        // 모든 필드를 매개변수로 하는 생성자로 Student 클래스 객체 만들기
        Student student1 = new Student("학생2","20231212","경영학","010-2222-2222");

        // 각각의 객체에서 print 메서드 호출하여 필드값 출력

        student.print();


    }
}
