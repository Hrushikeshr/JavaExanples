package regular.expresion;
// Write a Regular Expression to defined java identifier
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REDemo2 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-zA-Z-$][a-zA-Z0-9_$]*");
        Matcher m=p.matcher(args[4]);
        while(m.find()){
            if(m.group().equals(args[4])){
                System.out.println("Valid Identifier");
            }else{
                System.out.println("Invalid Identifier");
            }
        }
    }
}
