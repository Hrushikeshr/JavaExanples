package exceptionaassignment;

import cj6.InSuffientFundException;

public class Projo {

    public String checkEmployeeDetails(int empId){


        switch (empId){
            case 1->{
                String empName = "Suresh";
                String addressOfEmp = "Hyderbad";

                return "Welcome Mr. "+ empName;
            }
            case 2->{
                String empName = "Ramesh";
                String addressOfEmp = "Cuttack";
                return "Welcome Mr. "+ empName;
            }
            case 3->{
                String empName = "Rajesh";
                String addressOfEmp = "Bhubaneswar";
                return "Welcome Mr. "+ empName;
            }
            case 4->{
                String empName = "Rakesh";
                String addressOfEmp = "Delhi";
                return "Welcome Mr. " + empName;
            }
            default -> {
                try
                {
                    throw new InvalidEmployeeId("Invalid employee id...");
                }
                catch (InvalidEmployeeId e)
                {
                    e.getMessage();
                }
            }

        }
        return "";
    }
}
