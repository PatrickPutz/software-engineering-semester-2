package fileio.bsp6;

import java.util.ArrayList;
import java.util.HashMap;

public class TransactionManager {

    private ArrayList<Transaction> transactions;

    public TransactionManager(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public HashMap<String, Integer> getTransactionCountByCity(){
        HashMap<String, Integer> result = new HashMap<>();

        for (Transaction transaction : transactions) {

            if(!result.containsKey(transaction.getCity()))
                result.put(transaction.getCity(), 1);
            else
                result.put(transaction.getCity(), result.get(transaction.getCity()) + 1);

        }

        return result;
    }

    public Integer getCountOfTransactions(String country){
        int count = 0;

        for (Transaction transaction : transactions) {
            if(transaction.getCountry().equals(country))
                count +=1;
        }

        return count;
    }

    public ArrayList<Transaction> getTransactionsToProduct(String product){
        ArrayList<Transaction> result = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if(transaction.getProduct().equals(product))
                result.add(transaction);
        }

        return result;
    }

    public HashMap<String, Double> getAverageTransactionAmountByPaymentType(){
        HashMap<String, Double> result = new HashMap<>();
        HashMap<String, ArrayList<Transaction>> map = getTransactionsByPaymentType();

        for (String paymentType : map.keySet()) {
            ArrayList<Transaction> transactions = map.get(paymentType);

            double sum = 0.0;
            for (Transaction transaction : transactions) {
                sum += transaction.getPrice();
            }
            result.put(paymentType, sum/transactions.size());
        }

        return result;
    }

    private HashMap<String, ArrayList<Transaction>> getTransactionsByPaymentType(){
        HashMap<String, ArrayList<Transaction>> result = new HashMap<>();

        for (Transaction transaction : transactions) {
            if(!result.containsKey(transaction.getPaymentType())){
                ArrayList<Transaction> transactions = new ArrayList<>();
                transactions.add(transaction);
                result.put(transaction.getPaymentType(), transactions);
            }
            else{
                ArrayList<Transaction> transactions = result.get(transaction.getPaymentType());
                transactions.add(transaction);
                result.put(transaction.getPaymentType(), transactions);
            }
        }

        return result;
    }
}
