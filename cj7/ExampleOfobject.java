package cj7;

public class ExampleOfobject implements Cloneable{

    int rollno;

    ExampleOfobject(int rollno){
        this.rollno=rollno;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        ExampleOfobject exampleOfobject = new ExampleOfobject(2);
        System.out.println(exampleOfobject.rollno);
        ExampleOfobject e2 = (ExampleOfobject)exampleOfobject.clone();
        System.out.println(e2.rollno);
        
    }


}
