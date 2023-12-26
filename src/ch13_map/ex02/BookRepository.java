package ch13_map.ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository {
    private static Map<Long, BookDTO> bookDTOMap = new HashMap<>();

    public boolean save(BookDTO bookDTO) {
        System.out.println("bookDTO = " + bookDTO);
        BookDTO dto = bookDTOMap.put(bookDTO.getId(), bookDTO);
        System.out.println("dto = " + dto);
        if(dto == null){
            return true;
        }else {
            return false;
        }
    }

    public Map<Long, BookDTO> findAll() {
        return bookDTOMap;
    }

    public BookDTO findById(Long id) {
        // map에서 조회하려는 id와 일치하는 것을 찾아서 bookDTO 객체 리턴
        for (Long i : bookDTOMap.keySet()){
            if(id.equals(bookDTOMap.get(i).getId())){
                return bookDTOMap.get(i);
            }
        }
        return null;
    }

    public boolean update(Long id, String bookPrice) {
        for (Long i : bookDTOMap.keySet()){
            if(id.equals(bookDTOMap.get(i).getId())){
                bookDTOMap.get(i).setBookPrice(bookPrice);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Long id) {
        for (Long i : bookDTOMap.keySet()){
            if (id.equals(bookDTOMap.get(i).getId())){
                bookDTOMap.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<BookDTO> search(String bookTitle) {
        //검색결과를 담을 list 선언
        List<BookDTO> bookDTOList = new ArrayList<>();
        for (Long i : bookDTOMap.keySet()){
            if(bookDTOMap.get(i).getBookTitle().contains(bookTitle)){
                bookDTOList.add(bookDTOMap.get(i));
            }
        }
        return bookDTOList;
        //return을 if문 안에서 하면 하나의 데이터를 찾음과 동시에
        //return을 하기 때문에 list 출력이 안된다.
    }
}
