package ch13_map.ex03;

import java.util.*;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();
    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();

    public boolean check(String email) {
        for (Long i : memberDTOMap.keySet()){
            if(email.equals(memberDTOMap.get(i).getMemberEmail())){
                return false;
            }
        }
        return true;
    }


    public boolean join(MemberDTO memberDTO) {
        MemberDTO dto = memberDTOMap.put(memberDTO.getId(), memberDTO);
        if(dto == null){
            return true;
        }else {
            return false;
        }
    }

    public MemberDTO login(String loginEmail, String loginPw) {
        MemberDTO memberDTO = null;
        for (Long i : memberDTOMap.keySet()){
            if(loginEmail.equals(memberDTOMap.get(i).getMemberEmail())){
                if(loginPw.equals(memberDTOMap.get(i).getMemberPassword())){
                    memberDTO = memberDTOMap.get(i);
                    //return memberDTOMap.get(i);
                }
            }
        }
        return memberDTO;
        // return null;
    }

    public Map<Long, MemberDTO> searchList(){
        return memberDTOMap;
    }

//    public List<MemberDTO> searchList(Long id) {
//        List<MemberDTO> memberDTOS = new ArrayList<>();
//        for (Long i : memberDTOMap.keySet()){
//            if(id.equals(memberDTOMap.get(i).getId())){
//                memberDTOS.add(memberDTOMap.get(i));
//            }
//        }
//        return memberDTOS;
//    }

    public boolean update(Long id, String upPhone) {
        for (Long i : memberDTOMap.keySet()){
            if(id.equals(memberDTOMap.get(i).getId())){
                memberDTOMap.get(i).setMemberMobile(upPhone);
                return true;
            }
        }
        return false;
    }

    Scanner scn = new Scanner(System.in);
    public boolean withdrawal(String loginedEmail, String pw) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()){
            if(loginedEmail.equals(memberDTOMap.get(i).getMemberEmail())){
                if(pw.equals(memberDTOMap.get(i).getMemberPassword())){
                    memberDTOMap.remove(i);
                    result = true;
                }else {
                    result = false;
                }
            }else {
                result = false;
            }
        }
        return result;
    }
}
