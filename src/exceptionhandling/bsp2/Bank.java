package exceptionhandling.bsp2;

import java.util.HashMap;

public class Bank {

    private HashMap<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(String owner, double balance, double overdraftFrame) throws BankException {
        if(this.accounts.containsKey(owner))
            throw new BankException("Account exists already!");

        this.accounts.put(owner, new Account(owner, balance, overdraftFrame));
    }

    public void transfer(String fromOwner, String toOwner, double amount) throws AccountNotFoundException, BankException {
        if(!accounts.containsKey(fromOwner) || !accounts.containsKey(toOwner))
            throw new AccountNotFoundException("Account not found!");

        Account fromAccount = accounts.get(fromOwner);
        Account toAccount = accounts.get(toOwner);

        try{
            fromAccount.debit(amount);
            toAccount.credit(amount);
        } catch (NotEnoughMoneyException e) {
            throw new BankException("Transfer not possible!");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
