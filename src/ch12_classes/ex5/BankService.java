package ch12_classes.ex5;

import java.util.List;
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

        bankRepository.check(account);

        boolean result = bankRepository.save(clientDTO);

        if (result) {
            System.out.println("고객 등록 성공");
        } else {
            System.out.println("고객 등록 실패");
        }
    }

    public void inquiry() {
        System.out.println("계좌번호를 입력하세요.");
        String account = scn.next();

        ClientDTO clientDTO = bankRepository.inquiry(account);
        if (clientDTO != null) {
            System.out.println(clientDTO.getClientName() + " 님의 잔액은 " + clientDTO.getBalance() + "원입니다.");
        } else {
            System.out.println("존재하지 않는 계좌입니다.");
        }
    }

    public void deposit() {
        System.out.println("입금할 계좌번호를 입력하세요.");
        String account = scn.next();
        ClientDTO clientDTO = bankRepository.search(account);

        if (clientDTO != null) {
            System.out.println("입금할 금액을 입력하세요.");
            int money = scn.nextInt();
            int newMoney = clientDTO.getBalance();
            clientDTO.setBalance(newMoney += money);
            System.out.println("입금 완료");
            int out = 0;
            AccountDTO accountDTO = new AccountDTO(account, money, out);
            bankRepository.inNout(accountDTO);
        } else {
            System.out.println("요청하신 계좌 정보를 찾을 수 없습니다.");
        }
    }

    public void withdraw() {
        System.out.println("출금할 계좌번호를 입력하세요.");
        String account = scn.next();
        ClientDTO clientDTO = bankRepository.search(account);

        if (clientDTO != null) {
            System.out.println("비밀번호를 입력하세요.");
            String pw = scn.next();
            boolean result = bankRepository.pwCheck(pw);
            if (result) {
                System.out.println("출금액을 입력하세요.");
                int money = scn.nextInt();
                int out = clientDTO.getBalance();
                int in =0;
                AccountDTO accountDTO = new AccountDTO(account, in, money);
                bankRepository.inNout(accountDTO);
                if (money > out) {
                    System.out.println("잔액이 부족합니다.");
                } else {
                    System.out.println("출금 완료");
                    clientDTO.setBalance(out -= money);
                }
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
            }
        } else {
            System.out.println("요청하신 계좌 정보를 찾을 수 없습니다.");
        }

    }

    public void history() {
        System.out.println("계좌번호를 입력하세요.");
        String account = scn.next();
        ClientDTO clientDTO = bankRepository.search(account);

        if (clientDTO != null) {
            boolean run = true;
            int select = 0;
            while (run) {
                System.out.println("--------------------------------------");
                System.out.println("1.전체내역 | 2.입금내역 | 3.출금내역 | 4.종료");
                System.out.println("--------------------------------------");
                System.out.println("번호를 선택하세요.");
                System.out.print("입력>");
                select = scn.nextInt();

                if (select == 1) {
                    System.out.println("전체 내역을 출력합니다.");
                    List<AccountDTO> accountDTO = bankRepository.all(account);
                    System.out.println("accountDTO = " + accountDTO);
                } else if (select == 2) {
                    System.out.println("입금 내역을 출력합니다.");
                } else if (select == 3) {
                    System.out.println("출금 내역을 출력합니다.");
                } else if (select == 4) {
                    System.out.println("입출금 내역 조회를 종료합니다.");
                    run = false;
                }
            }
        }
    }
}