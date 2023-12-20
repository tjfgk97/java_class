package ch12_classes.ex5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientDTO {
    private Long id;
    private String clientName;
    private String accountNumber;
    private String clientPass;
    private String clientCreateAt;
    private long balance;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientPass() {
        return clientPass;
    }

    public void setClientPass(String clientPass) {
        this.clientPass = clientPass;
    }

    public String getClientCreateAt() {
        return clientCreateAt;
    }

    public void setClientCreateAt(String clientCreateAt) {
        this.clientCreateAt = clientCreateAt;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public ClientDTO(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private static Long idValue = 1L;
    public ClientDTO(String clientName, String accountNumber, String clientPass) {
        this.id = idValue++;
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.clientPass = clientPass;
        this.clientCreateAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", clientPass='" + clientPass + '\'' +
                ", clientCreateAt='" + clientCreateAt + '\'' +
                ", balance=" + balance +
                '}';
    }
}
