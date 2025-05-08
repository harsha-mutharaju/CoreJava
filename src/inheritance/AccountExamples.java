package inheritance;

import java.math.BigDecimal;

public class AccountExamples {
    public static void main(String[] args) {
        CheckingAccount checkingAccount =
                new CheckingAccount("CHK123", new BigDecimal("1000"));
        checkingAccount.debit(new BigDecimal("100"));
        checkingAccount.credit(new BigDecimal("200"));

        SavingsAccount savingAccount = new SavingsAccount("SAV123", new BigDecimal("2000"));
        savingAccount.credit(new BigDecimal("200"));

        checkingAccount.printAccountDetails();
        savingAccount.printAccountDetails();

        //polymorphism

        Account account2 = new CheckingAccount("CHK456", new BigDecimal("1500"));
        account2.credit(new BigDecimal("1500"));

        Account account3 = new SavingsAccount("SAV456", new BigDecimal("2500"));
        account3.credit(new BigDecimal("2500"));


        Account[] accounts = new Account[]{checkingAccount, savingAccount, account2, account3};
        calculateTotalBalance(accounts);

    }

    public static void calculateTotalBalance(Account[] accounts){
        BigDecimal totalBalance =  BigDecimal.ZERO;
        for(Account account : accounts) {
            totalBalance = totalBalance.add(account.getAccountBalance());
        }
        System.out.println("total balance is: " + totalBalance);
    }
}
