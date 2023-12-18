package ch12_classes.ex3;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        boolean run = true;
        int select = 0;

        MemberService memberService = new MemberService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원 목록조회 | 4.회원 정보수정 | 5. 회원 탈퇴 | 6.로그아웃 | 7.종료");
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("번호를 선택하세요.");
            select = scn.nextInt();
            if (select == 1) {
                memberService.join();
            } else if (select == 2) {
                memberService.login();
            } else if (select == 3) {
                memberService.searchList();
            } else if (select == 4) {
                memberService.update();
            } else if (select == 5) {
                memberService.withdrawal();
            } else if (select == 6) {
                memberService.logout();
            } else if (select == 7) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }

        }
    }
}
