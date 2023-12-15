package ch12_classes.ex1;

import java.util.List;

public class StudentService {
    /**
     * method name : method1
     * parameter : x
     * return : x
     */

    StudentRepository studentRepository = new StudentRepository();
    public void method1(){
        System.out.println("StudentService.method1");
        studentRepository.method1();
    }
    public void method2(){
        System.out.println("StudentService.method2");
        String str1 = "집에 가고싶다.";
        studentRepository.method2(str1);
    }

    /**
     * StudentDTO 객체를 생성하고
     * Repository의 method3으로 DTO 객체를 전달함
     */

    public void method3(){
        System.out.println("StudentService.method3");
        StudentDTO studentDTO = new StudentDTO("학생3","231215","체육학","010-3333-3333");
        boolean result = studentRepository.method3(studentDTO);
        System.out.println("result = "+result);
        if(result){
            System.out.println("학생등록 성공");
        }else{
            System.out.println("학생등록 실패");
        }
    }

    /**
     * Repository로부터 List를 리턴받아 for문으로 출력
     *
     */

    public void method4(){
        List<StudentDTO> studentDTOList = studentRepository.method4();
        for (StudentDTO studentDto: studentDTOList){
            System.out.println("studentDto = " + studentDto);
        }
    }

}
