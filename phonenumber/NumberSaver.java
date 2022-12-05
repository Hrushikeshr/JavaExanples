package phonenumber;

public class NumberSaver {

    private String name;
    private int phNo1;
    private int phNo2;
    public void contactSaver(String name, int phNo1, int phNo2){
        this.name = name;
        this.phNo1 = phNo1;
        this.phNo2 = phNo2;

        System.out.println("Your contact have been saved.");
        System.out.println(name +" : " + phNo1 + ", " + phNo2);
    }
    public void contactSaver(String name, int phNo1){
        this.name = name;
        this.phNo1 = phNo1;
        System.out.println("Your contact have been saved.");

        System.out.println(name +" : " + phNo1);
    }


}
