package ch12_classes.ex3;

import java.util.Scanner;

public class MemberService {

    MemberRepository memberRepository = new MemberRepository();
    Scanner scn = new Scanner(System.in);

    public void join() {

        String email = "";
        boolean run = true;
        while(run) {
            System.out.println("이메일을 입력하세요.");
            email = scn.next();

            boolean result = memberRepository.check(email);

            if (!result) { // result = false이면 중복X
                run = false; // 이메일 중복체크 통과
            } else {
                System.out.println("이미 사용 중인 이메일입니다."+"\n");
            }
        }

        System.out.println("비밀번호를 입력하세요.");
        String pw = scn.next();
        System.out.println("이름을 입력하세요.");
        String name = scn.next();
        System.out.println("전화번호를 입력하세요.");
        String phone = scn.next();


        MemberDTO memberDTO = new MemberDTO(email, pw, name, phone);

        boolean result1 = memberRepository.join(memberDTO);
        if (result1) {
            System.out.println("회원가입 완료");
        } else {
            System.out.println("회원가입 실패");

        }
    }

    private static String loginedEmail = null;

    public void login() {
        System.out.println("이메일을 입력하세요.");
        String loginEmail = scn.next();
        System.out.println("비밀번호를 입력하세요.");
        String loginPw = scn.next();

        MemberDTO memberDTO = new MemberDTO(loginEmail, loginPw);

        boolean result = memberRepository.login(loginEmail, loginPw);
        if (result) {
            loginedEmail = loginEmail;
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void searchList() {
        System.out.println("조회하실 회원의 아이디를 입력하세요.");
        Long id = scn.nextLong();

        MemberDTO memberDTO = memberRepository.searchList(id);
        if (memberDTO != null) {
            System.out.println("memberDTO = " + memberDTO);
        } else {
            System.out.println("요청한 정보를 찾을 수 없습니다.");
        }

    }

    public void update() {
        System.out.println("회원 아이디를 입력하세요.");
        Long id = scn.nextLong();


        if (loginedEmail != null) {
            System.out.println("수정할 전화번호를 입력하세요.");
            String upPhone = scn.next();
            memberRepository.update(id, upPhone);
        } else {
            System.out.println("로그인이 필요한 서비스입니다.");
        }
    }

    public void withdrawal() {
        System.out.println("탈퇴할 아이디를 입력하세요.");
        Long id = scn.nextLong();

        if (loginedEmail != null) {
            memberRepository.withdrawal(id);
        } else {
            System.out.println("요청하신 정보를 찾을 수 없습니다.");
        }
    }

    public void logout() {
        System.out.println("로그아웃할 아이디를 입력하세요.");
        Long id = scn.nextLong();

        if (loginedEmail != null) {
            memberRepository.logout(id);
            loginedEmail = null;
            System.out.println("로그아웃이 완료되었습니다.");
        }
    }


}
