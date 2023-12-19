package ch12_classes.ex4;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {

    private static List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean write(BoardDTO boardDTO) {
        boardDTOList.add(boardDTO);
        return true;
    }

    public List<BoardDTO> list() {
//        BoardDTO boardDTO = null;

        return boardDTOList;
    }

    public BoardDTO search(Long id) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if(id.equals(boardDTOList.get(i).getId())){

                boardDTO = boardDTOList.get(i);
                boardDTO.setViews();
            }
        }
        return boardDTO;
    }
}
