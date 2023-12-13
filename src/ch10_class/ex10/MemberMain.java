package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         *      회원가입 정보는 스캐너로 받음.
         * 2. 로그인
         * 3. 종료
         */

        boolean run = true;

        String email = "";
        String pw = "";
        String name = "";
        String mobile = "";

        Member member = new Member();
        Scanner scn = new Scanner(System.in);
        
        while(run){

            System.out.println("번호를 입력하세요.");
            System.out.print("선택>");
            int select = scn.nextInt();


            if(select == 1){
                System.out.println("이메일을 입력하세요");
                email = scn.next();
                System.out.println("비밀번호를 입력하세요");
                pw = scn.next();
                System.out.println("이름을 입력하세요");
                name = scn.next();
                System.out.println("전화번호를 입력하세요");
                mobile = scn.next();

                member.setMemberEmail(email);
                member.setMemberPassword(pw);
                member.setMemberName(name);
                member.setMemberMobile(mobile);

                //기본생성자와 setter를 이용해서 정보 저장(회원가입)

            } else if (select == 2) {
                System.out.println("이메일을 입력하세요.");
                String loginEmail = scn.next();
                System.out.println("비밀번호를 입력하세요.");
                String loginPw = scn.next();

                boolean loginResult = member.memberLogin(loginEmail,loginPw);
                if(loginResult){
                    System.out.println("로그인 성공");
                }else {
                    System.out.println("로그인 실패");
                }


            } else if (select == 3) {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }
        }

    }
}
