package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable {
    String name = "java";

    String website = "oracle.com";
}

public class MySerialization {
    public static void main(String arg[]) throws Exception {
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            Test test1 = new Test();
            System.out.println("Serialization started");
            FileOutputStream fos = new FileOutputStream("abc.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(test1);
            System.out.println("Serialization ended");
            System.out.println("Deserialization started");
            fis = new FileInputStream("abc.ser");
            ois = new ObjectInputStream(fis);
            Test test2 = (Test) ois.readObject();
            System.out.println("Deserialization ended");
            System.out.println(test2.name + " ---> " + test2.website);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != oos) {
                oos.close();
            }
            if (null != fis) {
                fis.close();
            }
            if (null != ois) {
                ois.close();
            }
        }
    }
}
