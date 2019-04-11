package service;

import model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.BankAccountRepository;

@Service
public class BankAccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountRepository.insertBankAccount(bankAccount);
    }

    public void transferMoney(String fromIBAN, String toIBAN, double amount) {
        BankAccount fromBankAccount = bankAccountRepository.getBankAccount(fromIBAN);
        BankAccount toBankAccount = bankAccountRepository.getBankAccount(toIBAN);

        if (fromBankAccount != null && toBankAccount != null) {
            double fromBankBalance = fromBankAccount.getBalance();
            double toBankBalance = toBankAccount.getBalance();

            fromBankAccount.setBalance(fromBankBalance - amount);
            toBankAccount.setBalance(toBankBalance + amount);
        }
    }
}
