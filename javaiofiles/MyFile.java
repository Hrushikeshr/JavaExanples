package javaiofiles;

import java.io.File;
import java.io.IOException;

public class MyFile {

    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        //If the connection Exit The main should be Exicute.
        System.out.println(f.createNewFile());
        System.out.println(f.exists());
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(f.exists());
    }
}
