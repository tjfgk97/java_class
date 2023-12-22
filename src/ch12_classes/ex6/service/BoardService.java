package ch12_classes.ex6.service;

import ch12_classes.ex6.common.CommonVariables;
import ch12_classes.ex6.dto.BoardDTO;
import ch12_classes.ex6.dto.MemberDTO;
import ch12_classes.ex6.repository.BoardRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scn = new Scanner(System.in);

    public void boardWrite() {
        System.out.println("제목을 입력하세요.");
        String title = scn.next();
        System.out.println("내용을 입력하세요.");
        String content = scn.next();

        BoardDTO boardDTO = new BoardDTO(title, CommonVariables.loginEmail, content);
        boolean result = boardRepository.boardWrite(boardDTO);

        if (result) {
            System.out.println("글 작성 성공");
        } else {
            System.out.println("글 작성 실패");
        }
    }

    MemberDTO memberDTO = new MemberDTO();

    public void boardList() {
        List<BoardDTO> boardDTOList = boardRepository.boardList();
        if (boardDTOList != null) {
            System.out.println("boardDTOList = " + boardDTOList);
            listPrint(boardDTOList);
        } else {
            System.out.println("작성된 게시글이 없습니다.");
        }

    }

    private void listPrint(List<BoardDTO> boardDTOList) {
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("id = " + boardDTO.getId() + '\'' +
                    " Title = " + boardDTO.getBoardTitle() + '\'' +
                    " Writer = " + boardDTO.getBoardWriter() + '\'' +
                    " Contents = " + boardDTO.getBoardContents() + '\'' +
                    " hits = " + '\'' + boardDTO.getBoardHits() + '\'' +
                    " date = " + boardDTO.getCreatedAt());
        }
    }

    public void searchBoard() {
        System.out.println("조회할 게시글의 번호를 입력하세요.");
        Long searchId = scn.nextLong();

        BoardDTO boardDTO = boardRepository.searchBoard(searchId);
        if(boardDTO != null){
            System.out.println("boardDTO = " + boardDTO);
        }else {
            System.out.println("존재하지 않는 게시글입니다.");
        }

    }
}
