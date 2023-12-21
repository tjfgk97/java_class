package ch12_classes.ex6;

import ch12_classes.ex6.dto.MemberDTO;
import ch12_classes.ex6.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        MemberService memberService = new MemberService();
        boolean run = true;
        int select = 0;

        while (run) {
            System.out.println("====== 회원관리 ======");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료 ");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("선택>");
            select = scn.nextInt();

            if (select == 1) {
                memberService.join();
            } else if (select == 2) {
                memberService.login();
            } else if (select == 3) {
                memberService.list();
            } else if (select == 4) {
                memberService.update();
            } else if (select == 5) {
                memberService.withdrawal();
            } else if (select == 6) {

            } else if (select == 7) {

            } else if (select == 0) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }
        }
    }
}
