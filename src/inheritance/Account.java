package inheritance;

import java.math.BigDecimal;

public abstract class Account {
    private String accountNumber;

    private BigDecimal accountBalance;

    public Account(String accountNumber, BigDecimal accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    protected void debit(BigDecimal amountToDebit){
        this.accountBalance = this.accountBalance.subtract(amountToDebit);
    }

    protected void credit(BigDecimal amountToCredit){
        this.accountBalance = this.accountBalance.add(amountToCredit);
    }

    public abstract void printAccountDetails();

}
