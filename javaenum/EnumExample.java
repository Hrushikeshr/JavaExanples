package javaenum;


enum Beer
{
    KF(100), KO(120), RC(150), FO;

    int price;

    Beer(int price)
    {
        this.price = price;
        System.out.println("Inside Constructor" + price);
    }

    Beer()
    {
        this.price = 130;
        System.out.println("Inside No Argument Constructor");
    }

    public int getPrice()
    {
        return price;
    }
}
public class EnumExample {
    public static void main(String arg[])
    {
        Beer[] b = Beer.values();
        for (Beer b1 : b)
        {
            System.out.println(b1 + " --> " + b1.getPrice());
        }
    }
}
