package ch12_classes.ex5;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {

    private static List<ClientDTO> clientDTOList = new ArrayList<>();
    private static List<AccountDTO> bankingDTOList = new ArrayList<>();

    public boolean save(ClientDTO clientDTO) {
        clientDTOList.add(clientDTO);
        return true;
    }

    public boolean check(String account) { //중복체크
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (account.equals(clientDTOList.get(i).getAccountNumber())) {
                System.out.println("이미 사용 중인 계좌번호입니다.");
            } else {
                System.out.println("사용 가능한 계좌번호입니다.");
                result = true;
            }
        }
        return result;
    }

    public ClientDTO inquiry(String account) {
        ClientDTO clientDTO = null;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (account.equals(clientDTOList.get(i).getAccountNumber())) {
                clientDTO = clientDTOList.get(i);
            }
        }
        return clientDTO;
    }

    public boolean deposit(ClientDTO clientDTO) {
        clientDTOList.add(clientDTO);
        return true;
    }

    public ClientDTO search(String account) {
        ClientDTO clientDTO = null;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (account.equals(clientDTOList.get(i).getAccountNumber())) {
                clientDTO = clientDTOList.get(i);
            }
        }
        return clientDTO;
    }


    public boolean pwCheck(String pw) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (pw.equals(clientDTOList.get(i).getClientPass())) {
                result = true;
            }
        }
        return result;
    }

    public void inNout(AccountDTO accountDTO) {
        bankingDTOList.add(accountDTO);
    }

    public List<AccountDTO> all(String account) {
        List<AccountDTO> accountDTOS = new ArrayList<>();
        for (int i = 0; i < bankingDTOList.size(); i++) {
            AccountDTO accountDTO = bankingDTOList.get(i);
            if (account.equals(accountDTO.getAccountNumber())) {
                System.out.println(accountDTO);
                accountDTOS.add(accountDTO);
            }
        }
        return accountDTOS;
    }


    public List<AccountDTO> deposit(String account) {
        List<AccountDTO> accountDTOS = new ArrayList<>();
        for (int i = 0; i < bankingDTOList.size(); i++) {
            AccountDTO accountDTO = bankingDTOList.get(i);
            if (account.equals(accountDTO.getAccountNumber())) {
                System.out.println(accountDTO);
                accountDTOS.add(accountDTO);
            }
        }
        return accountDTOS;
    }
}
