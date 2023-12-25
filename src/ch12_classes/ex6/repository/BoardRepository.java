package ch12_classes.ex6.repository;

import ch12_classes.ex6.dto.BoardDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardRepository {

    Scanner scn = new Scanner(System.in);

    List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean boardWrite(BoardDTO boardDTO) {
        boardDTOList.add(boardDTO);
        return true;
    }

    public List<BoardDTO> boardList() {
        return boardDTOList;
    }

    public BoardDTO searchBoard(Long searchId) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (searchId.equals(boardDTOList.get(i).getId())) {
                boardDTO = boardDTOList.get(i);
                boardDTO.setBoardHits();
            }
        }
        return boardDTO;
    }

    public boolean boardUpdate(Long updateId, String updateTitle, String updateContent) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (updateId.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).setBoardTitle(updateTitle);
                boardDTOList.get(i).setBoardContents(updateContent);
                result = true;
                break;
            } else {
                System.out.println("존재하지 않는 게시글입니다.");
//                result = false;
            }
        }
        return result;
    }


    public boolean boardDelete(Long deleteId) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (deleteId.equals(boardDTOList.get(i).getId())) {
                boardDTOList.remove(i);
                result = true;
            } else {
                result = false;
                System.out.println("존재하지 않는 게시글입니다.");
            }
        }
        return result;
    }

    public List<BoardDTO> find(String findTitle) {
//        BoardDTO boardDTO = null;
        List<BoardDTO> boardDTOList1 = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(findTitle)) {
                BoardDTO boardDTO = boardDTOList.get(i);
                boardDTOList1.add(boardDTO);
            }
        }
        return boardDTOList1;
    }
}
