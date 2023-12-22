package ch12_classes.ex6.repository;

import ch12_classes.ex6.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public MemberDTO emailCheck(String email) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (email.equals(memberDTOList.get(i).getMemberEmail())) {
                return memberDTOList.get(i);
            }
        }
        return null;
    }

    public boolean join(MemberDTO newMember) {
        return memberDTOList.add(newMember);
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

    public List<MemberDTO> list() {
        return memberDTOList;
    }

    public boolean update(String updateEmail, String updatePw) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (updateEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                if (updatePw.equals(memberDTOList.get(i).getMemberPassword())) {
                    result = true;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    result = false;
                }
            }
        }
        return result;
    }

    public void modify(String updateEmail, String changePw, String changeName, String changePhone) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (updateEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberPassword(changePw);
                memberDTOList.get(i).setMemberName(changeName);
                memberDTOList.get(i).setMemberMobile(changePhone);
            }
        }
    }

    Scanner scn = new Scanner(System.in);

    public boolean withdrawal(String loginEmail) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                System.out.println("다시한번 비밀번호를 입력하세요.");
                String pw = scn.next();
                if (pw.equals(memberDTOList.get(i).getMemberPassword())) {
                    memberDTOList.remove(i);
                    result = true;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean logout(String logoutEmail, String logoutPw) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (logoutEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                if (logoutPw.equals(memberDTOList.get(i).getMemberPassword())) {
                    result = true;
                    System.out.println("로그아웃이 완료되었습니다."); //코드 진행 후 완료 메세지를 찍어줘야한다. 순서 주의!
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else {
                System.out.println("요청하신 정보를 찾을 수 없습니다.");
            }
        }
        return result;
    }
}
