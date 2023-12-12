package ch10_class.ex8;

public class Book {

    private String bookTitle;
    private String bookAuthor;

    //bookTitle setter
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle(){
        return bookTitle;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }
}
