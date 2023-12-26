package ch13_map.ex02;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookService {
        Scanner scn = new Scanner(System.in);
        BookRepository bookRepository = new BookRepository();
    public void save() {
        System.out.println("책 제목을 입력하세요.");
        String title = scn.next();
        System.out.println("저자를 입력하세요.");
        String author = scn.next();
        System.out.println("가격을 입력하세요.");
        String price = scn.next();
        System.out.println("출판사를 입력하세요.");
        String publisher = scn.next();

        BookDTO bookDTO = new BookDTO(title, author, price, publisher);

        boolean result = bookRepository.save(bookDTO);
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    public void findAll() {
        Map<Long, BookDTO> bookDTOMap = bookRepository.findAll();
        for(Long i : bookDTOMap.keySet()){
            System.out.println(bookDTOMap.get(i));
            // 도서 제목만 본다면
            System.out.println(bookDTOMap.get(i).getBookTitle());
        }
    }

    public void findById() {
        System.out.println("조회할 아이디를 입력하세요.");
        Long id = scn.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if(bookDTO != null){
            System.out.println("bookDTO = " + bookDTO);
        }else {
            System.out.println("조회 결과가 없습니다.");
        }
    }

    public void update() {
        // 수정할 id를 입력받음
        // 해당 id 도서가 있다면 수정할 가격을 입력받고 수정 처리
        // 없으면 없다고 출력
        System.out.println("수정할 id를 입력하세요.");

        Long id = scn.nextLong();
        // ↓↓데이터의 재사용성↓↓
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("수정할 가격을 입력하세요.");
            String bookPrice = scn.next();
            boolean updateResult = bookRepository.update(id, bookPrice);
            if (updateResult) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }

        }
    }

    public void delete() {
        System.out.println("삭제할 아이디를 입력하세요.");
        Long id = scn.nextLong();
        boolean result = bookRepository.delete(id);
        if (result) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패");
        }

    }

    public void search() {
        System.out.println("검색어를 입력하세요.");
        String bookTitle = scn.next();
        List<BookDTO> bookDTOList = bookRepository.search(bookTitle);
        if (bookDTOList.size() > 0) {
            for (BookDTO bookDTO : bookDTOList) {
                System.out.println("bookDTO = " + bookDTO);
            }
        } else {
            // bookDTOList.size() == 0 => 결과가 없다
            System.out.println("검색 결과가 없습니다.");
        }
    }
}
