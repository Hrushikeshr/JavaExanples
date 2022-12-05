package cj6;

public class CustomizedExceptionDemo {
    public static void main(String[] args)
    {
        int amount = 500;
        if (amount < 100)
        {
            try
            {
                throw new InSuffientFundException("check your balance...");
            }
            catch (InSuffientFundException e)
            {
                e.printStackTrace();
            }
        }
        if (amount >= 100)
        {
            System.out.println(" balance is sufficient");
        }
    }
}
