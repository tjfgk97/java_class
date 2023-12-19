package ch12_classes.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardRepository {
    Scanner scn = new Scanner(System.in);
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
            if (id.equals(boardDTOList.get(i).getId())) {

                boardDTO = boardDTOList.get(i);
                boardDTO.setViews();
            }
        }
        return boardDTO;
    }

    public boolean update(Long id, String uPw) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                if (uPw.equals(boardDTOList.get(i).getBoardPass())) {
                    result = true;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    result = false;
                }
            }
        }
        return result;
    }


    public void modify(Long id, String title, String content) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.get(i).setBoardTitle(title);
                boardDTOList.get(i).setBoardContents(content);
            }
        }
    }

    public boolean delete(Long id) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                System.out.println("비밀번호를 입력하세요.");
                String dPw = scn.next();
                if (dPw.equals(boardDTOList.get(i).getBoardPass())) {
                    boardDTOList.remove(i);
                    result = true;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    result = false;
                }
            } else {
//                System.out.println("일치하는 아이디를 찾을 수 없습니다.");
                result = false;
            }
        }
        return result;
    }

    public List<BoardDTO> searchByTitle(String title) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(title)) {
                BoardDTO boardDTO = boardDTOList.get(i);
                boardDTOS.add(boardDTO);
            }
        }
        return boardDTOS;
    }
}
