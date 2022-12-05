package Internationalization;


    import java.text.NumberFormat;
import java.util.Locale;

    public class Exanple2 {
        public static void main(String[] args) {
            double d1 = 123456.789;
            Locale india = new Locale("pa", "IN");
            NumberFormat nf = NumberFormat.getCurrencyInstance(india);
            System.out.println("India Notation is --->" + nf.format(d1));
            NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
            System.out.println("Italy Notation is --->" + nf1.format(d1));
            NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
            System.out.println("UK Notation is --->" + nf2.format(d1));
            NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println("US Notation is --->" + nf3.format(d1));
        }
    }

