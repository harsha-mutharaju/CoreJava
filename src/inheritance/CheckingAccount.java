package inheritance;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
    private BigDecimal cashBackRate = new BigDecimal("10");
    public CheckingAccount(String accountNumber, BigDecimal accountBalance) {
        super(accountNumber, accountBalance);
    }

    //method overriding
    @Override
    public void debit(BigDecimal amountToDebit){
        //this will call the debit method in Account class
        super.debit(amountToDebit);

        BigDecimal amountToCredit =
                amountToDebit.multiply(cashBackRate).divide(new BigDecimal("100"));
        super.credit(amountToCredit);



    }

    @Override
    public void printAccountDetails() {

        System.out.println("Account Number " + getAccountNumber());
        System.out.println("Account Balance " + getAccountBalance());
        System.out.println("Cash back rate  " + cashBackRate);
    }



}
