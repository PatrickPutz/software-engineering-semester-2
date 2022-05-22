package fileio.bsp1;

import java.io.*;

public class DataCopy {
    public static void main(String[] args) {

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("C:\\Studium\\temp\\er hörte leise.txt")));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("C:\\Studium\\temp\\copied.txt")))){

            int byteRead;
            while((byteRead = bis.read()) != -1){
                bos.write((char) byteRead);
                bos.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
