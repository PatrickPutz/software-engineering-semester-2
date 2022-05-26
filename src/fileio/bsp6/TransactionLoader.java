package fileio.bsp6;

import java.io.*;
import java.util.ArrayList;

public class TransactionLoader {

    public static ArrayList<Transaction> loadTransactions(String path) throws TransactionLoadException {

        File file = new File(path);
        if(!file.exists())
            throw new TransactionLoadException("File does not exist!");

        ArrayList<Transaction> transactions = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line = br.readLine();
            int count = 1;

            while((line = br.readLine()) != null){
                count++;
                String[] columns = line.split(";");

                if(columns.length != 8)
                    throw new TransactionLoadException("Wrong format in line " + count + ", Content: " + line);

                    Transaction transaction = new Transaction(
                            columns[0],
                            columns[1],
                            Double.parseDouble(columns[2]),
                            columns[3],
                            columns[4],
                            columns[5],
                            columns[6],
                            columns[7]);

                    transactions.add(transaction);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transactions;
    }

}
