package ch12_classes.ex4;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {

    private static List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean write(BoardDTO boardDTO) {
        boardDTOList.add(boardDTO);
        return true;
    }
}
