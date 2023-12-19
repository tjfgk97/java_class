package ch12_classes.ex4;

import java.util.Scanner;

public class BoardService {

    BoardRepository boardRepository = new BoardRepository();

    Scanner scn = new Scanner(System.in);
    public void write() {
        System.out.println("제목을 입력하세요.");
        String title = scn.next();
        System.out.println("작성자를 입력하세요.");
        String writer = scn.next();
        System.out.println("내용을 입력하세요.");
        String content = scn.next();
        System.out.println("비밀번호를 입력하세요.");
        String pw = scn.next();

        BoardDTO boardDTO = new BoardDTO(title, writer, content, pw);
        boolean result = boardRepository.write(boardDTO);
        
        if(result){
            System.out.println("글 작성 완료");
        }else {
            System.out.println("글 작성 실패");
        }

    }
}
