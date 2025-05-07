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

    }
}
