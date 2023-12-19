package ch12_classes.ex4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex_Date {
    public static void main(String[] args) {
        // 날짜정보 다루기
        // 현재 시간 확인
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        // 날짜 데이터를 원하는 형식으로 다루기
        String year = now.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("year = " + year);
        String month = now.format(DateTimeFormatter.ofPattern("MM"));
        System.out.println("month = " + month);
        String day = now.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("day = " + day);
        String hour = now.format(DateTimeFormatter.ofPattern("HH"));
        System.out.println("hour = " + hour);
        String minute = now.format(DateTimeFormatter.ofPattern("mm"));
        System.out.println("minute = " + minute);
        String second = now.format(DateTimeFormatter.ofPattern("ss"));
        System.out.println("second = " + second);
        String createAt = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("createAt = " + createAt);
    }
}
