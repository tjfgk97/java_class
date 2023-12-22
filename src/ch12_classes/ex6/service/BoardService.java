package ch12_classes.ex6.service;

import ch12_classes.ex6.common.CommonVariables;
import ch12_classes.ex6.dto.BoardDTO;
import ch12_classes.ex6.dto.CommentDTO;
import ch12_classes.ex6.dto.MemberDTO;
import ch12_classes.ex6.repository.BoardRepository;
import ch12_classes.ex6.repository.CommentRepository;

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
//            System.out.println("boardDTOList = " + boardDTOList);
            listPrint(boardDTOList);
        } else {
            System.out.println("작성된 게시글이 없습니다.");
        }

    }

    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t" + "date\t");
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() + "\t" +
                    boardDTO.getBoardWriter() + "\t" + boardDTO.getBoardHits() + "\t" +
                    boardDTO.getCreatedAt() + "\t");
        }
    }

    
    public void searchBoard() {
        System.out.println("조회할 게시글의 번호를 입력하세요.");
        Long searchId = scn.nextLong();

        BoardDTO boardDTO = boardRepository.searchBoard(searchId);
        if (boardDTO != null) {
            System.out.println("boardDTO = " + boardDTO);

            CommentRepository commentRepository = new CommentRepository();
            System.out.println("====== 댓글 ======");
//            List<CommentDTO> commentDTOList = commentRepository.checkComment(searchId);
            
        } else {
            System.out.println("존재하지 않는 게시글입니다.");
        }

    }

    public void boardUpdate() {
        System.out.println("수정할 게시글의 번호를 입력하세요.");
        Long updateId = scn.nextLong();

        if (CommonVariables.loginEmail != null) {
            System.out.println("제목을 수정하세요.");
            String updateTitle = scn.next();
            System.out.println("내용을 수정하세요.");
            String updateContent = scn.next();

            boolean result = boardRepository.boardUpdate(updateId, updateTitle, updateContent);
            if (result) {
                System.out.println("수정이 완료되었습니다.");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("로그인이 필요한 서비스입니다.");
        }
    }

    public void boardDelete() {
        System.out.println("삭제할 게시글의 번호를 입력하세요.");
        Long deleteId = scn.nextLong();

        boolean result = boardRepository.boardDelete(deleteId);
        if (result) {
            System.out.println("게시글이 삭제되었습니다.");
        } else {
            System.out.println("삭제 실패");
        }
    }

    public void find() {
        System.out.println("검색할 키워드를 입력하세요.");
        String findTitle = scn.next();

        List<BoardDTO> boardDTOList = boardRepository.find(findTitle);

        if (boardDTOList.size() > 0) {
            for(BoardDTO boardDTO : boardDTOList) {
                System.out.println("boardDTO = " + boardDTOList);
            }
        } else {
            System.out.println("일치하는 키워드가 없습니다.");
        }
    }

    public void sampleData() {
        for (int i = 1; i < 11; i++) {
            BoardDTO boardDTO = new BoardDTO("title" + i, "writer" + i,"contents" + i);
            boardRepository.boardWrite(boardDTO);
        }
    }
}
