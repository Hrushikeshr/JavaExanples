package Serialization;
import java.io.*;

public class SerializableDemo1 {
    public static void main(String arg[]) throws Exception {
        Dog d = new Dog();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d1 = (Dog) ois.readObject();
        System.out.println(d1.c.r.name);
        System.out.println("W");
    }
}
