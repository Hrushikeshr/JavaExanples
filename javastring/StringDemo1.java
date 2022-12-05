package javastring;

public class StringDemo1 {
    public static void main(String[] args) {
        // String Concatenation
        String s1 = "rishi" + "Rout";
        System.out.println(s1);
        // String concatenation happens inside the memory.
        String s2 = (new StringBuilder()).append("Sachin").append("Tendulkar").toString();
        System.out.println(s2);

        String s3 = "pratik";
        s3 = s3.concat("kumar");
        System.out.println(s3);

        s2.concat("kumar");
        System.out.println(s2);

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append("java");
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("Hello ");
        sb2.append("Java");
        System.out.println(sb2);


        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.append("Mr. Hrushikesh");
        System.out.println(sb3);

        // This program is going to the main method
    }




}
