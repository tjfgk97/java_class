package ch10_class.ex5;

import java.util.Arrays;

public class BookMain {
    public static void main(String[] args) {
        // 기본생성자로 객체 만들고 필드값 채우기
        Book book1 = new Book();
        book1.bookTitle = "누가 내 머리에 똥쌌어?";
        book1.bookAuthor = "베르너 홀츠바르트";
        book1.bookPublisher = "사계절";
        book1.isbn = "9788971964705";
        book1.bookPrice = 9500;

//        System.out.println("bookTitle = "+book1.bookTitle);
//        System.out.println("bookAuthor = "+book1.bookAuthor);
//        System.out.println("bookPublisher = "+book1.bookPublisher);
//        System.out.println("isbn = "+book1.isbn);
//        System.out.println("bookPrice = "+book1.bookPrice);
        System.out.println("-----------------------------------------");
        // 매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("왜 아가리로만 할까?","박정한");
//        System.out.println("bookTitle = "+book2.bookTitle);
//        System.out.println("bookAuthor = "+book2.bookAuthor);
        System.out.println("-----------------------------------------");

        // 모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book3 = new Book("실어증입니다, 일하기싫어증","양경수","오우아","9788954643009",18000);
//        System.out.println("bookTitle = "+book3.bookTitle);
//        System.out.println("bookAuthor = "+book3.bookAuthor);
//        System.out.println("bookPublisher = "+book3.bookPublisher);
//        System.out.println("isbn = "+book3.isbn);
//        System.out.println("bookPrice = "+book3.bookPrice);

    }
}
