package ch12_classes.ex6.service;

import ch12_classes.ex6.common.CommonVariables;
import ch12_classes.ex6.dto.MemberDTO;
import ch12_classes.ex6.repository.BoardRepository;
import ch12_classes.ex6.repository.CommentRepository;
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
            System.out.println(CommonVariables.loginEmail + " 님, 환영합니다!");
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
        if (CommonVariables.loginEmail != null) {
            System.out.println("이메일을 입력하세요.");
            String updateEmail = scn.next();
            System.out.println("비밀번호를 입력하세요.");
            String updatePw = scn.next();

            boolean result = memberRepository.update(updateEmail, updatePw);
            if (result) {
                System.out.println("수정할 비밀번호를 입력하세요.");
                String changePw = scn.next();
                System.out.println("수정할 이름을 입력하세요.");
                String changeName = scn.next();
                System.out.println("수정할 전화번호를 입력하세요.");
                String changePhone = scn.next();

                memberRepository.modify(updateEmail, changePw, changeName, changePhone);
                System.out.println("회원정보가 수정되었습니다.");
            } else {
                System.out.println("회원정보 수정 실패");
            }
        } else {
            System.out.println("로그인이 필요한 서비스입니다.");
        }
    }

    public void withdrawal() {
        if (CommonVariables.loginEmail != null) {
            System.out.println("정말 탈퇴하시겠습니까?");
            int ans = scn.nextInt();
            System.out.println("비밀번호를 입력하세요.");
            String withdrawalPw = scn.next();
            if (ans == 1) {
                MemberDTO memberDTO = memberRepository.login(CommonVariables.loginEmail, withdrawalPw);
                if (memberDTO != null) {
                    memberRepository.withdrawal(CommonVariables.loginEmail);
                    System.out.println("탈퇴가 완료되었습니다.");
                }
            }
        } else {
            System.out.println("로그인이 필요한 서비스입니다.");
        }
    }

    public void logout() {
        System.out.println("로그아웃할 이메일을 입력하세요.");
        String logoutEmail = scn.next();
        System.out.println("비밀번호를 입력하세요.");
        String logoutPw = scn.next();

        if (CommonVariables.loginEmail != null) {
            memberRepository.logout(logoutEmail, logoutPw);
            CommonVariables.loginEmail = null;
        }
    }

    public void inBoard() {
        BoardService boardService = new BoardService();
        if (CommonVariables.loginEmail != null) {
            Scanner scn = new Scanner(System.in);
            boolean run = true;
            int selectBoard = 0;

            while (run) {
                System.out.println("====== 게시판 ======");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.메인메뉴 ");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.print("선택>");
                selectBoard = scn.nextInt();

                if (selectBoard == 1) {
                    boardService.boardWrite();
                } else if (selectBoard == 2) {
                    boardService.boardList();
                } else if (selectBoard == 3) {
                    boardService.searchBoard();
                } else if (selectBoard == 4) {
                    boardService.boardUpdate();
                } else if (selectBoard == 5) {
                    boardService.boardDelete();
                } else if (selectBoard == 6) {
                    boardService.find();
                } else if (selectBoard == 99) {
                    boardService.sampleData();
                } else if (selectBoard == 0) {
                    System.out.println("메인으로 돌아갑니다.");
                    run = false;
                }
            }
        } else {
            System.out.println("로그인이 필요한 서비스입니다.");
        }
    }
}

