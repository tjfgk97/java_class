package ch12_classes.ex6.service;

import ch12_classes.ex6.common.CommonVariables;
import ch12_classes.ex6.dto.MemberDTO;
import ch12_classes.ex6.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Scanner scn = new Scanner(System.in);

    public void join() {
        String memberEmail = null;
        MemberDTO memberDTO = null;
        do {
            System.out.println("회원가입 메뉴");
            System.out.println("이메일을 입력하세요.");
            memberEmail = scn.next();
            memberDTO = memberRepository.emailCheck(memberEmail);
            if (memberDTO == null) {
                System.out.println("사용 가능한 이메일입니다.");
            } else {
                System.out.println("이미 사용 중인 이메일입니다.");
            }
        } while (memberDTO != null);
        System.out.println("비밀번호를 입력하세요.");
        String memberPw = scn.next();
        System.out.println("이름을 입력하세요.");
        String memberName = scn.next();
        System.out.println("전화번호를 입력하세요.");
        String memberPhone = scn.next();
        MemberDTO newMember = new MemberDTO(memberEmail, memberPw, memberName, memberPhone);
        boolean result = memberRepository.join(newMember);
        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    public void login() {
        System.out.println("로그인 메뉴");
        System.out.println("이메일을 입력하세요.");
        String loginEmail = scn.next();
        System.out.println("비밀번호를 입력하세요.");
        String loginPw = scn.next();

        MemberDTO loginCheck = new MemberDTO(loginEmail, loginPw);

        MemberDTO result = memberRepository.login(loginEmail, loginPw);
        if (result != null) {
            CommonVariables.loginEmail = loginEmail;
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void list() {
        List<MemberDTO> memberDTOList = memberRepository.list();
        for (int i = 0; i < memberDTOList.size(); i++) {
            System.out.println("bookDTO = " + memberDTOList.get(i));
        }
    }

    public void update() {
        System.out.println("수정할 이메일을 입력하세요.");
        String updateEmail = scn.next();
        System.out.println("비밀번호를 입력하세요.");
        String updatePw = scn.next();

        boolean result = memberRepository.update(updateEmail, updatePw);
        if(result){
            System.out.println("비밀번호를 수정하세요.");
            String changePw = scn.next();
            System.out.println("이름을 수정하세요.");
            String changeName = scn.next();
            System.out.println("전화번호를 수정하세요.");
            String changePhone = scn.next();

            memberRepository.modify(updateEmail, changePw, changeName, changePhone);
            System.out.println("회원정보가 수정되었습니다.");
        }else{
            System.out.println("회원정보 수정 실패");
        }
    }
}

