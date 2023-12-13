package ch10_class.ex9;

public class Student {
    // 필드, getter/setter, 기본생성자, 매개변수 생성자, toString
    // ↑↑(이 다섯가지가 한 세트로 필수이다!)↑↑

    /*
        필드
        이름(studentName)
        학번(studentNumber)
        학과(studentMajor)
        전화번호(studentMobile)
     */
    private String studentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;


    // 각 필드의 setter 메서드
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    // 각 필드의 getter 메서드
    public String getStudentName() {
        return studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    // 기본 생성자
    public Student() {
        System.out.println("기본 생성자");
    }

    // 모든 필드를 매개변수로 하는 생성자
    public Student(String studentName, String studentNumber, String studentMajor, String studentMobile) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;

        System.out.println("studentName = " + studentName + ", studentNumber = " + studentNumber + ", studentMajor = " + studentMajor + ", studentMobile = " + studentMobile);
    }

    // 필드에 저장된 값을 출력하는 print() 메서드
    public void print() {
        System.out.println(getStudentName());
        System.out.println(getStudentNumber());
        System.out.println(getStudentMajor());
        System.out.println(getStudentMobile());
    }

    /**
     * method name : toString
     * return type : String
     * parameter : x
     */

    @Override
    public String toString() {
        return "Student{" +
                "studentName = " + studentName + ", " +
                "studentNumber = " + studentNumber + ", " +
                "studentMajor = " + studentMajor + "," +
                " studentMobile = " + studentMobile +"}";
    }
}
