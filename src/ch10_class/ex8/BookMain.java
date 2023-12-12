package ch10_class.ex8;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookTitle("책 제목1");
        String title = book.getBookTitle();
        System.out.println("title = " + title);

        System.out.println(book.getBookTitle());

        book.setBookAuthor("책 저자1");
        String author = book.getBookAuthor();
        System.out.println("author = " + author);

        System.out.println(book.getBookAuthor());
    }
}
