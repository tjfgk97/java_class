package ch12_classes.ex6.repository;

import ch12_classes.ex6.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

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
                }else{
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    result = false;
                }
            }
        }
        return result;
    }

    public void modify(String updateEmail, String changePw, String changeName, String changePhone) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(updateEmail.equals(memberDTOList.get(i).getMemberEmail())){
                memberDTOList.get(i).setMemberPassword(changePw);
                memberDTOList.get(i).setMemberName(changeName);
                memberDTOList.get(i).setMemberMobile(changePhone);
            }
        }
    }
}
