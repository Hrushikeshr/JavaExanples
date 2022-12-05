package Serialization;

import java.io.*;

public class Dog implements Serializable {
//    Cat c = new Cat();
transient Cat c = new Cat();

    private void writeObject(ObjectOutputStream os) throws IOException {
        int x = c.j;
//        os.writeInt;
        os.writeInt(1);
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        is.defaultReadObject();
        int k = is.readInt();
        c = new Cat();
        c.j = k;
    }
}
