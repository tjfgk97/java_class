package ch12_classes.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {

    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean join(MemberDTO memberDTO) {
        memberDTOList.add(memberDTO);
        return true;
    }


    public MemberDTO login(String loginEmail, String loginPw) {
        MemberDTO result = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                if (loginPw.equals(memberDTOList.get(i).getMemberPassword())) {
                    result = memberDTOList.get(i);
                }
            }
        }
        return result;
    }

    public MemberDTO searchList(Long id) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (id.equals(memberDTOList.get(i).getId())) {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }

    public boolean update(Long id, String upPhone) {
//  public boolean update(String loginedEmail, String upPhone){
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (id.equals(memberDTOList.get(i).getId())) {
//          if (loginedEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberMobile(upPhone);
                result = true;
            } else {
                System.out.println("회원 아이디가 일치하지 않습니다.");
                result = false;
            }
        }
        return result;
    }

    Scanner scn = new Scanner(System.in);

    public boolean withdrawal(String loginedeMail) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginedeMail.equals(memberDTOList.get(i).getId())) {
                System.out.println("비밀번호를 입력하세요.");
                String pw = scn.next();
                if (pw.equals(memberDTOList.get(i).getMemberPassword())) {
                    memberDTOList.remove(i);
                    result = true;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    result = false;
                }
            } else {
                System.out.println("아이디가 일치하지 않습니다.");
                result = false;
            }
        }
        return result;
    }

    public boolean logout(Long id) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (id.equals(memberDTOList.get(i).getId())) {
                result = true;
            } else {
                System.out.println("찾을 수 없는 아이디입니다.");
                result = false;
            }
        }
        return result;
    }


    public boolean check(String email) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email.equals(memberDTOList.get(i).getMemberEmail())) {
                result = true;
            }
        }
        return result;
    }

//    public boolean check(String email){
//            boolean result = true;
//            for (int i = 0; i < memberDTOList.size(); i++) {
//                if (email.equals(memberDTOList.get(i).getMemberEmail())) {
//                    // 중복되는 이메일이 있다 => 결과를 false로 주자
//                    result = false;
//                }
//            }
//            return result;
//        }
}
