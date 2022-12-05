package Internationalization;

import java.util.Locale;

public class ExampleOfIN {
    public static void main(String arg[]) {
        Locale loc = Locale.getDefault();
        System.out.println("Country is : " + loc.getCountry() + "Language is -->" + loc.getLanguage());
        System.out.println("Display Country is : " + loc.getDisplayCountry() + "Display Language is -->"
                + loc.getDisplayLanguage());
        Locale loc2 = new Locale("pa", "IN");
        Locale.setDefault(loc2);
        String str[] = Locale.getISOLanguages();
        System.out.println("ISO Languages are : ");
        for (String str1 : str) {
            System.out.println(str1);
        }
        String str2[] = Locale.getISOCountries();
        System.out.println("ISO Countries are : ");
        for (String str3 : str2) {
            System.out.println(str3);
        }
        Locale loc3[] = Locale.getAvailableLocales();
        System.out.println("Available Locales are : ");
        for (Locale loc4 : loc3) {
            System.out.println("Display Country is : " + loc4.getDisplayCountry() + "Display Language is -->"
                    + loc4.getDisplayLanguage());
        }
    }
}
