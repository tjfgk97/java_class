package ch12_classes.ex5;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {

    private static List<ClientDTO> clientDTOList = new ArrayList<>();
    private static List<AccountDTO> accountDTOList = new ArrayList<>();

    public boolean save(ClientDTO clientDTO) {
        clientDTOList.add(clientDTO);
        return true;
    }

//    public boolean check(String account) { //중복체크
//        boolean result = false;
//        for (int i = 0; i < clientDTOList.size(); i++) {
//            if(account.equals(clientDTOList.get(i).getAccountNumber())){
//               result = true;
//            }else{
//                result = false;
//            }
//        }
//        return result;
//    }

    public ClientDTO inquiry(String account) {
        ClientDTO clientDTO = null;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if(account.equals(clientDTOList.get(i).getAccountNumber())){
                clientDTO = clientDTOList.get(i);
            }
        }
        return clientDTO;
    }

    public boolean deposit(ClientDTO clientDTO) {
        clientDTOList.add(clientDTO);
        return true;
    }
}
