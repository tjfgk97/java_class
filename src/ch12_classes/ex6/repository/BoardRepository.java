package ch12_classes.ex6.repository;

import ch12_classes.ex6.dto.BoardDTO;
import ch12_classes.ex6.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {

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
            if(searchId.equals(boardDTOList.get(i).getId())){
                boardDTO = boardDTOList.get(i);
                boardDTO.setBoardHits();
            }
        }
        return boardDTO;
    }
}
