package ch12_classes.ex5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountDTO {

    private Long id;
    private String accountNumber;
    private String deposit;
    private String withdraw;
    private String bankingAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }

    public String getBankingAt() {
        return bankingAt;
    }

    public void setBankingAt(String bankingAt) {
        this.bankingAt = bankingAt;
    }

    public AccountDTO(String accountNumber, String deposit) {
        this.accountNumber = accountNumber;
        this.deposit = deposit;
    }

    public AccountDTO(String accountNumber, String deposit, String withdraw) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.bankingAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", deposit='" + deposit + '\'' +
                ", withdraw='" + withdraw + '\'' +
                ", bankingAt='" + bankingAt + '\'' +
                '}';
    }
}
