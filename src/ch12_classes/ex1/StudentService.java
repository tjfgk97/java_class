package ch12_classes.ex1;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();
    Scanner scn = new Scanner(System.in);

    /**
     * method name : method1
     * parameter : x
     * return : x
     */

    public void method1() {
        System.out.println("StudentService.method1");
        studentRepository.method1();
    }

    public void method2() {
        System.out.println("StudentService.method2");
        String str1 = "집에 가고싶다.";
        studentRepository.method2(str1);
    }

    /**
     * StudentDTO 객체를 생성하고
     * Repository의 method3으로 DTO 객체를 전달함
     */

    public void method3() {
        System.out.println("StudentService.method3");
        StudentDTO studentDTO = new StudentDTO("학생3", "231215", "체육학", "010-3333-3333");
        boolean result = studentRepository.method3(studentDTO);
        System.out.println("result = " + result);
        if (result) {
            System.out.println("학생등록 성공");
        } else {
            System.out.println("학생등록 실패");
        }
    }

    /**
     * Repository로부터 List를 리턴받아 for문으로 출력
     */

    public void method4() {
        List<StudentDTO> studentDTOList = studentRepository.method4();
        for (StudentDTO studentDto : studentDTOList) {
            System.out.println("studentDto = " + studentDto);
        }
    }

    /**
     * 조회할 id를 입력받고
     * id를 Repository로 전달하고
     * repository로부터 id에 해당하는 학생정보를 리턴받고
     * 학생정보를 출력
     */
    public void method5() {
        System.out.println("조회할 아이디를 입력하세요.");
        System.out.print("입력>");
        Long id = scn.nextLong();
        StudentDTO studentDTO = studentRepository.method5(id);
        if (studentDTO != null) {
            // 조회결과 있음
            System.out.println("studentDTO = " + studentDTO);
        } else {
            //조회 결과 없음
            System.out.println("요청하신 정보를 찾을 수 없습니다.");
        }
    }
}
