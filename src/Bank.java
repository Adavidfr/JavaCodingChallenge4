import java.util.ArrayList;
import java.util.List;

public class Bank {

    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(String accountNumber, String holder, double balance) {
        BankAccount bankAccount = new BankAccount(accountNumber, holder, balance);
        accounts.add(bankAccount);
    }

    public List<BankAccount> listAllAccounts() {
        return new ArrayList<>(accounts);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new IllegalArgumentException("Account not found with the number: " + accountNumber);
    }

    public void removeAccount(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        accounts.remove(account);

//      Another method
//       accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));

    }

    public void transfer(String fromAccount, String toAccount, double amount) throws Exception {
        BankAccount sourceAccount = findAccount(fromAccount);
        BankAccount targetAccount = findAccount(toAccount);

        if (sourceAccount == null) {
            throw new Exception("Source account not found: " + fromAccount);
        }

        if (targetAccount == null) {
            throw new Exception("Target account not found: " + toAccount);
        }

        if (!sourceAccount.withdraw(amount)) {
            throw new Exception("Insufficient funds in source account: " + fromAccount);
        }

        targetAccount.deposit(amount);

    }
}
