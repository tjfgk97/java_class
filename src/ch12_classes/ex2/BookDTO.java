package ch12_classes.ex2;

public class BookDTO {
    /**
     도서 클래스
     필드
     도서관리번호(id) - Long 타입
     도서명(bookTitle)
     저자(bookAuthor)
     가격(bookPrice)
     출판사(bookPublisher)
     필드에 대한 getter/setter
     생성자 2가지
     도서 등록은 매개변수 있는 생성자로만 할 수 있음.(id는 자동으로 하나씩 증가)
     toString method
     */

    private Long id;
    private String bookTitle;
    private String bookAuthor;
    private String bookPrice;
    private String getBookPublisher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getGetBookPublisher() {
        return getBookPublisher;
    }

    public void setGetBookPublisher(String getBookPublisher) {
        this.getBookPublisher = getBookPublisher;
    }

    public BookDTO(){

    }

        private static Long idValue = 1L;

    public BookDTO(String bookTitle, String bookAuthor, String bookPrice, String getBookPublisher) {
        this.id = idValue++;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.getBookPublisher = getBookPublisher;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", getBookPublisher='" + getBookPublisher + '\'' +
                '}';
    }
}
