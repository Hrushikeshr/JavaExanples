package question;

public class Circle extends Shape{
    double PI = 3.14;
    public void area(int r){
        System.out.println(PI*r*r);
    }
    public void perimeter(int r){
        System.out.println(2*PI*r);
    }
}
