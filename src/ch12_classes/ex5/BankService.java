package ch12_classes.ex5;

import java.util.Scanner;

public class BankService {

    BankRepository bankRepository = new BankRepository();
    Scanner scn = new Scanner(System.in);
    public void save() {
        System.out.println("이름을 입력하세요.");
        String name = scn.next();
        System.out.println("사용할 계좌번호를 입력하세요.");
        String account = scn.next();
        System.out.println("비밀번호를 입력하세요.");
        String pw = scn.next();

        ClientDTO clientDTO = new ClientDTO(name, account, pw);

//        boolean accountCheck = bankRepository.check(account);
//
//        if(!accountCheck){
//            System.out.println("이미 존재하는 계좌입니다. \n 다시 입력하세요.");
//        }

        boolean result = bankRepository.save(clientDTO);
        
        if(result){
            System.out.println("고객 등록 성공");
        }else {
            System.out.println("고객 등록 실패");
        }
    }

    public void inquiry() {
        System.out.println("계좌번호를 입력하세요.");
        String account = scn.next();

        ClientDTO clientDTO = bankRepository.inquiry(account);
        if(clientDTO != null){
            System.out.println("잔액 = "+clientDTO.getBalance()+"원");
        }else {
            System.out.println("존재하지 않는 계좌입니다.");
        }
    }

    public void deposit() {
        System.out.println("입금할 계좌번호를 입력하세요.");
        String account = scn.next();
        System.out.println("입금할 금액을 입력하세요.");
        long money = scn.nextLong();

//        AccountDTO accountDTO = new AccountDTO(account, money);
        ClientDTO clientDTO = new ClientDTO(account, money);
        boolean result = bankRepository.deposit(clientDTO);
    }
}
