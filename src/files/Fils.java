package files;

import java.io.File;
import java.io.IOException;

public class Fils {
    public static void main(String[] args) {
        String filsName = "pliki.txt";
        File fils = new File(filsName);
        boolean filsExist = fils.exists();
        if (!filsExist){
            try {
                filsExist = fils.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("plik nie soztał utworzony ");
            }
        } if(filsExist){
            System.out.println("plik utworzony poprawnie");
        }
    }
}
