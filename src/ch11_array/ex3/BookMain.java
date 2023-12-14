package ch11_array.ex3;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {

        // Book 객체를 담기위한 bookList 객체 선언
        List<Book> bookList = new ArrayList<>();

        // 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가
        Book book1 = new Book();
//        book1.setId(1L);
        book1.setBookTitle("왜 아가리로만 할까?");
        book1.setBookAuthor("이수창");
        book1.setBookPrice("14800원");
        book1.setBookPublisher("들녘");

        bookList.add(book1);

        // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가
        Book book2 = new Book("전지적 푸바오 시점", "송영관", "19800원", "위즈덤하우스");
        bookList.add(book2);

        Book book3 = new Book("트렌드 코리아 2024", "김난도", "17000원", "미래의창");
        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("(for) bookList1 = " + bookList.get(i));
        }

        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book bList : bookList) {
            System.out.println("(foreach) bookList1 = " + bList);
        }

        // list의 0번 인덱스에 담긴 책의 가격을 50000으로 변경
        bookList.get(0).setBookPrice("50000");

        // list의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경
        bookList.get(1).setBookPublisher("안녕출판사");

        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList2 = " + bookList.get(i));
        }

        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book bList : bookList) {
            System.out.println("bookList2 = " + bList);
        }


    }
}
