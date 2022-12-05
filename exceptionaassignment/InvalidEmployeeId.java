package exceptionaassignment;

public class InvalidEmployeeId extends Exception{
    public InvalidEmployeeId(String s)
    {
        super(s);
    }

    public InvalidEmployeeId()
    {
        super();
    }
}
