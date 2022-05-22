package fileio.bsp2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TextAnalysis {

    public static void main(String[] args) {

        HashMap<Character, Integer> signs = new HashMap<>();

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("C:\\Studium\\temp\\er hörte leise.txt")))){

            int byteRead;

            while((byteRead = bis.read()) != -1){
                if(!signs.containsKey((char) byteRead)){
                    signs.put((char) byteRead, 1);
                }
                else {
                    int value = signs.get((char) byteRead) + 1;
                    signs.put((char) byteRead, value);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : signs.entrySet()) {
            System.out.println(characterIntegerEntry);
        }

    }

}
