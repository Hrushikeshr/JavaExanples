package lambada.expresion;

interface Sayable1{
    public String say(String message);
}

public class MultipleInputInLambda {

    public static void main(String[] args) {
        Sayable1 person = (message)->{
          String str1 = "I would like to say. ";
          String str2 = str1 + message;
          return str2;
        };

        System.out.println(person.say("Time is precious."));
    }
}
