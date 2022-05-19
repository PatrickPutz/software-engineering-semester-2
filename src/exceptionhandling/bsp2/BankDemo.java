package exceptionhandling.bsp2;

public class BankDemo {

    public static void main(String[] args) {

        Bank bank = new Bank();

        try{
            bank.addAccount("Susan", 500,500);
            bank.addAccount("Max", 3000, 1000);

            System.out.println(bank);

            bank.transfer("Susan", "Max", 100);
            bank.transfer("Max", "Susan", 750);

            System.out.println(bank);

            bank.transfer("Susan", "Max", 1_000_000);

        } catch (BankException e) {
            e.printStackTrace();
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
        }

    }

}
