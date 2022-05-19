package exceptionhandling.bsp2;

public class BankException extends Exception{
    public BankException() {
    }

    public BankException(String message) {
        super(message);
    }
}
