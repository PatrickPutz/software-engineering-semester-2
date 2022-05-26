package fileio.bsp6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void main(String[] args) throws TransactionLoadException, TransactionObjectException {

        ArrayList<Transaction> transactions = new TransactionLoader().loadTransactions(".\\data\\transactions.csv");
        Collections.sort(transactions, new PriceProductComparator());

        for (Transaction transaction : transactions) {
            System.out.println(transaction.toString());
        }

        TransactionObjectHandler.saveTransactions(transactions, ".\\data\\transactionoutput.csv");

        TransactionManager tm = new TransactionManager(transactions);
        HashMap<String, Integer> TransactionCountByCity = tm.getTransactionCountByCity();
        for (Map.Entry<String, Integer> stringIntegerEntry : TransactionCountByCity.entrySet()) {
            System.out.println(stringIntegerEntry);
        }

        HashMap<String, Double> AverageTransactionAmountByPaymentType = tm.getAverageTransactionAmountByPaymentType();
        for (Map.Entry<String, Double> stringDoubleEntry : AverageTransactionAmountByPaymentType.entrySet()) {
            System.out.println(stringDoubleEntry);
        }

        ArrayList<Transaction> TransactionsToProduct = tm.getTransactionsToProduct("Product3");
        for (Transaction transaction : TransactionsToProduct) {
            System.out.println(transaction);
        }

        System.out.println(tm.getCountOfTransactions("United States"));
    }

}
