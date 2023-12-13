package ch10_class.ex10;

import java.util.Scanner;

public class Member {
    /**
     * 회원 정보 클래스
     * 회원 정보
     * - 이메일(memberEmail)
     * - 비밀번호(memberPassword)
     * - 이름(memberName)
     * - 전화번호(memberMobile)
     * getter/setter
     * 생성자 2가지
     * 로그인 처리 메서드
     * name: memberLogin
     * parameter: memberEmail, memberPassword
     * return type: boolean
     * 실행내용: 이메일, 비밀번호가 일치하면 true,
     * 일치하지 않으면 false 리턴
     */

    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    Scanner scn = new Scanner(System.in);

    public Member() {
    }

    public Member(String memberEmail, String memberPassword) {
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;

        System.out.println("memberEmail = " + memberEmail + ", memberPassword = " + memberPassword);
    }

    public boolean memberLogin(String memberEmail, String memberPassword) {

        if (memberEmail.equals(getMemberEmail()) && memberPassword.equals(getMemberPassword())) {
//            System.out.println("로그인 완료");
            return true;
        } else {
//            System.out.println("정보가 일치하지 않습니다.");
            return false;
        }
    }


    @Override
    public String toString() {
        return "Member{" +
                "memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                ", scn=" + scn +
                '}';
    }
}
