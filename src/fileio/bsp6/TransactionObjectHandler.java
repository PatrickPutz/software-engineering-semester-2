package fileio.bsp6;

import java.io.*;
import java.util.ArrayList;

public class TransactionObjectHandler {

    public static void saveTransactions(ArrayList<Transaction> list, String path) throws TransactionObjectException {

        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {

            for (Transaction transaction : list) {
                oos.writeObject(transaction);
                oos.flush();
            }
            oos.writeObject(null);
            oos.flush();

        } catch (FileNotFoundException e) {
            throw new TransactionObjectException(e);
        } catch (IOException e) {
            throw new TransactionObjectException(e);
        }

    }

}
