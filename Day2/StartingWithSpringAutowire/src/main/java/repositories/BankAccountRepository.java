package repositories;

import model.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {
    private List<BankAccount> bankAccountList = new ArrayList<>();

    public void insertBankAccount(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public ArrayList<BankAccount> getAllBank() {
        return (ArrayList<BankAccount>) bankAccountList;
    }

    public BankAccount getBankAccount(String IBAN) {
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getIBAN().equals(IBAN) == true) {
                return bankAccount;
            }
        }
        return null;
    }
}
