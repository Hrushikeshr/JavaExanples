package java8features;

import java.util.Base64;
public class EncryptionExample {
        public static void main(String[] args) {
        // Getting encoder
        Base64.Encoder encoder = Base64.getEncoder();
        // Creating byte array
        byte byteArr[] = {1,2,3};
        // encoding byte array
        byte byteArr2[] = encoder.encode(byteArr);
        System.out.println("Encoded byte array: "+byteArr2);
        byte byteArr3[] = new byte[5];                
        int x = encoder.encode(byteArr,byteArr3);    // Returns number of bytes written
        System.out.println("Encoded byte array written to another array: "+byteArr3);
        System.out.println("Number of bytes written: "+x);

        // Encoding string
        String str = encoder.encodeToString("Hrushikesh".getBytes());
        System.out.println("Encoded string: "+str);
        // Getting decoder
        Base64.Decoder decoder = Base64.getDecoder();
        // Decoding string
        String dStr = new String(decoder.decode(str));
        System.out.println("Decoded string: "+dStr);
        }
        }
