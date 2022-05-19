package exceptionhandling.bsp2;

public class Account {

    private String owner;
    private double balance;
    private double overdraftFrame;

    public Account(String owner, double balance, double overdraftFrame) {
        this.owner = owner;
        this.balance = balance;
        this.overdraftFrame = overdraftFrame;
    }

    public void credit (double amount){
        this.balance += amount;
    }

    public void debit (double amount) throws NotEnoughMoneyException {
        if(amount > (this.balance + this.overdraftFrame))
            throw new NotEnoughMoneyException("Not enough money!");
        this.balance -= amount;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftFrame() {
        return overdraftFrame;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", overdraftFrame=" + overdraftFrame +
                '}';
    }
}
