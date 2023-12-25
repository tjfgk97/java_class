package ch12_classes.ex6.repository;

import ch12_classes.ex6.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private List<CommentDTO> commentDTOList;
    public CommentRepository(){
        commentDTOList = new ArrayList<>();
    }

    public List<CommentDTO> checkComment(Long searchId) {
        List<CommentDTO> commentDTOS = new ArrayList<>();
        for (int i = 0; i < commentDTOList.size(); i++) {
            if (searchId.equals(commentDTOList.get(i).getId())) {
                commentDTOS.add(commentDTOList.get(i));
            }
        }
        return commentDTOS;
    }


    public boolean addComment(CommentDTO commentDTO) {
        return commentDTOList.add(commentDTO);

    }
}

