package ch12_classes.ex1;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    // 모든 학생정보를 관리하는 저장소 역할의 리스트
    // 저장, 수정, 삭제 등의 처리는 Repository에서만 이루어지도록 하기 위해 private
    // 값을 계속 유지하기 위해 static

    private static List<StudentDTO> studentDTOList = new ArrayList<>();

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
     * method name : method3
     * parameter : StudentDTO
     * return : boolean
     * 실행 내용 : 전달받은 DTO 객체를 List에 저장하고 객체를 리턴
     */
    public boolean method3(StudentDTO studentDTO) {
        System.out.println("StudentRepository.method3");
        studentDTOList.add(studentDTO);
        return true;
    }

    /**
     * return type : List
     */
    public List<StudentDTO> method4() {
        return studentDTOList;
    }

    StudentDTO studentDTO = new StudentDTO();

    public StudentDTO method5(Long id) {
        StudentDTO studentDTO = null;
        for (int i = 0; i < studentDTOList.size(); i++) {
            if (id.equals(studentDTOList.get(i).getId())) {
                studentDTO = studentDTOList.get(i);
            }
        }
        return studentDTO;
    }
}
