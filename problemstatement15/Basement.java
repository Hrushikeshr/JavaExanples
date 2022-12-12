package problemstatement15;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Basement extends Thread implements Serializable {
    private Scanner sc = new Scanner(System.in);

    public void parking() {
        //ArrayList for bike and car
        ArrayList<Integer> bikesList = new ArrayList<>();
        ArrayList<Integer> carsList = new ArrayList<>();

        //Map for storing vehicle Number..
        HashMap<Integer,String>bike=new HashMap<Integer,String>();
        for(int i=1;i<=15;i++)
        {
            bike.put(i," basement 1");
        }
        HashMap<Integer,String>car=new HashMap<Integer,String>();
        for(int j=1;j<=15;j++)
        {
            car.put(j, "basement 2");
        }

        //Loop for running multiple time.
        char ch;
        do {
            System.out.println("Enter which vehicle you want to park 1 for bike and 2 for cars: ");
            int num = sc.nextInt();

            switch (num){
                case 1 ->{
                    System.out.println("enter your bike number");
                    int bikeNo=sc.nextInt();

                    if(bikesList.contains(bikeNo))
                    {
                        System.out.println("This vehicle slot is already allocated...");

                    }
                    else {
                        bikesList.add(bikeNo);
                        System.out.println("Available slots are: ");
                        for (Map.Entry value : bike.entrySet()) {
                            System.out.println(value.getKey());
                        }

                        System.out.println("Enter the slot number!");
                        int slotNo = sc.nextInt();
                        if (bike.containsKey(slotNo)) {
                            System.out.println("Your slot is allocated.");
                            bike.remove(slotNo);
                        } else {
                            System.out.println("This slot is not available!");
                        }
                    }
                }
                case 2 ->{
                    System.out.println("Enter Your Car Number...");
                    int carNo = sc.nextInt();
                    if (carsList.contains(carNo)){
                        System.out.println("This vehicle is already allocated a slot: ");
                    }
                    else {
                        carsList.add(carNo);
                        System.out.println("Available Slots are: ");
                        for (Map.Entry value : car.entrySet()){
                            System.out.println(value.getKey());
                        }
                        System.out.println("Enter Slot Number you want to park your car:");
                        int carSlot = sc.nextInt();
                        if (car.containsKey(carSlot)){
                            System.out.println("Your Slot is Allocated:");
                            car.remove(carSlot);
                        }
                        else {
                            System.out.println("This slot is allocated:");
                        }
                    }
                }
                default -> System.out.println("Please enter valid Number: 1 or 2");

            }
            System.out.println("Enter y for continue and n of exit: ");
            ch = sc.next().trim().charAt(0);
        }while (ch == 'y');



    }

    @Override
    public void run() {
        parking();
        super.run();
    }

}
