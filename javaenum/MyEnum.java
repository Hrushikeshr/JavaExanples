package javaenum;


enum Month{
    JANUARY, FEBRUARY, MARCH, MAY, APRIL, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}
enum Cost{
    SILVER, GOLD, PLATINUM, DIAMOND;
}
public class MyEnum {
    public static void main(String[] args) {
        //1st way to print enum
        Month mon = Month.AUGUST;
//        System.out.println(mon);

        //2nd way to print enum
        Cost b1 = Cost.DIAMOND;
        switch (b1)
        {
            case SILVER:
                System.out.println("SILVER");
                break;
            case GOLD:
                System.out.println("GOLD ");
                break;
            case PLATINUM:
                System.out.println("PLATINUM");
                break;
            default:
                System.out.println("Too cost");
        }

        //3rd way to print enum

        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println( month+ " - " +month.ordinal());
        }
    }
}
