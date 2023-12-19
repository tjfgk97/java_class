package ch12_classes.ex4;

import java.util.List;
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

        if (result) {
            System.out.println("글 작성 완료");
        } else {
            System.out.println("글 작성 실패");
        }

    }


    public void list() {
        List<BoardDTO> boardDTOList = boardRepository.list();

        if (boardDTOList != null) {
            System.out.println("boardDTO = " + boardDTOList);
        } else {
            System.out.println("입력하신 글 번호는 존재하지 않습니다.");
        }
    }


    public void search() {
        System.out.println("조회할 게시글의 번호를 입력하세요.");
        Long id = scn.nextLong();

        BoardDTO boardDTO = boardRepository.search(id);
        if (boardDTO != null) {
            System.out.println("boardDTO = " + boardDTO.getBoardContents());
        } else {
            System.out.println("존재하지 않는 게시글입니다.");
        }
    }

    public void update() {
        System.out.println("수정할 게시글의 번호를 입력하세요.");
        Long id = scn.nextLong();
        System.out.println("비밀번호를 입력하세요.");
        String uPw = scn.next();

        boolean result = boardRepository.update(id, uPw);

        if (result) {
            System.out.println("제목을 수정하세요.");
            String title = scn.next();
            System.out.println("내용을 수정하세요.");
            String content = scn.next();

            boardRepository.modify(id, title, content);
            System.out.println("회원정보가 수정되었습니다.");
        } else {
            System.out.println("회원정보 수정 실패");
        }
    }

    public void delete() {
        System.out.println("삭제할 게시글의 번호를 입력하세요.");
        Long id = scn.nextLong();

        boolean result = boardRepository.delete(id);

        if(result){
            System.out.println("게시글이 삭제되었습니다.");
        }else{
            System.out.println("게시글 삭제에 실패했습니다.");
        }
    }
}
