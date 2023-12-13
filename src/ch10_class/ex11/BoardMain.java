package ch10_class.ex11;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {

        /**
         * 메뉴
         * 1. 글작성(매개변수 있는 생성자이용)
         *      글작성 정보는 스캐너로 받음. 글번호도 같이 입력함.
         * 2. 글조회
         *      글번호를 입력 받고 Board 클래스의 findById로 글번호를 넘긴다.
         * 3. 종료
         */
        boolean run = true;
        int selectNo = 0;

        Long id;

        Scanner scn = new Scanner(System.in);
        Board board = new Board();

        while (run) {
            System.out.println("----------------------------");
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.println("----------------------------");
            System.out.print("선택> ");

            selectNo = scn.nextInt();

            if (selectNo == 1) { //글작성

                System.out.println("글번호를 입력하세요.");
                id = scn.nextLong();

                System.out.println("제목을 입력하세요.");
                String title = scn.next();

                System.out.println("작성자를 입력하세요.");
                String writer = scn.next();

                System.out.println("내용을 입력하세요.");
                String contents = scn.next();

                board.setId(id);
                board.setBoardTitle(title);
                board.setBoardWriter(writer);
                board.setBoardContents(contents);
                board.setBoardHits(0);

            } else if (selectNo == 2) { //글조회
                System.out.println("조회할 글의 번호를 입력하세요.");
                id = scn.nextLong();

                board.findById(id);

            } else if (selectNo == 3) { //종료
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }
        }
    }
}