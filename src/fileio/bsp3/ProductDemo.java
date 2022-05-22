package fileio.bsp3;

public class ProductDemo {

    public static void main(String[] args) {

        ProductManager pm = new ProductManager();
        pm.add(new Product("Laptop", 1200.0, "Consumer-Goods"));
        pm.add(new Product("Golf 8", 39_512.9, "Automobile"));
        pm.add(new Product("Banana", 2.89, "Fruits"));

        try {
            pm.save("C:\\Studium\\temp\\productmanager.dat");
        } catch (ProductFileException e) {
            e.printStackTrace();
        }

        ProductManager pm2 = new ProductManager();
        System.out.println("loading entries...");
        try {
            pm2.load("C:\\Studium\\temp\\productmanager.dat");
        } catch (ProductFileException e) {
            e.printStackTrace();
        }

    }

}
