package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {

        boolean run = true;

        Scanner scn = new Scanner(System.in);

        int[] student = null;
        int i;

        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------------");

            System.out.print("선택>");
            int insert = scn.nextInt();

            if (insert == 1) {
                System.out.print("학생수>");
                student = new int[scn.nextInt()];
            } else if (insert == 2) {
                for (i = 0; i < student.length; i++) {
                    System.out.print((i + 1) + "번 학생 점수 : ");
                    int num = scn.nextInt();
                    student[i] = num;
                }
            } else if (insert == 3) {
                for (i = 0; i < student.length; i++) {
                    System.out.println((i + 1) + "번 학생 점수 : " + student[i]);
                }
            } else if (insert == 4) {
                double sum = 0;
                double avg = 0;
                int max = 0;

                for (i = 0; i < student.length; i++) {
                    if (student[i] > max) {
                        max = student[i];
                    }
                }
                System.out.println("최고 점수는 " + max + "점입니다.");

//          ----최고 점수---------------------------------------------------------

                for (i = 0; i < student.length; i++) {

                    sum += student[i];
                    avg = sum / student.length;
                }
                System.out.println("평균 점수는 " + avg + "점입니다.");

//          ----평균 점수---------------------------------------------------------

                for (i = 0; i < student.length; i++) {
                    for (int j = 0; j < student.length; j++) {
                        if (student[i] > student[j]) {
                            int emp = student[i];
                            student[i] = student[j];
                            student[j] = emp;
                        }
                    }
                }
                for (i = 0; i < student.length; i++) {
                    System.out.println((i + 1) + "등 : " + student[i]);
                }
//          ----오름차순---------------------------------------------------------
                
            } else if (insert == 5) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }
        }
    }
}
