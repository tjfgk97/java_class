package ch12_classes.ex4;

import ch12_classes.ex3.MemberService;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        boolean run = true;
        int select = 0;

        BoardService boardService = new BoardService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("1.글 작성 | 2.글 목록 | 3.글 조회 | 4.글 수정 | 5.글 삭제 | 6.검색 | 7.테스트데이터 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("번호를 선택하세요.");
            System.out.print("입력>");
            select = scn.nextInt();

            if (select == 1) {
                boardService.write();
            } else if (select == 2) {
                boardService.list();
            } else if (select == 3) {
                boardService.list();
                boardService.search();
            } else if (select == 4) {
                boardService.update();
            } else if (select == 5) {
                boardService.delete();
            } else if (select == 6) {
                boardService.searchByTitle();
            } else if (select == 7) {
                boardService.testData();
            } else if (select == 0) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }

        }
    }
}