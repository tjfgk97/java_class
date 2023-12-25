package ch12_classes.ex6.repository;

import ch12_classes.ex6.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private static List<CommentDTO> commentDTOList = new ArrayList<>();


    public List<CommentDTO> checkComment(Long searchId) {
        List<CommentDTO> commentDTOS = new ArrayList<>();
        for (int i = 0; i < commentDTOList.size(); i++) {
            if (searchId.equals(commentDTOList.get(i).getBoardId())) {
                //searchId와 boardId를 비교해야하는데
                //그냥 id와 비교해서 값이 들어가지 않았던 것으로 추정
                commentDTOS.add(commentDTOList.get(i));
            }
        }
        return commentDTOS;
    }


    public boolean addComment(CommentDTO commentDTO) {
        return commentDTOList.add(commentDTO);

    }
}

