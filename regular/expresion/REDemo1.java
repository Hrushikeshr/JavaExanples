package regular.expresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class REDemo1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome Java");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

    }
}