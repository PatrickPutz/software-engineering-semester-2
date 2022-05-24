package fileio.bsp4;

import java.io.*;
import java.util.ArrayList;

public class AddressManager {

    private ArrayList<Address> addresses;

    public AddressManager() {
        this.addresses = new ArrayList<>();
    }

    public void add(Address a){
        this.addresses.add(a);
    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException {
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            br.readLine(); // ignore first line
            String line;

            while((line = br.readLine()) != null){
                String[] csvData = line.split(separator);

                if(csvData.length != 4)
                    throw new AddressLoadWrongFormatException("Wrong format!");
                else{
                    String firstname = csvData[0];
                    String lastname = csvData[1];
                    String mobileNumber = csvData[2];
                    String email = csvData[3];

                    this.addresses.add(new Address(firstname, lastname, mobileNumber, email));
                }
            }

        } catch (FileNotFoundException e) {
            throw new AddressLoadException("File not found!");
        } catch (IOException e) {
            throw new AddressLoadException("Something went wrong!");
        } catch (AddressLoadWrongFormatException e) {
            e.printStackTrace();
        }
    }

    public void exportToCsv(String path, String separator){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

            for (Address address : addresses) {
                String[] a = {address.getFirstname(), address.getLastname(), address.getMobileNumber(), address.getEmail()};
                oos.writeObject(address);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }
}
