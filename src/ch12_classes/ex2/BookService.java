package ch12_classes.ex2;

import ch10_class.ex5.Book;

import java.util.List;
import java.util.Scanner;

public class BookService {
    /**
     * 도서등록 메서드
     * name: save
     * parameter: x
     * return: x
     * 실행내용
     * 스캐너로 도서명, 저자, 가격, 출판사정보를 입력받고
     * BookDTO 객체에 담아서 Repository로 전달하여 저장이 되도록 함
     * 등록 여부를 출력한다.(등록성공 or 등록실패)
     */

    BookRepository bookRepository = new BookRepository();

    public void save() {
        Scanner scn = new Scanner(System.in);
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

    /**
     * 도서목록 메서드
     * name: findAll
     * parameter: x
     * return: x
     * 실행내용
     * Repository로 부터 목록을 리턴 받아서 목록에 있는 모든 정보를 출력
     */

    public void findAll() {
        List<BookDTO> bookDTOList = bookRepository.findAll();
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println("bookDTO = " + bookDTO);
        }
    }

    /**
     * 도서조회 메서드
     * name: findById
     * parameter: x
     * return: x
     * 실행내용
     * id를 입력받고 Repository로 부터 id에 해당 하는 도서 정보를 출력
     * 없으면 없다고 출력
     */
    Scanner scn = new Scanner(System.in);

    Long id = 0L;

    public void findById() {
        System.out.println("아이디를 입력하세요.");
        System.out.print("입력>");
        id = scn.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("정보가 없습니다.");
        }

    }

    /**
     * 도서조회 메서드
     * name: findByTitle
     * parameter: x
     * return: x
     * 실행내용
     * 도서제목을 입력받고 Repository로 부터 해당 하는 도서 정보를 출력(제목이 정확히 일치하는 것만)
     * 없으면 없다고 출력
     */

    public void search() {
        System.out.print("검색어: ");
        String bookTitle = scn.next();
        List<BookDTO> bookDTOList = bookRepository.search(bookTitle);
        if (bookDTOList.size() > 0) {
            for (BookDTO bookDTO : bookDTOList) {
                System.out.println("bookDTO = " + bookDTO);
            }
        } else {
            // bookDTOList.size() == 0 => 결과가 없다
            System.out.println("검색 결과가 없습니다!");
        }
    }

    public void findByTitle() {
        System.out.println("검색할 책의 제목을 입력하세요.");
        System.out.print("입력>");
        String title = scn.next();
        List<BookDTO> bookDTO = bookRepository.findByTitle(title);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("요청하신 정보를 찾을 수 없습니다.");
        }
    }

    public void update() {
        // 수정할 id를 입력받음
        // 해당 id 도서가 있다면 수정할 가격을 입력받고 수정 처리
        // 없으면 없다고 출력
        System.out.println("수정할 id를 입력하세요.");
        Long id = scn.nextLong();
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
}
